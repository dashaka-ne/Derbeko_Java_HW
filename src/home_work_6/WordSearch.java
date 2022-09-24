package home_work_6;

public class WordSearch {
    /**
     * метод позволяет ввести слово через консоль
     *
     * @return слово в виде строки
     */
    public static String wordToSearch() {
        System.out.println("Введите слово для поиска: ");
        return EnterFromConsole.text();
    }
}
