package home_work_1;

import home_work_1.texts.LetterOrCharLetterText;
import home_work_1.texts.LetterOrCharSymbolText;

import java.util.Scanner;

public class LetterOrChar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите букву или символ: ");
        String string = in.next();
    }

    public static String text(String string) {
        char item = string.charAt(0);
        String text;
        if (Character.isLetter(item) || Character.isUpperCase(item)) {
            text = LetterOrCharLetterText.getText();
        } else {
            text = LetterOrCharSymbolText.getText();
        }
        return text;
    }
}
