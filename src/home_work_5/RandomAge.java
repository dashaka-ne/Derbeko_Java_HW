package home_work_5;

import java.util.Random;

public class RandomAge {
    /**
     * метод генерирует случае число в диапазоне от 1 до ageMax
     *
     * @param ageMax верхний диапазон для генерации числа
     * @return возвращает случайно число в диапазоне от 1 до ageMax
     */
    public static int randomAge(int ageMax) {
        Random random = new Random();
        return random.nextInt(ageMax) + 1; //а=15  в диапазон не входит, но входит 0. Поэтому к числу из [0;14] прибавим 1 и счастье

    }
}
