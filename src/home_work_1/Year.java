package home_work_1;

import java.util.Scanner;

public class Year {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите год: ");
        int year = in.nextInt();
    }

    public static String text(int year) {
        String text;
        if (year % 4 != 0) {
            text = (year + "-невисокосный год");
        } else if (year % 100 != 0) {
            text = (year + "-високосный год");
        } else if (year % 400 == 0) {
            text = (year + "-високосный год");
        } else {
            text = (year + "-невисокосный год");
        }
        return text;
    }
}
