package home_work_5;

import java.util.Random;

public class RandomAnimalName {
    /**
     * метод возвращает кличку животного
     *
     * @return возвращает рандомную кличку животного из списка
     */
    public static String randomAnimalName() {
        Random random = new Random();
        String[] names = {"Жучка", "Барсик", "Каро", "Шарик", "Тарзан", "Белый", "Мухтар", "Черныш", "Лесси", "Оззи", "Каштанка", "Тузик", "Пират", "Батон", "Дружок"};
        int c = names.length;
        return names[random.nextInt(c)];
    }
}
