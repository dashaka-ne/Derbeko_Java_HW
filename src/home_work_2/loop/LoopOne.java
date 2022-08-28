package home_work_2.loop;


public class LoopOne {
    /**
     * метод перемножает числа в полученном массиве
     *
     * @param arr массив
     * @return произведение числе массива
     */
    public static long result(long[] arr) {
        long result = 1;
        for (int i = 0; i < arr.length; i++) {
            result = result * arr[i];
        }
        return result;
    }

    /**
     * метод создает массив из целых чисел начиная с 1 c шагом 1 и размером number
     *
     * @param number размер массива
     * @return массив
     */
    public static long[] createArr(int number) {
        long[] array = new long[number];
        for (int i = 0, j = 1; i < number; i++) {
            array[i] = j + i;
        }
        return array;
    }
}
