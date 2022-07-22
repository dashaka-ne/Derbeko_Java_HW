package home_work_2.loop;

import java.util.Scanner;

public class LoopTwo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        String valueForRevert = in.next();
        StringBuffer valueForString=new StringBuffer(valueForRevert);
        valueForString.reverse();
        String value=valueForString.toString();
        if(value.matches("[а-яА-Яa-zA-Z]+")){
            System.out.println("Введено не число");
        }else if(value.matches("[0-9]+[.,][0-9]+")) {
            System.out.println("Введено не целое число");
        }else {
            int number = Integer.parseInt(value, 10);
            int numberOriginal = number;
            int result = 1;
            if (numberOriginal>9){
            while (number > 9) {
                int a = number % 10;
                int b = (number - a) / 10;
                number = b;
                result = result * a;
                System.out.print(a + "*");
            }
                result = result * number;
                System.out.print(number + "=" + result);
            } else {
                System.out.print(numberOriginal + "=" + numberOriginal);
            }
        }
    }
}
