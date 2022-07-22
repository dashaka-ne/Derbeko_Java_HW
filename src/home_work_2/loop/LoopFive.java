package home_work_2.loop;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class LoopFive {
    public static void main(String[] args) {
        System.out.println("Самое большое число это " + largestNumber());
        System.out.println("Вероятность четных случайных цифр: " + random() + " %");
        System.out.print("Четных и нечетных чисел соответственно:"+ evenOddNew());
        System.out.println("Ряд: "+fib());
        System.out.println("Диапазон чисел с шагом: " + step());
        System.out.println("Перевернутое число: " + revert());

    }


    //1.5.1
    // метод largestNumber возвращает наибольшую цифру введенного числа
    //@return возвращает самую большую цифру из числа
    public static int largestNumber() {
        Scanner forMaxNumberNew = new Scanner(System.in);
        System.out.print("Наибольшая цифра.Введите число: ");
        String forMaxNumberBefore = forMaxNumberNew.next();
        int forMaxNumber = Integer.parseInt(forMaxNumberBefore, 10);
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
        double randomCount = evenRandomCount*100/1000;
        return randomCount;
    }


    //1.5.3 Посчитать четные и нечетные цифры числа
    // метод evenOddNew подсчитывает количество четных и нечетных цифр в введенном числе
    //@return возвращает массив из количества четных и нечетных чисел
    public static String evenOddNew() {
        Scanner evenOddNew = new Scanner(System.in);
        System.out.print("Посчитать четные и неченые цифры. Введите число: ");
        String evenOddBefore = evenOddNew.next();
        int evenOdd = Integer.parseInt(evenOddBefore, 10);
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
                    arr[0]=numberOfEven;
                } else {
                    numberOfOdd = numberOfOdd + 1;
                    arr[1]=numberOfOdd;
                }
            }
        }
        String arrString=Arrays.toString(arr);
        return arrString;
    }

    //1.5.4 Ряд Фибоначчи
    // метод fib отображает количество элементов из ряда Фибоначчи введенное пользователем
    //@return ряд Фибоначчи в количестве элементов заданных пользователем
    public static String fib(){
        Scanner count = new Scanner(System.in);
        System.out.print("\nРяд Фибоначчи. Введите число: ");
        int numberPrev = 0;
        int numberLast = 1;
        int numberFib = 0;
        int [] arr=new int [count.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            numberFib = numberPrev + numberLast;
            numberPrev = numberLast;
            numberLast = numberFib;
            arr[i]=numberLast;
        }
        String arrString=Arrays.toString(arr);
        return arrString;
    }

    //1.5.5 Вывести ряд чисел в диапазоне с шагом
    //метод step выводит числа в заданном диапазоне с заданным шагом
    //@return числа в заданном диапазоне с заданным щагом
    public static String step(){
        Scanner inMin = new Scanner(System.in);
        System.out.print("\nВведите минимальное число: ");
        String numberMinBefore = inMin.next();
        int numberMin = Integer.parseInt(numberMinBefore, 10);

        Scanner inMax = new Scanner(System.in);
        System.out.print("Введите максимальное число: ");
        String numberMaxBefore = inMax.next();
        int numberMax = Integer.parseInt(numberMaxBefore, 10);

        Scanner inStep = new Scanner(System.in);
        System.out.print("Введите шаг: ");
        String stepBefore = inStep.next();
        int step = Integer.parseInt(stepBefore, 10);

        //узнаю количество чисел в диапазоне чтобы задать длину массива
        int result = numberMin;
        int i;
        for (i = 0; result <= numberMax; ++i) {
            result = result + step;
        }

        result=numberMin;
        int[] myArray=new int [i];
        for(int j=0;j<i;j++){
            myArray[j]= result;
            result = result + step;
        }
        String arrString= Arrays.toString(myArray);
        return arrString;
    }


    //1.5.6. Переворот числа
    // метод revert переворачивает число
    //@return перевернутое число
    public static String revert() {
        Scanner in = new Scanner(System.in);
        System.out.print("\nПереворот числа. Введите число: ");
        String valueForRevert = in.next();
        StringBuffer valueForString = new StringBuffer(valueForRevert);
        valueForString.reverse();
        String value = valueForString.toString();
        return value;
    }
}



