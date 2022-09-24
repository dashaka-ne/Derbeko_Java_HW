package home_work_6;

import java.io.File;


public class EnterAddress {
    private static String path;

    /**
     * метод позволяет пользователю ввести адрес через консоль
     *
     * @return url в виде строки
     */
    public static String giveMePath() {
        System.out.println("Введите адрес папки, например HomeWork/resources: ");
        path = EnterFromConsole.text();

        File fl = new File(path);
        if (!fl.isDirectory()) {
            System.out.println("Папка не найдена");
        }
        return path;
    }

    public static String getPath() {
        return path;
    }
}
