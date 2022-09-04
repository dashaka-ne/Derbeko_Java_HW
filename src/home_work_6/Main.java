package home_work_6;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println(Read.toRead("HomeWork/src/warAndPeace.txt"));
        String s = Read.toRead("HomeWork/src/warAndPeace.txt");

        //массив из строк
        String[] words = ArrayOfWords.addArrayOfWords(s);
        System.out.println(Arrays.toString(words));

        // коллекция Set уникальных слов
        SetOfWords.wordsToSet(words);
        System.out.println(SetOfWords.wordsToSet(words));

        //количество уникальных слов(размер Set)
        System.out.println(NumberOfWords.countWords(SetOfWords.wordsToSet(words)));

        //Map ключ= слово, значение=количество повторений
        System.out.println(MapOfWords.mapCollection(words));

        // Перевод Map в List
        System.out.println(Convert.toConvert(MapOfWords.mapCollection(words)));

        //Сортировка
        List<Map.Entry<String, Long>> arrList=Convert.toConvert(MapOfWords.mapCollection(words));//лист в переменную
        Sort.toSort(arrList);

        //вывести n записей
        NRecords.records((arrList),1); //тут уже отсортированный список т.к. выше была сортировка


    }
}
