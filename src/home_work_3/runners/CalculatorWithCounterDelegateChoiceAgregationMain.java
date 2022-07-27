package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoChoiceAgregation;
import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterDelegateChoiceAgregationMain {
    public static void main(String[] args) {

        CalculatorWithCounterAutoChoiceAgregation objectCalculator=new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithOperator());
        double division=objectCalculator.numbersDivision(28.,5);
        double exponent=objectCalculator.numberExponentiation(division,2);
        double multiplication=objectCalculator.numbersMultiplication(15,7);
        double additional=objectCalculator.numbersAddition(multiplication,exponent);
        double result=objectCalculator.numbersAddition(4.1, additional);
        System.out.println("Результат: "+result+ " Счетчик: "+ objectCalculator.getCountOperation());


        CalculatorWithCounterAutoChoiceAgregation objectCalculator2=new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithMathCopy());
        double division2=objectCalculator2.numbersDivision(28.,5);
        double exponent2=objectCalculator2.numberExponentiation(division2,2);
        double multiplication2=objectCalculator2.numbersMultiplication(15,7);
        double additional2=objectCalculator2.numbersAddition(multiplication2,exponent2);
        double result2=objectCalculator2.numbersAddition(4.1, additional2);
        System.out.println("Результат: "+result2+ " Счетчик: "+ objectCalculator2.getCountOperation());

        CalculatorWithCounterAutoChoiceAgregation objectCalculator3=new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithMathExtends());
        double division3=objectCalculator3.numbersDivision(28.,5);
        double exponent3=objectCalculator3.numberExponentiation(division3,2);
        double multiplication3=objectCalculator3.numbersMultiplication(15,7);
        double additional3=objectCalculator3.numbersAddition(multiplication3,exponent3);
        double result3=objectCalculator3.numbersAddition(4.1, additional3);
        System.out.println("Результат: "+result3+ " Счетчик: "+ objectCalculator3.getCountOperation());


    }
}
