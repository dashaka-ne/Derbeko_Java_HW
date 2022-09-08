package home_work_6;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String s = Read.toRead("HomeWork/src/warAndPeace.txt");
        ISearchEngine string = new EasySearch();//для 5 задания

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
        List<Map.Entry<String, Long>> arrList = Convert.toConvert(MapOfWords.mapCollection(words));//лист в переменную
        Sort.toSort(arrList);

        //вывести n записей
        NRecords.records((arrList), 5); //тут уже отсортированный список т.к. выше была сортировка

        // 5.1 поиск слова в строке с учетом регистра
        System.out.println("Повторений слова \"мир\" " + string.search(s, "мир"));
        System.out.println("Повторений слова \"война\" " + string.search(s, "война"));
        System.out.println("Повторений слова \"и\" " + string.search(s, "и"));

        //5.2. поиск слова в строке без учета регистра
        System.out.println("Повторений слова \"мир\" " + string.search(s.toLowerCase(), "мир"));
        System.out.println("Повторений слова \"война\" " + string.search(s.toLowerCase(), "война"));
        System.out.println("Повторений слова \"и\" " + string.search(s.toLowerCase(), "и"));
    }
}
