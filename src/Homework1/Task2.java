package Homework1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        method1t2();
        method2t2("Метод стринг");
        method3t2();
        method4t2();
        method5t2("%%%%%%%%", 9);

    }
    public static void method1t2(){
        System.out.println("Я пустой");
    }
    public static void method2t2(String text){
        System.out.println(text);
    }
    public static void method3t2(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите свой текст");
        String str = scanner.nextLine();
        System.out.println("Ваше предложение - " + str);
        char[] chars = str.toCharArray();

    }
    public static void method4t2(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер масива");
        int legend = scanner.nextInt();
        int[] array = new int[legend];
        int sum = 0;
        System.out.println("Введите числа:");
        for (int i = 0; i < legend; i++) {
            array[i] = scanner.nextInt();
        }
        for (int num : array) {
            sum = sum + num;
        }
        System.out.println("Сумма элементов массива равна: " + sum);
    }
    public static void method5t2(String text, int number){
        System.out.println("Ваше сообщение - "+ text + ", ваше число - "+ number);

    }
}
