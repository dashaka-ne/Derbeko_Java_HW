package home_work_6;

import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public class Main2 {

    public static void main(String[] args) throws ExecutionException, InterruptedException, TimeoutException, IOException {
        String word;
        CreateFileToWrightResult.toWriteResultFile();
        String wordToExit = "exit";
        do {
            ListOfBooks list = new ListOfBooks();
            list.showListOfBooks(EnterAddress.giveMePath());//список книг
            Long number = CreateThread.createThread(Read.toRead(BookChoice.bookChoice()), WordSearch.wordToSearch());//поиск количества повторений
            String bookName = BookChoice.getBookName();  // возвращает название файла
            word = WordSearch.getUserWord(); //возвращает слово которое ввел пользователь
            if (!wordToExit.equals(word)) {
                SearchResult.writeResult(bookName, word, number);//запись в файл
            }
        } while (!wordToExit.equals(word));
    }
}

