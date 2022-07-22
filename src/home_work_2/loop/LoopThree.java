package home_work_2.loop;

import java.util.Scanner;

public class LoopThree {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите число: ");
        String valueRaw=in.nextLine();
        double number = Double.parseDouble(valueRaw.replace(',','.'));


        System.out.print("Введите степень: ");
        String degreeBeforeParsing = in.next();
        int degree = Integer.parseInt(degreeBeforeParsing, 10);
        double result = 1;
        if (degree == 0) {
            System.out.print(number + " ^ 0 = 0");
        } else {
            for (int i = 0; i < degree; i++) {
                result = result * number;
            }
            System.out.print(number + " ^ " + degree + " = " + result);
        }
    }
}

