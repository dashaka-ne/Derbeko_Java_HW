package home_work_6;

import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        String s = Read.toRead("HomeWork/warAndPeace.txt");
        ISearchEngine iSearchEngineEasy = new EasySearch();//для 5 задания

        ISearchEngine iSearchEngineReg = new RegExSearch();// для 5 задания

        ISearchEngine iSearchEngineNorma = new SearchEnginePunctuationNormalizer(new RegExSearch());// для 5 задания

        ISearchEngine iSearchEngineIgnore = new SearchRegisterIgnore(new RegExSearch());// для 5 задания

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
        System.out.println("Повторений слова \"мир\" " + iSearchEngineEasy.search(s, "мир"));
        System.out.println("Повторений слова \"война\" " + iSearchEngineEasy.search(s, "война"));
        System.out.println("Повторений слова \"и\" " + iSearchEngineEasy.search(s, "и"));

        System.out.println("Повторений слова \"мир\" " + iSearchEngineReg.search(s, "мир"));
        System.out.println("Повторений слова \"война\" " + iSearchEngineReg.search(s, "война"));
        System.out.println("Повторений слова \"и\" " + iSearchEngineReg.search(s, "и"));

        System.out.println("Повторений слова \"мир\" " + iSearchEngineNorma.search(s, "мир"));
        System.out.println("Повторений слова \"война\" " + iSearchEngineNorma.search(s, "война"));
        System.out.println("Повторений слова \"и\" " + iSearchEngineNorma.search(s, "и"));

        //5.2 поиск слова без учета регистра
        System.out.println("Повторений слова \"мир\" " + iSearchEngineIgnore.search(s, "мир"));
        System.out.println("Повторений слова \"война\" " + iSearchEngineIgnore.search(s, "война"));
        System.out.println("Повторений слова \"и\" " + iSearchEngineIgnore.search(s, "и"));
    }
}
