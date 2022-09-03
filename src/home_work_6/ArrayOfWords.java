package home_work_6;

import java.io.Serializable;

public class ArrayOfWords implements Serializable {
    /**
     * метод разбивает полученную строку на отдельные слова
     *
     * @param string строка для разбиения
     * @return возвращает массив слов
     */
    public static String [] addArrayOfWords (String string) {
        String[] words = string.split(" ");
        return words;
    }
}
