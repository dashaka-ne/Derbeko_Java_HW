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
        if (a > b && a > c) {
            if (b > c) {
                System.out.print("Average number is: " + b);
            } else {
                System.out.print("Average number is: " + c);
            }
        } else {
            if (b > a && b > c) {
                if (a > c) {
                    System.out.print("Average number is: " + a);
                } else {
                    System.out.print("Average number is: " + c);
                }
            } else {
                if (b > a) {
                    System.out.print("Average number is: " + b);
                } else {
                    System.out.print("Average number is: " + a);
                }
            }
        }
    }
}

