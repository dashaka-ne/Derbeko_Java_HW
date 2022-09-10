package classWork;

import java.io.*;

public class File {
    public void getFile(String url) {
        try {
            FileReader reader = new FileReader("url");
        } catch (FileNotFoundException e) {
            try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("students.bin"));) {
                Student student = new Student();
                oos.writeObject(student);
            } catch (FileNotFoundException fileNotFoundException) {
                fileNotFoundException.printStackTrace();
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        }
    }

}
