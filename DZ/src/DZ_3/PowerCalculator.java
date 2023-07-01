package DZ_3;
// Задача1. Напишите программу-калькулятор, которая запрашивает у пользователя два числа и выполняет операцию
// возведения первого числа в степень второго числа. Если введены некорректные числа или происходит деление
// на ноль, необходимо обработать соответствующие исключения и вывести информативное сообщение об ошибке.
//Важно! С использованием принципа одного уровня абстракции!
//**В этой задаче мы создаем класс PowerCalculator, который содержит метод calculatePower(), выполняющий операцию
// возведения числа в степень. Если введено некорректное основание (ноль) и отрицательная степень, выбрасывается
// исключение InvalidInputException.
//
//В методе main() мы запрашиваем у пользователя основание и показатель степени, вызываем метод calculatePower()
// и выводим результат. Если введены некорректные числа или происходит ошибка ввода, соответствующие исключения
// перехватываются и выводится информативное сообщение об ошибке.
//
//Обратите внимание, что в этой задаче мы использовали собственное исключение InvalidInputException, чтобы явно
// указать на некорректный ввод. Это помогает разделить обработку ошибок на соответствующие уровни абстракции.**

import java.util.InputMismatchException;
import java.util.Scanner;

public class PowerCalculator {
    public static void main(String[] args) {
        try {
            double a = getInputNumber("Введите число основания: ");
            double b = getInputNumber("Введите число степени: ");
            double result = calculatePower(a, b);
            System.out.println("Результат: " + result);
        } catch (InputMismatchException e) {
            System.out.println("Ошибка: Число введено некорректно");
        } catch (InvalidInputException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    private static double getInputNumber(String prompt) throws InputMismatchException {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.nextDouble();
    }

    public static double calculatePower(double a, double b) throws InvalidInputException {
        if (a == 0) throw new InvalidInputException("Основание не должно быть нулевым.");
        if (b < 0) throw new InvalidInputException("Степень должна быть больше нуля");
        return Math.pow(a, b);
    }
}
class InvalidInputException extends Exception {
    public InvalidInputException(String mesage) {
        super(mesage);
    }
}