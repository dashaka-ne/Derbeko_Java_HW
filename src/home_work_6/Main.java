package home_work_6;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Read.toRead("HomeWork/src/warAndPeace.txt"));
        String s = Read.toRead("HomeWork/src/warAndPeace.txt");

        String[] words = ArrayOfWords.addArrayOfWords(s);
        System.out.println(Arrays.toString(words));

        SetOfWords.wordsToSet(words);
        System.out.println(SetOfWords.wordsToSet(words));

        System.out.println(NumberOfWords.countWords(SetOfWords.wordsToSet(words)));
        System.out.println(MapOfWords.mapCollection(words));

    }
}
