package DZ_3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Bank {
    public double countOut = 1000;
    public double countIn = 500;

    public static void main(String[] args) {

        Bank bank = new Bank();

        try {
            System.out.println(bank.countOut);
            System.out.println(bank.countIn);
            double trans = getInputNumber("Введите сумму перевода: ");
            tranzactions(trans, bank);

        } catch (InputMismatchException e) {
            System.out.println("Ошибка: Число введено некорректно");
        } catch (InvalidAmountException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } catch (InsufficientFundsException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } finally {
            System.out.println(bank.countOut);
            System.out.println(bank.countIn);
        }
    }

    private static double getInputNumber(String prompt) throws InputMismatchException {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.nextDouble();
    }

    public static void tranzactions(double tr, Bank bank) throws InvalidAmountException, InsufficientFundsException {
        if (tr <= 0) throw new InvalidAmountException("Некорректная сумма перевода.");
        if (bank.countOut - tr < 0) throw new InsufficientFundsException("Недостаточно средств на счете");
        bank.countOut -= tr;
        bank.countIn += tr;
    }
}

class InvalidAmountException extends Exception {
    public InvalidAmountException(String masage) {
        super(masage);
    }
}

class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String masage) {
        super(masage);
    }
}