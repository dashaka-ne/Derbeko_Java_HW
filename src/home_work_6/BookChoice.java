package home_work_6;

import java.io.File;

public class BookChoice {
    private static final String PATH = EnterAddress.getPath() + "/";

    private static String bookName;

    /**
     * метод позволяет ввести название книги через консоль
     *
     * @return путь к книге в виде строки
     */
    public static String bookChoice() {
        System.out.println("Укажите название книги: ");
        bookName = EnterFromConsole.text();
        String wordPath = PATH + bookName;
        File wordPathExist = new File(wordPath);
        if (!wordPathExist.isFile()) {
            System.out.println("Книга не найдена");
        }
        return wordPath;
    }

    public static String getBookName() {
        return bookName;
    }


}
