package home_work_6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExSearch implements ISearchEngine {
    /**
     * метод подсчитывает количество слов в строке с учетом регистра слова
     *
     * @param text строка для подсчета
     * @param word искомое слово
     * @return количество искомых слов в строке
     */
    @Override
    public long search(String text, String word) {
        Pattern pattern = Pattern.compile("\\b" + Pattern.quote(word) + "\\b");
        Matcher matcher = pattern.matcher(text);
        return matcher.results().count();
    }
}
