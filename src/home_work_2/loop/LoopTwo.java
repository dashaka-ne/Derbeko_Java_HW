package home_work_2.loop;

import java.util.Arrays;

public class LoopTwo extends LoopOne {

    /**
     * метод разбивает число на цифры и наполняет ими массив
     *
     * @param number число для разбивки
     * @return массив из цифр числа
     */
    public static long[] numberArr(long number) {
        long numberOriginal = number;
        long[] array = new long[1];
        int i = 0;
        if (numberOriginal > 9) {
            while (number > 9) {
                long a = number % 10;
                number = (number - a) / 10;
                array[i] = a;
                array = Arrays.copyOf(array, array.length + 1);
                i++;
            }
            array[array.length - 1] = number;
        } else {
            array[0] = number;
        }
        return array;
    }

    /**
     * метод выводит на печать текст умножения чисел массива и его произведение
     *
     * @param array массив чисел
     * @return строку отображающую перемножение элементов массива и его произведение
     */
    public static String text(long[] array) {
        StringBuilder sb = new StringBuilder();
        int k = 0;
        for (int i = 0; i < array.length; i++, k++) {
            if (k > 0) {
                sb.append("*");
            }
            sb.append(array[i]);
        }
        sb.append("=");
        long c = LoopOne.result(array);
        sb.append(c);
        return sb.toString();
    }
}

