package DZ_2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        int num1;
        int num2;
        int num3;
        try (Scanner scan = new Scanner(System.in)) {
            num1 = scan.nextInt();
            if (num1 > 100) throw new NumberOutOfRangeException("Первое число вне допустимого диапазона");
            num2 = scan.nextInt();
            if (num2 < 0) throw new NumberOutOfRangeException("Второе число вне допустимого диапазона");
            if (num1 + num2 < 10) throw new NumberSumException("Сумма первого и второго чисел слишком мала");
            num3 = scan.nextInt();
            if (num3 == 0) throw new DivisionByZeroException2("Деление на ноль недопустимо");

            System.out.println("Проверка пройдена успешно");

        } catch (DivisionByZeroException2 | NumberOutOfRangeException | NumberSumException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}

class DivisionByZeroException2 extends Exception {
    public DivisionByZeroException2(String message) {
        super(message);
    }
}

class NumberOutOfRangeException extends Exception {
    public NumberOutOfRangeException(String message) {
        super(message);
    }
}

class NumberSumException extends Exception {
    public NumberSumException(String message) {
        super(message);
    }
}