package home_work_6;

import java.io.File;

public class ListOfBooks {
    /**
     * метод выводит список файлов в директории
     *
     * @param path директория
     */
    public void showListOfBooks(String path) {
        System.out.println("Список файлов в папке: ");
        try {
            File fl = new File(path);
            String[] books;
            books = fl.list();
            for (String book : books) {
                System.out.println(book);
            }
        } catch (Exception e) {
            System.out.println("Не найдена папка для отображения списка файлов");
        }
    }
}
