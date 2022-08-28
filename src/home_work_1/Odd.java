package home_work_1;

import java.util.Scanner;

public class Odd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = in.nextInt();
    }

    public static String odd(int num) {
        if (num % 2 == 0) {
            return ("Число " + num + " четное");
        } else {
            return ("Число " + num + " нечетное");
        }
    }
}

