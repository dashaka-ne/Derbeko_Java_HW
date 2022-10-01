package home_work_6;
import java.io.IOException;

public class Main1 {
    public static void main(String[] args) throws IOException {
        String word;
        String wordToExit = "exit";
        CreateFileToWrightResult.toWriteResultFile();
                do {
            ListOfBooks list = new ListOfBooks();
            list.showListOfBooks(EnterAddress.giveMePath());//список книг

            String s = Read.toRead(BookChoice.bookChoice());//выбранная книга в строку
            ISearchEngine string = new EasySearch();

            Long number = string.search(s, WordSearch.wordToSearch());//возвращает количество повторений
            String bookName = BookChoice.getBookName();  // возвращает название файла
            word = WordSearch.getUserWord(); //возвращает слово которое ввел пользователь
            if (!wordToExit.equals(word)) {
                SearchResult.writeResult(bookName, word, number);//запись в файл
            }
        } while (!wordToExit.equals(word));
    }
}
