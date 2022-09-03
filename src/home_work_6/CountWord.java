package home_work_6;

public class CountWord {
    /**
     * метод подсчитывает сколько раз слово  встречается в массиве
     *
     * @param word  слово количество повторов которого необходимо посчитать
     * @param words массив в котором будет происходить подсчет
     * @return количество повторов слова
     */
    public static long toCountWord(String word, String[] words) {
        long count = 0;
        for (String value : words) {
            if (word.equals(value)) {
                count++;
            }
        }
        return count;
    }
}
