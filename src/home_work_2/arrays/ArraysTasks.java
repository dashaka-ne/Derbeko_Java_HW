package home_work_2.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysTasks {
    public static void main(String[] args) {
            System.out.println("Сумма четных положительных элементов " + count());
            System.out.println("Mаксимальный из элементов массива с четным индексом: " + maxElement());
            System.out.println("Элементы массива которые меньше среднего арифметического: "+ lessAvg());
            System.out.println("Два наименьших элемента массива: "+ twoNumbers());
            System.out.println("Числа из  массива не входящие в диапазон "+ lessThenNumbers());
            System.out.print("Сумма всех чисел массива:" + sumElements());
        }

        //2.4.1
        // Метод count подсчитывает количество четных положительных чисел
        //@return возвращает количество четных положительных чисел
        public static int count () {
            int[] myArray = ArraysUtils.arrayRandom(50, 100);
            int count = 0;
            for (int i = 0; i < myArray.length; i++) {
                int element = myArray[i];
                if (element % 2 == 0 && element > 0) {
                    count = count + element;
                }
            }
            return count;
        }


        //2.4.2
        // Метод maxElement находит наибольший элемент в массиве
        //@return возвращает наибольший элемент массива
        public static int maxElement () {
            int[] myArray = ArraysUtils.arrayRandom(50, 100);
            int maxElement = 0;
            for (int i = 0; i < myArray.length; i = i + 2) {
                int element = myArray[i];
                if (element > maxElement) {
                    maxElement = element;
                }
            }
            return maxElement;
        }

        //2.4.3
        //метод lessAvg выбирает из массива числа значение которых меньше среднего арифметического суииы чисел массива
        //@return возвращает числа значение которых меньше среднего арифметического суииы чисел массива
        public static String lessAvg(){
            int[] myArray = ArraysUtils.arrayRandom(50, 100);
            double avgElement = 0;
            int elementCount = 0;
            for (int element : myArray) {
                elementCount = elementCount + element;
            }
            avgElement = elementCount / myArray.length;

            for (int i = 0; i < myArray.length; i++) {
                int item = myArray[i];
                if (item < avgElement) {
                    myArray[i]=item;
                }
            }
            String arrString= Arrays.toString(myArray);
            return arrString;
        }

        //2.4.4.
        // метод twoNumbers возвращает два наименьших числа массива
        //@return два наименьших числа массива
        public static String twoNumbers(){
            int[] myArray = ArraysUtils.arrayRandom(50, 100);
            int avgItem = 0;
            int itemCount = 0;
            int [] myArrayNew=new int [2];
            for (int element : myArray) {
                itemCount = itemCount + element;
            }
            avgItem = itemCount / myArray.length;//нахожу среднее арифметическое для использования его  при сравнении
            int minElementFirst = avgItem;
            for (int i = 0; i < myArray.length; i++) {
                int element = myArray[i];
                if (minElementFirst >= element) {
                    minElementFirst = element;
                }
            }
            int minElementSecond = avgItem;
            int countFirstElement = 0;
            for (int i = 0; i < myArray.length; i++) {
                if (myArray[i] < minElementSecond && myArray[i] != minElementFirst) {
                    minElementSecond = myArray[i];
                    myArrayNew[0]=minElementSecond;
                } else if (myArray[i] == minElementFirst) {
                    countFirstElement = countFirstElement + 1;
                    myArrayNew[1]=minElementFirst;
                }
            }

            if (countFirstElement > 1) {
                myArrayNew[0]=minElementFirst;
                myArrayNew[1]=minElementFirst;
            } else {
                myArrayNew[0]=minElementFirst;
                myArrayNew[1]=minElementSecond;
            }
            String arrString=Arrays.toString(myArrayNew);
            return arrString;
        }

        //2.4.5
        // метод lessThenNumbers возвращает массив за исключением чисел из интервала
        //@return возвращает массив за исключением чисел из интервала
        public static String lessThenNumbers(){
            int[] myArray = ArraysUtils.arrayRandom(50, 100);
            Scanner beginRawBefore = new Scanner(System.in);
            System.out.println("Введите нижнюю границу диапазона ");
            String beginRaw=beginRawBefore.next();
            int begin = Integer.parseInt(beginRaw, 10);
            Scanner endRawBefore = new Scanner(System.in);
            System.out.println("Введите верхнюю границу диапазона ");
            String endRaw=endRawBefore.next();
            int end = Integer.parseInt(endRaw, 10);
            int length = myArray.length - 1;
            for (int i = 0; i < length; i++) {
                int item = myArray[i];
                if (item >= begin && item <= end) {
                    int k = i;
                    myArray[i] = 0;
                    for (int j = i; j < length; j++) {
                        if (!(myArray[j + 1] >= begin && myArray[j + 1] <= end)) {
                            myArray[k] = myArray[j + 1];
                            k++;
                            myArray[j + 1] = 0;
                        } else {
                            myArray[j + 1] = 0;
                        }
                    }
                    break;
                }
            }
            String arrString=Arrays.toString(myArray);
            return arrString;
        }


        //2.4.6.
        // Метод sumElements суммирует все числа в массиве
        //@return возвращает сумму
        public static int sumElements() {
            int[] myArray = ArraysUtils.arrayRandom(50, 100);
            int numberCount = 0;
            for (int arrElement : myArray) {
                numberCount = numberCount + arrElement;
            }
            return numberCount;
        }

    }
