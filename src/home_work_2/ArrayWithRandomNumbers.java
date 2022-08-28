package home_work_2;

import java.util.Random;

public class ArrayWithRandomNumbers {
    /**
     * метод создает массив определенного размера  с числами не превышающими определенное значение
     *
     * @param size  рамер массива
     * @param maxValueExclusion верхняя граница диапазона числе в массиве
     * @return массив
     */
    public static int[] createArray(int size, int maxValueExclusion) {
        int[] userArray = new int[size];
        for (int i = 0; i < userArray.length; i++) {
            Random random = new Random();
            userArray[i] = random.nextInt(maxValueExclusion);
        }
        return userArray;
    }

    /**
     * метод создает массив рандомной длины
     *
     * @return массив
     */
    public static int[] createArray() {
        Random rnd = new Random();
        int[] userArray = new int[rnd.nextInt(100)];
        for (int i = 0; i < userArray.length; i++) {
            Random random = new Random();
            userArray[i] = random.nextInt(rnd.nextInt(1000));
        }
        return userArray;
    }
}

