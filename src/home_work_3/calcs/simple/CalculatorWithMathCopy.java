package home_work_3.calcs.simple;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithMathCopy implements ICalculator {
        //метод numbersAddition  суммирует 2 числа
        //@param a слагаемое
        //@param b слагаемое
        //@return возвращает сумму чисeл
        public double numbersAddition(double a, double b) {
            double c = a + b;
            return c;
        }

        //метод numbersSubtraction  находит разницу чисел
        //@param a уменьшаемое
        //@param b вычитаемое
        //@return возвращает разность чисел
        public double numbersSubtraction(double a, double b) {
            double c = a - b;
            return c;
        }

        //метод numbersDivision находит частное  чисел
        //@param a делимое
        //@param b делитель
        //@return возвращает частное чисeл
        public double numbersDivision(double a, double b) {
            double c = a / b;
            return c;
        }

        //метод numbersMultiplication находит произведение чисел
        //@param a множитель
        //@param b множитель
        //@return возвращает произведение чисeл
        public double numbersMultiplication(double a, double b) {
            double c = a * b;
            return c;
        }

        // метод numberExponentiationMath возводит число в степень
        //@param a число
        //@param b степень
        //@return возвращает число возведенное в степен
        public double numberExponentiation(double a,int b) {
            double c=Math.pow(a,b);
            return c;
        }

        //метод numberModule находит модуль числа
        //@param a число
        //@return возвращает модуль числа
        public double numberModule(double a) {
            a=Math.abs(a);
            return a;
        }

        // метод numberSquareRootMath находит квадратный корень из числа
        //@param a число
        //@return квадратный корень
        public double numberSquareRoot(double a) {
            double c=Math.sqrt(a);
            return c;
        }


    }

