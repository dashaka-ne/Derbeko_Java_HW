package home_work_6;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.nio.file.Paths;

public class SearchResult {
    /**
     * метод собирает конкатенирует значения в строку  и записывает результат в файл
     *
     * @param bookName строка с названием книги
     * @param word     строка слово
     * @param number   количество повторений
     */

    public static void writeResult(String bookName, String word, Long number) {

        String fileResultPath = "HomeWork/result.txt";
        String value = bookName + "-" + word + "-" + number + "\n";
        try {
            Files.write(Paths.get(fileResultPath), value.getBytes(StandardCharsets.UTF_8), StandardOpenOption.APPEND);
        } catch (IOException e) {
            System.out.println("Что то пошло не так");
        }
    }
}
