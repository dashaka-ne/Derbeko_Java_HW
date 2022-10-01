package home_work_6;

import java.io.File;
import java.io.IOException;

public class CreateFileToWrightResult {
    /**
     * метод создает файл в директории
     *
     * @throws IOException
     */
    public static void toWriteResultFile() throws IOException {
        File file = new File("HomeWork", "result.txt");
        file.createNewFile();
    }
}
