package home_work_6;

public class EasySearch implements ISearchEngine {
    /**
     * метод подсчитывает количество слов в строке с учетом регистра слова
     *
     * @param text строка для подсчета
     * @param word искомое слово
     * @return количество искомых слов в строке
     */
    @Override
    public long search(String text, String word) {
        int count = 0;
        int index = text.indexOf(word);
        while (index != -1) {
            if (index == 0 && word.length() == 1) {
                count++;
            } else if (index == 0 && word.length() > 0) {
                boolean b2 = isLetterSearch(index, word, text);
                if (!b2) {
                    count++;
                }
            } else if (index == text.indexOf(text.length() - 1) || index + word.length() - 1 == text.length() - 1) {
                count++;
            } else {
                boolean b1 = Character.isLetter(text.charAt(index - 1));
                boolean b2 = isLetterSearch(index, word, text);
                if (!b1 && !b2) {
                    count++;
                }
            }
            text = text.substring(index + 1);
            index = text.indexOf(word);
        }
        return count;
    }

    private boolean isLetterSearch(int indexIn, String wordIn, String text){
        return Character.isLetter(text.charAt(indexIn + wordIn.length()));
    }
}

