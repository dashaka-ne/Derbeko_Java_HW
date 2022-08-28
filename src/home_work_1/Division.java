package home_work_1;

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int a = in.nextInt();
        System.out.print("Введите второе число: ");
        int b = in.nextInt();
    }

    public static String division(int a, int b) {
        String text;
        if (a % b == 0) {
            text = ("Если число " + a + " разделить на " + b + " получится " + a / b);
        } else {
            text = ("Если число " + a + " разделить на " + b + " получится " + a / b + " с остатком " + a % b);
        }
        return text;
    }
}


