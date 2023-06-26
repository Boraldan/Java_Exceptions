package DZ_1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javax.annotation.processing.FilerException;
import java.io.FileReader;

public class Task3 {
    public static void main(String[] args) {

        int sum = 0;
//        File file = new File("C:\\_Alex\\_IT\\myRepo\\Java_exceptions\\DZ\\dz1.txt");
        File file = new File("DZ\\dz1.txt");

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                sum += Integer.parseInt(line);
                System.out.println(sum);
            }
        } catch (NumberFormatException e) {
        System.out.println("Некорректное значение числа в файл");
    }
        catch (IOException e) {
            e.printStackTrace();

        }
    }
}