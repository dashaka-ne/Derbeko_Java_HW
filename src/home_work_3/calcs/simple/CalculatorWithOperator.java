package home_work_3.calcs.simple;


import home_work_3.calcs.api.ICalculator;

public class CalculatorWithOperator implements ICalculator {

    //метод numbersAddition  суммирует 2 числа
    //@param a слагаемое
    //@param b слагаемое
    //@return возвращает сумму чисeл
    public double numbersAddition(double a, double b){
        return a+b;
    }

    //метод numbersSubtraction  находит разницу чисел
    //@param a уменьшаемое
    //@param b вычитаемое
    //@return возвращает разность чисел
    public double numbersSubtraction(double a, double b){
        return a-b;
    }

    //метод numbersDivision находит частное  чисел
    //@param a делимое
    //@param b делитель
    //@return возвращает частное чисeл
    public double numbersDivision(double a, double b) {
        return a / b;
    }

    //метод numbersMultiplication находит произведение чисел
    //@param a множитель
    //@param b множитель
    //@return возвращает произведение чисeл
        public double numbersMultiplication(double a, double b) {
            return a * b;
        }

    // метод numberExponentiation возводит число в степень
    //@param a число
    //@param b степень
    //@return возвращает число возведенное в степень
    public double numberExponentiation(double a,int b) {
        double result=1.0;
        for(int i=0;i<b&&i>=0;i++){
            result=a*result;
        }
        return result;
    }

    //метод numberModule находит модуль числа
    //@param a число
    //@return возвращает модуль числа
    public double numberModule(double a) {
        if(a<0){
            a=a*(-1);
        }
        return a;
    }

    // метод numberSquareRoot находит квадратный корень из числа
    //@param a число
    //@return квадратный корень
    public double numberSquareRoot(double a) {
        return Math.sqrt(a);
    }


}
