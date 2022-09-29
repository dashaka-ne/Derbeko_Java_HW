package home_work_6;

import java.util.concurrent.*;

public class CreateThread {

    /**
     * метод создает поток для выполнения метода search класса EasySearch
     *
     * @param text строка для поиска
     * @param word слово для поиска
     * @return количество слов
     */
    public static Long createThread(String text, String word) throws ExecutionException, InterruptedException, TimeoutException {
        ExecutorService executor = Executors.newFixedThreadPool(100);
        Future<Long> ft = executor.submit(() -> {
            System.out.println(Thread.currentThread().getName());
            return new EasySearch().search(text, word);
        });
        executor.shutdown();
        return ft.get(5, TimeUnit.SECONDS);
    }
}