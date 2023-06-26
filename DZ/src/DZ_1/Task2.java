package DZ_1;

import java.util.EmptyStackException;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String b = scan.nextLine();
        try {
            int a = Integer.parseInt(b);
            System.out.println("Возраст  " + a);
        } catch (NumberFormatException e) {
            System.out.println("Некорректный ввод");
        }
    }
}
