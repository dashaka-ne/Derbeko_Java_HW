package home_work_1;

import java.util.Scanner;

public class Division {
    public static void main (String[] args){
            Scanner in = new Scanner(System.in);
            System.out.print("Введите первое число: ");
            int a = in.nextInt();
            System.out.print("Введите второе число: ");
            int b = in.nextInt();
            if (a%b==0){
            System.out.println("Если число "+a+" разделить на "+b+" получится "+ a/b);
            }else {
                System.out.println("Если число "+a+" разделить на "+b+" получится "+ a/b+" с остатком "+a%b);
            }
    }
}


