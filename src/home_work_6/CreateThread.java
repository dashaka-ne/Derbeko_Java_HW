package home_work_6;

public class CreateThread {
    /**
     * метод создает поток для выполнения метода search класса EasySearch
     *
     * @param text строка для поиска
     * @param word слово для поиска
     */
    public static void createThread(String text, String word) {
        Thread th = new Thread(() -> {
            new EasySearch().search(text, word);
        });
        th.start();
    }
}
