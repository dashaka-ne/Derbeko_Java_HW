package home_work_3.calcs.simple;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithMathExtends  extends CalculatorWithOperator implements ICalculator {



    // метод numberExponentiationMath возводит число в степень
    //@param a число
    //@param b степень
    //@return возвращает число возведенное в степен
    public double numberExponentiation(double a,int b) {
        return Math.pow(a,b);
    }

    //метод numberModule находит модуль числа
    //@param a число
    //@return возвращает модуль числа
    public double numberModule(double a) {
        return Math.abs(a);
    }

    // метод numberSquareRootMath находит квадратный корень из числа
    //@param a число
    //@return квадратный корень
    public double numberSquareRoot(double a) {
        return Math.sqrt(a);
    }
}
