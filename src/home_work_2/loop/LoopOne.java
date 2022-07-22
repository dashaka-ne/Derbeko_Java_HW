package home_work_2.loop;

import java.util.Scanner;

public class LoopOne {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        String value = in.next();
        int number = Integer.parseInt(value, 10);
        if (number < 1) {
            System.out.println("Вы ввели отрицательное число или ноль. Попробуйте еще раз");
        }else{
            int i = 0;
            int result = 1;
            int j = 1;
            System.out.print("1");
            while (number > i && (j) < number) {
                result = (number - i) * result;
                i++;
                System.out.print("*" + (j + 1));
                j++;
            }
            System.out.println(" = " + result);
        }
    }
}
