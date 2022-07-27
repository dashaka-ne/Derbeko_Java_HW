package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoAgregation;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterDelegateAgregationMain {
        public static void main(String[] args) {
        CalculatorWithCounterAutoAgregation objectCalculator=new CalculatorWithCounterAutoAgregation(new CalculatorWithOperator());
        double division=objectCalculator.numbersDivision(28.,5);
        double exponent=objectCalculator.numberExponentiation(division,2);
        double multiplication=objectCalculator.numbersMultiplication(15,7);
        double additional=objectCalculator.numbersAddition(multiplication,exponent);
        double result=objectCalculator.numbersAddition(4.1, additional);

        System.out.println("Результат: "+result+ " Счетчик: "+ objectCalculator.getCountOperation());
    }
}
