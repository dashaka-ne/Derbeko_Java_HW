package home_work_6;

import home_work_1.EnterAddress;

import java.io.File;

public class BookChoice {
    private static final String PATH = EnterAddress.getPath() + "/";

    /**
     * метод позволяет ввести название книги через консоль
     *
     * @return слово в виде строки
     */
    public static String bookChoice() {
        System.out.println("Укажите название книги: ");
        String wordPath = PATH + EnterFromConsole.text();
        File wordPathExist = new File(wordPath);
        if (!wordPathExist.isFile()) {
            System.out.println("Книга не найдена");
        }
        return wordPath;
    }
}
