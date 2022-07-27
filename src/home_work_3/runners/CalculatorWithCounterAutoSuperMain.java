package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoSuper;

public class CalculatorWithCounterAutoSuperMain {
    public static void main(String[] args) {
        CalculatorWithCounterAutoSuper object=new CalculatorWithCounterAutoSuper();
        double division=object.numbersDivision(28.,5);
        double exponent=object.numberExponentiation(division,2);
        double multiplication=object.numbersMultiplication(15,7);
        double additional=object.numbersAddition(multiplication,exponent);
        double result=object.numbersAddition(4.1, additional);

        System.out.println("Результат: "+result+ " Счетчик: "+ object.getCountOperation());
    }
}
