package DZ_2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        int num1;
        int num2;
        try (Scanner scan = new Scanner(System.in)) {
            num1 = scan.nextInt();
            num2 = inNum(scan.nextInt());
            System.out.println("Результат  " + num1 / num2);
        } catch (DivisionByZeroException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    public static int inNum(int num) throws DivisionByZeroException {
        if (num == 0) {
            throw new DivisionByZeroException("Деление на ноль недопустимо");
        }
        return num;
    }
}

class DivisionByZeroException extends Exception {
    public DivisionByZeroException(String message) {
        super(message);
    }
}
