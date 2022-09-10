package home_work_6;

public class SearchEnginePunctuationNormalizer implements ISearchEngine {
    private final ISearchEngine searchEngine;

    public SearchEnginePunctuationNormalizer(ISearchEngine searchEngine) {
        this.searchEngine = searchEngine;
    }

    /**
     * метод удаляет из строки знаки препинания и лишние пробелы
     *
     * @param text строка для удаления знаков препинания и лишних пробелов
     * @return строку из слов разделенных только 1 пробелом
     */
    private String textNormalize(String text) {
        return text.replaceAll("[\\s!,.:;]+", " ");
    }

    @Override
    public long search(String text, String word) {
        return searchEngine.search(textNormalize(text), word);
    }
}
