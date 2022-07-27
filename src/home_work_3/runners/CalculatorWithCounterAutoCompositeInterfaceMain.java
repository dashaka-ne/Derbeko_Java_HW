package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoAgregationInterface;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoCompositeInterfaceMain {
    public static void main(String[] args) {
        CalculatorWithCounterAutoAgregationInterface calculator=new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithOperator());
        double division=calculator.numbersDivision(28.,5);
        double exponent=calculator.numberExponentiation(division,2);
        double multiplication=calculator.numbersMultiplication(15,7);
        double additional=calculator.numbersAddition(multiplication,exponent);
        double result=calculator.numbersAddition(4.1, additional);
        System.out.println("Результат: "+result+ " Счетчик: "+ calculator.getCountOperation());

    }
}
