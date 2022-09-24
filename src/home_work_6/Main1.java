package home_work_6;

import home_work_1.EnterAddress;

public class Main1 {
    public static void main(String[] args) {
        ListOfBooks list= new ListOfBooks();
        list.showListOfBooks(EnterAddress.giveMePath());//список книг


        String s = Read.toRead(BookChoice.bookChoice());//выбранная книга в строку
        ISearchEngine string = new EasySearch();
        string.search(s,WordSearch.wordToSearch());

    }
}
