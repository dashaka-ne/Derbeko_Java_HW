package home_work_1;

import java.util.Scanner;

public class ByteToKilobyte {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        float num = in.nextFloat();
        System.out.print("Введите единицу измерения b или kb: ");
        String unit = in.next();
    }

    public static String text(String unit, int num) {
        String text;
        if (unit.equals("b")) {
            text = ("Это " + num / 1024 + " килобайт");
        } else {
            if (unit.equals("kb")) {
                text = ("Это " + num * 1024 + " байт");
            } else {
                text = ("Вы ввели неверную единицу измерения");
            }
        }
        return text;
    }
}



