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
        final String REGEXP = "\\b" + Pattern.quote(word) + "\\b";
        String blockToFind = String.format(REGEXP);
        Pattern pattern = Pattern.compile(blockToFind);
        Matcher matcher = pattern.matcher(text);
        int count = 0;
        while (matcher.find()) {
            count++;
        }
        return count;
    }
}
