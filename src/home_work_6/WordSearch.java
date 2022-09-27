package home_work_6;

public class WordSearch {
    private static String userWord;

    /**
     * метод позволяет ввести слово через консоль
     *
     * @return слово в виде строки
     */
    public static String wordToSearch() {
        System.out.println("Введите слово для поиска: ");
        userWord = EnterFromConsole.text();
        return userWord;
    }

    public static String getUserWord() {
        return userWord;
    }
}
