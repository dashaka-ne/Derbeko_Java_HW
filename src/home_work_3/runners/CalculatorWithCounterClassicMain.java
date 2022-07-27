package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterClassic;

public class CalculatorWithCounterClassicMain {
    public static void main(String[] args) {
        CalculatorWithCounterClassic object=new CalculatorWithCounterClassic();
        double division=object.numbersDivision(28.,5);
        object.incrementCountOperation();
        double exponent=object.numberExponentiation(division,2);
        object.incrementCountOperation();
        double multiplication=object.numbersMultiplication(15,7);
        object.incrementCountOperation();
        double additional=object.numbersAddition(multiplication,exponent);
        object.incrementCountOperation();
        double result=4.1+additional;
        object.incrementCountOperation();

        System.out.println("Результат выражения: "+result+" Счетчик: "+object.getCountOperation());
    }
}
