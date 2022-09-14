package home_work_6;

import java.util.HashMap;
import java.util.Map;

public class MapOfWords {
    /**
     * метод создает коллекцию из уникальных слов(ключ) и количество их упоминаний(значение)
     *
     * @param words массив из которого выбираются слова
     * @return коллецию MAP в которой ключ= слово из массива, значение=частота упоминаний слова
     */
    public static Map<String, Long> mapCollection(String[] words) {
        Map<String, Long> wordCount = new HashMap<>();
        for (String word : words) {
            wordCount.put(word, CountWord.toCountWord(word, words));
        }
        return wordCount;
    }
}
