package home_work_6;

public class SearchThread implements Runnable {

    private ISearchEngine search;
    private String text;

    public SearchThread(ISearchEngine srch, String text) {

        this.search = srch;
        this.text = text;
    }

    @Override
    public void run() {
        String s = Read.toRead("HomeWork/warAndPeace.txt");
        System.out.println(search.search(s, text));
    }
}
