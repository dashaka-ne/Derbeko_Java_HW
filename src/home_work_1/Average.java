package home_work_1;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input first number: ");
        int a = in.nextInt();
        System.out.print("Input second number: ");
        int b = in.nextInt();
        System.out.print("Input third number: ");
        int c = in.nextInt();
    }

    public static String avg(int a, int b, int c) {
        String text;
        if (a > b && a > c) {
            if (b > c) {
                text = ("Average number is: " + b);
            } else {
                text = ("Average number is: " + c);
            }
        } else {
            if (b > a && b > c) {
                if (a > c) {
                    text = ("Average number is: " + a);
                } else {
                    text = ("Average number is: " + c);
                }
            } else {
                if (b > a) {
                    text = ("Average number is: " + b);
                } else {
                    text = ("Average number is: " + a);
                }
            }
        }
        return text;
    }
}

