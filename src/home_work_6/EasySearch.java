package home_work_6;

public class EasySearch implements ISearchEngine {
    /**
     * метод подсчитывает количество слов в строке с учетом регистра слова
     *
     * @param text строка для подсчета
     * @param word искомое слова
     * @return количество слов в строке
     */
    @Override
    public long search(String text, String word) {
        int count = 0;
        int index = text.indexOf(word);
        while (index != -1) {
            if (index == 0 && word.length() == 1) {
                count++;
            } else if (index == 0 && word.length() > 0) {
                boolean b2 = Character.isLetter(text.charAt(index + word.length()));
                if (!b2) {
                    count++;
                }
            } else if (index == text.indexOf(text.length() - 1)) {
                count++;
            } else if (index + word.length() - 1 == text.length() - 1) {
                count++;
            } else {
                boolean b1 = Character.isLetter(text.charAt(index - 1));
                boolean b2 = Character.isLetter(text.charAt(index + word.length()));
                if (!b1 && !b2) {
                    count++;
                }
            }
            text = text.substring(index + 1);
            index = text.indexOf(word);
        }
        return count;
    }
}

