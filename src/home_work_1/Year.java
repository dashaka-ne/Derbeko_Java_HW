package home_work_1;

import java.util.Scanner;

public class Year {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите год: ");
        int year =in.nextInt();
        if (year%4!=0){
            System.out.println(year+"-невисокосный год");
        }else if(year%100!=0){
                System.out.println(year+"-високосный год");
                }
                else if(year%400==0){
                System.out.println(year + "-високосный год");
                }
                    else{
                     System.out.println(year+"-невисокосный год");
                    }
    }
}
