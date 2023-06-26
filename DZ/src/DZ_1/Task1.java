package DZ_1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int a, b, c;
        a = scan.nextInt();
        b = scan.nextInt();

        try {
            System.out.println("Равно = " + a / b);
        } catch (ArithmeticException e) {
            System.out.println("Делить на ноль нельзя.");
        }
    }
}