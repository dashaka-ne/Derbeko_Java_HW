package home_work_5;

import java.util.Random;

public class RandomName {
    /**
     * метод возвращает имя
     *
     * @return возвращает рандомное имя из списка
     */
    public static String randomName() {
        Random random = new Random();
        String[] names = {"Ира", "Максим", "Влад", "Олег", "Ольга", "Татьяна", "Света", "Мирослава", "Злата", "Ян", "Владимир", "Наташа", "Марина", "Катерина", "Толик", "Алексей", "Александ", "Мария", "Кузьма", "Станислав", "Регина", "Людмила"};
        int c = names.length;
        return names[random.nextInt(c)];
    }
}
