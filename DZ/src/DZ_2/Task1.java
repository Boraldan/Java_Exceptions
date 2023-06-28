package DZ_2;
// Задача 1:
//Напишите программу, которая запрашивает у пользователя число и проверяет, является ли оно положительным.
// Если число отрицательное или равно нулю, программа должна выбрасывать исключение InvalidNumberException
// с сообщением "Некорректное число". В противном случае, программа должна выводить сообщение "Число корректно".

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int num;
        try (Scanner scan = new Scanner(System.in)) {
            num = inNum(scan.nextInt());
            System.out.println(num + " Корректное число");
        } catch (InvalidNumberException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    public static int inNum(int num) throws InvalidNumberException {
        if (num < 1) {
            throw new InvalidNumberException("Некорректное число");
        }
        return num;
    }

}

class InvalidNumberException extends Exception {
    public InvalidNumberException(String message) {
        super(message);
    }
}

