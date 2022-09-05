package home_work_6;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetOfWords {
    /**
     * метод создает коллекцию уникальных слов
     * @param arrayOfWords массив из которого будет создана новая коллекция из уникальных слов
     * @return коллекция с уникальными словами
     */
    public static Set <String> wordsToSet(String[] arrayOfWords){

        return new HashSet<>(Arrays.asList(arrayOfWords));
    }
 }
