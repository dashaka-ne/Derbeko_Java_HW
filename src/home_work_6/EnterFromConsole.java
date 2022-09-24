package home_work_6;

import java.util.Scanner;

public class EnterFromConsole {
    /**
     * метод позволяет ввести слово через консоль
     *
     * @return слово в виде строки
     */
    public static String text() {
        Scanner textRaw = new Scanner(System.in);
        return textRaw.nextLine();
    }
}
