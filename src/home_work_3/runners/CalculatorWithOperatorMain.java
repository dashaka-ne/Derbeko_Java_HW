package home_work_3.runners;

import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithOperatorMain {
    public static void main(String[] args) {
        CalculatorWithOperator object= new CalculatorWithOperator();
        double result= object.numbersAddition(4.1, object.numbersAddition(object.numbersMultiplication(15,7), object.numberExponentiation(object.numbersDivision(28,5),2)));
        System.out.println(result);
    }




}
