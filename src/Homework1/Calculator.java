package Homework1;

import java.util.Objects;
import java.util.Scanner;

public class Calculator {
    private static double a;
    private static double b;
    private static double c;
    private static double d;
    private static double e;
    private static double f;
    public static void main(String[] args) {
        start();
        calculate();


    }
    public static void summ(){
        double c;
        c = a+b;
        System.out.println("result = "+c);
    }
    public static void minus(){
        double d;
        d = a-b;
        System.out.println("result = "+d);
    }
    public static void multiply(){
        double e;
        e = a*b;
        System.out.println("result = "+e);
    }
    public static void division(){
        double f;
        f = a/b;
        System.out.println("result = "+f);
    }
    public static void start(){
        System.out.println("калькулятор запущен");
    }
    public static void calculate() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        a = scanner.nextInt();
        System.out.println("Первое число - " + a);
        System.out.println("Введите второе число");
        b = scanner.nextInt();
        System.out.println("Второе число - " + b);
        nexa();
        stop();

    }

        public static void nexa(){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите  ваше действие 1)+,2)-,3)*,4)/");
            String dey = scanner.nextLine();
            if (Objects.equals(dey, "+")){
                summ();
            }
            else if (Objects.equals(dey, "-")){
                minus();
            }
            else if (Objects.equals(dey, "*")){
                multiply();
            }
            else if (Objects.equals(dey, "/")){
                division();
            }
            else {
                System.out.println("Введите корректное действие");
                nexa();
            }


    }
    public static void stop(){
        System.out.println("Для завершния введите команду (Stop) , для продолжения введите команду (Cont)");
        Scanner scanner = new Scanner(System.in);
        String stop = scanner.nextLine();
        if (Objects.equals(stop, "Stop")){
            System.out.println("Калькулятор закрыт");
        }
        else if (Objects.equals(stop, "Cont")){
            calculate();
        }
        else{
            System.out.println("Попробуйте ввести снова");
            stop();
        }



    }

}
