package home_work_6;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Read {
    /**
     * метод вычитывает файл  и помещает его в строку
     *
     * @param path путь к файлу который должен быть вычитан
     */
    public static String toRead(String path) throws FileNotFoundException {
        FileReader fileReader = new FileReader(path);
        StringBuilder stringBuilder = new StringBuilder();
        try {
            int a;
            do {
                a = fileReader.read();
                if (a != -1) {
                    stringBuilder.append(Character.toChars(a));
                }
            } while (a != -1);
        } catch (IOException e) {
            System.out.println("Что-то пошло не так");
        }
        return stringBuilder.toString();
    }
}
