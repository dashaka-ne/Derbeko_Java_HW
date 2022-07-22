package home_work_2.arrays;

import java.util.Random;
import java.util.Scanner;

public class ArraysUtils {
    //2.1.1
    // метод arrayFromConsole создает массив заданной длины с заданными пользователем значениями
    //@return возвращает массив
    public static int[] arrayFromConsole(){
            Scanner forArrayLengthNew = new Scanner(System.in);
            System.out.print("Введите размер массива: ");
            String forArrayLength= forArrayLengthNew.next();
            int arrayLength=Integer.parseInt(forArrayLength,10);
            int[] userArray=new int[arrayLength];


            for(int i=0;i<userArray.length;i++ ) {
                Scanner forArrayElementNew = new Scanner(System.in);
                System.out.print("Введите элемент массива: ");
                String forArrayElement= forArrayElementNew.next();
                int arrayElement=Integer.parseInt(forArrayElement,10);
                userArray[i]=arrayElement;
            }
            return userArray;
        }

        //2.2.2
    //метод arrayRandom создает массив заданной длины и наполняет его random сгенерированными числами в заданном диапазоне
    //@param size длина массива
    //@param maxValueExclusion значение верхней границы диапазона чисел
    //@return возвращает массив
    public static int[] arrayRandom(int size, int maxValueExclusion){
        int[] userArray=new int[size];
        for(int i=0;i<userArray.length;i++){
            Random random=new Random();
            userArray[i]=random.nextInt(maxValueExclusion)+1;
        }
        return userArray;
    }
}
