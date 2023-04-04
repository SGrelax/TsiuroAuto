package Homework1;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Check();

    }

    public static void Check() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер масива");
        int legend = scanner.nextInt();
        int[] array = new int[legend];

        int count = 0;
        System.out.println("Введите числа:");
        for (int i = 0; i < legend; i++) {
            array[i] = scanner.nextInt();
            System.out.println(Arrays.toString(array));

            if (array[i] % 2 == 0) {
                count++;
            }
            System.out.println("count = " + count);


        }
    }
}
