package home_work_6;

public class SearchRegisterIgnore implements ISearchEngine {
    private final ISearchEngine searchEngine;

    public SearchRegisterIgnore(ISearchEngine searchEngine) {
        this.searchEngine = searchEngine;
    }

    /**
     * метод подсчитывает количество слов в строке без учета регистра слова если передан объект EasySearch
     *
     * @param text строка для подсчета
     * @param word искомое слово
     * @return количество искомых слов в строке
     */
    @Override
    public long search(String text, String word) {
        if (searchEngine instanceof RegExSearch) {
            return searchEngine.search(text, word);
        } else {
            return searchEngine.search(text.toLowerCase(), word.toLowerCase());
        }
    }
}
