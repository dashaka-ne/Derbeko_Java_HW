package home_work_6;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String s = Read.toRead("HomeWork/warAndPeace.txt");
        ISearchEngine string = new EasySearch();//для 5 задания

        ISearchEngine reg = new RegExSearch();// для 5 задания

        ISearchEngine dec = new SearchEnginePunctuationNormalizer(new RegExSearch());// для 5 задания

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
        List<Map.Entry<String, Long>> arrList = Convert.toConvert(MapOfWords.mapCollection(words));
        Sort.toSort(arrList);

        //вывести n записей
        NRecords.records((arrList), 5);

        // 5.1 поиск слова в строке с учетом регистра
        System.out.println("Повторений слова \"мир\" " + string.search(s, "мир"));
        System.out.println("Повторений слова \"война\" " + string.search(s, "война"));
        System.out.println("Повторений слова \"и\" " + string.search(s, "и"));

        System.out.println("Повторений слова \"мир\" " + reg.search(s, "мир"));
        System.out.println("Повторений слова \"война\" " + reg.search(s, "война"));
        System.out.println("Повторений слова \"и\" " + reg.search(s, "и"));

        System.out.println("Повторений слова \"мир\" " + dec.search(s, "мир"));
        System.out.println("Повторений слова \"война\" " + dec.search(s, "война"));
        System.out.println("Повторений слова \"и\" " + dec.search(s, "и"));
    }
}
