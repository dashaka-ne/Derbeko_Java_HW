package home_work_1;

import java.util.Scanner;

public class LetterOrChar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите букву или спецсимвол: ");
        String string = in.next();
        char item=string.charAt(0);

        if(item>=040&&item<=0100){
            System.out.println("Вы ввели спецсимвол");
        }else if(item>=0133&&item<=0140){
                System.out.println("Вы ввели спецсимвол");
                 }else if(item>=0173&&item<=0177){
                      System.out.println("Вы ввели спецсимвол");
                         }
                        else{
                             System.out.println("Вы ввели букву");
                        }
    }
}
