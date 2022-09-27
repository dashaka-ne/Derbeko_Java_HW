package home_work_6;

public class Main1 {
    public static void main(String[] args) {

        ListOfBooks list= new ListOfBooks();
        list.showListOfBooks(EnterAddress.giveMePath());//список книг


        String s = Read.toRead(BookChoice.bookChoice());//выбранная книга в строку
        ISearchEngine string = new EasySearch();


        Long number=string.search(s,WordSearch.wordToSearch());//возвращает количество повторений
        String bookName=BookChoice.getBookName();  // возвращает название файла
        String word=WordSearch.getUserWord(); //возвращает слово которое ввел пользователь

        SearchResult.writeResult(bookName,word,number);//запись в файл
    }
}
