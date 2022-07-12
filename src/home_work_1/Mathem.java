package home_work_1;

import java.util.Scanner;

public class Mathem {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Operations with 1 argument");
        System.out.print("Input number: ");
        double a=in.nextDouble();
        System.out.println("The cube root is "+Math.cbrt(a));
        System.out.println("The natural logarithm is "+Math.log(a));
        System.out.println("Random value: "+Math.random());
        System.out.println("Round value: "+Math.round(a));
        System.out.println("The square root is "+Math.sqrt(a));
        System.out.println("The value whose arc cosine "+Math.acos(a));
        System.out.println("Operations with 2 arguments");
        System.out.print("Input first argument: ");
        int b=in.nextInt();
        System.out.print("Input second argument: ");
        int c=in.nextInt();
        System.out.println("First argument raised to the power of the second argument: "+Math.pow(b,c));
        System.out.println("The sum of its arguments: "+Math.addExact(b,c));
        System.out.println("Max: "+Math.max(b,c));
        System.out.println("The floating-point number in the direction of the second argument: "+Math.nextAfter(b,c));
    }
}
