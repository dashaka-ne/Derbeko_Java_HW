package home_work_1;

import java.util.Scanner;

public class ByteToKilobyte {
    public static void main(String[] args){
            Scanner in = new Scanner(System.in);
            System.out.print("Введите число: ");
            float num = in.nextFloat();
            System.out.print("Введите единицу измерения b или kb: ");
            String unit = in.next();
            if (unit.equals("b")) {
                System.out.println("Это "+num/1024+" килобайт");
                in.close();
            } else {
                if(unit.equals("kb")){
                    System.out.println("Это "+num*1024+" байт");
                     }else{
                    System.out.println("Вы ввели неверную единицу измерения");
                    }
            }
    }
}



