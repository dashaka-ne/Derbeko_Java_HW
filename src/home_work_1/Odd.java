package home_work_1;

import java.util.Scanner;

public class Odd {
    public static void main(String[] args){
            Scanner in = new Scanner(System.in);
            System.out.print("Введите число: ");
            int num = in.nextInt();
            if (num%2==0){
                System.out.println("Число "+num+" четное");
            }else{
                System.out.println("Число "+num+" нечетное");
            }
    }
}

