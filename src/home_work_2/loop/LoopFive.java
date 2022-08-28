package home_work_2.loop;

import java.util.Arrays;
import java.util.Random;

public class LoopFive {
    //1.5.1

    /**
     * метод возвращает наибольшую цифру из введенного числа
     *
     * @param forMaxNumber число
     * @return наибольшая цифра
     */
    public static int largestNumber(int forMaxNumber) {
        int resultNumber = 0;
        while (forMaxNumber > 9) {
            int maxNumber = forMaxNumber % 10;
            if (maxNumber > resultNumber) {
                resultNumber = maxNumber;
            }
            forMaxNumber = forMaxNumber / 10;
        }
        return resultNumber;
    }


    //1.5.2.Вероятность четных случайных чисел
    //метод random вычисляет вероятность наличия в выборке четных чисел
    //@return возвращает процентное значение вероятности наличия в выборке четных чисел
    public static double random() {
        int evenRandomCount = 0;
        for (int i = 0; i < 1001; i++) {
            Random r = new Random();
            int random = r.nextInt();
            if (random % 2 == 0) {
                evenRandomCount = evenRandomCount + 1;
            }
        }
        double randomCount = evenRandomCount * 100 / 1000;
        return randomCount;
    }


    //1.5.3 Посчитать четные и нечетные цифры числа

    /**
     * метод подсчитывает количество четных и нечетных цифр
     *
     * @param evenOdd число для подсчета
     * @return строка с массивом из количества четных и нечетных чисел
     */
    public static int[] evenOdd(int evenOdd) {
        int evenOddOriginal = evenOdd;
        int[] arr = new int[2];
        if (evenOddOriginal % 2 == 0 && evenOddOriginal < 9) {
            arr = new int[]{1, 0};
        } else if (evenOddOriginal % 2 != 0 && evenOddOriginal < 9) {
            arr = new int[]{0, 1};
        } else {
            int numberOfOdd = 0;
            int numberOfEven = 0;
            while (evenOdd > 0) {
                int a = evenOdd % 10;
                evenOdd = (evenOdd - a) / 10;
                if (a % 2 == 0) {
                    numberOfEven = numberOfEven + 1;
                    arr[0] = numberOfEven;
                } else {
                    numberOfOdd = numberOfOdd + 1;
                    arr[1] = numberOfOdd;
                }
            }
        }
        return arr;
    }

    //1.5.4 Ряд Фибоначчи

    /**
     * метод fib возвращает количество элементов из ряда Фибоначчи введенное пользователем
     *
     * @param count количество числе из ряда Фибоначчи
     * @return  массив из ряда Фибоначчи в количестве элементов заданных пользователем
     */
    public static int[] fib(int count) {
        int numberPrev = 0;
        int numberLast = 1;
        int numberFib = 0;
        int[] arr = new int[count];
        for (int i = 0; i < arr.length; i++) {
            numberFib = numberPrev + numberLast;
            numberPrev = numberLast;
            numberLast = numberFib;
            arr[i] = numberLast;
        }
        return arr;
    }

    //1.5.5 Вывести ряд чисел в диапазоне с шагом

    /**
     * метод  выводит числа в заданном диапазоне с заданным шагом
     *
     * @param numberMin нижняя граница диапазона
     * @param numberMax верхняя граница диапазона
     * @param step      шаг
     * @return строка с массивом чисел
     */
    public static int[] step(int numberMin, int numberMax, int step) {
        //узнаю количество чисел в диапазоне чтобы задать длину массива
        int result = numberMin;
        int i;
        for (i = 0; result <= numberMax; ++i) {
            result = result + step;
        }

        result = numberMin;
        int[] myArray = new int[i];
        for (int j = 0; j < i; j++) {
            myArray[j] = result;
            result = result + step;
        }
        return myArray;
    }


    //1.5.6. Переворот числа

    /**
     * метод переворачивает число
     *
     * @param valueForRevert число для переворота
     * @return перевернутое число
     */
    public static String revert(String valueForRevert) {
        StringBuffer valueForString = new StringBuffer(valueForRevert);
        valueForString.reverse();
        String value = valueForString.toString();
        return value;
    }
}



