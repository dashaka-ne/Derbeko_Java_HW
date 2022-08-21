package home_work_5;

import java.util.Random;


public class RandomString {
    /**
     * метод генерирует случайную строку случайной длины из символов исходной строки
     *
     * @param chars строка из символов
     * @param min   минимально допустия длина строки
     * @param max   максимально допустимая длина строки
     * @return возвращает сгенерированную строку
     */
    public static String randomString(String chars, int min, int max) {
        String randomString = "";
        Random random = new Random();
        int length = random.nextInt(max - min) + 1 + min;
        char[] text = new char[length];
        for (int i = 0; i < length; i++) {
            text[i] = chars.charAt(random.nextInt(chars.length()));
        }

        for (int i = 0; i < text.length; i++) {
            randomString = text[i] + randomString;
        }
        return randomString;
    }

    public static String randomString(String chars) {
        String randomString = "";
        Random random = new Random();
        int length = random.nextInt(20) + 1;
        char[] text = new char[length];
        for (int i = 0; i < length; i++) {
            text[i] = chars.charAt(random.nextInt(chars.length()));
        }

        for (int i = 0; i < text.length; i++) {
            randomString = text[i] + randomString;
        }
        return randomString;
    }


}
