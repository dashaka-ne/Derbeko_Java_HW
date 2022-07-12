package home_work_1;

import java.util.Scanner;

public class Bitwise {

    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.print("Input first number: ");//число 22 в двоичной 00010110
            int numOne = in.nextInt();
            System.out.print("Input second number: ");// число 13 в двоичной 00001101
            int numTwo = in.nextInt();

            System.out.printf("AND condition: %d \n", numOne&numTwo);// в двоичной 00000100
            System.out.printf("OR condition: %d \n", numOne|numTwo);// в двоичной 00011111
    }
}
/*
 при вводе 42.5 в текущий код- ошибка "Exception in thread "main" java.util.InputMismatchException"
 если изменить тип переменной с int на double, то ошибка "java: bad operand types for binary operator '&'"
*/
