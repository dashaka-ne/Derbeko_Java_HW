package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;


public class CalculatorWithCounterAutoChoiceAgregation {
    private long countOperation=0;
    private CalculatorWithOperator calculator1;
    private CalculatorWithMathCopy calculator2;
    private CalculatorWithMathExtends calculator3;


    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithOperator calculator){
        this.calculator1=calculator;
    }

    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithMathCopy calculator){
        this.calculator2=calculator;
    }

    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithMathExtends calculator){
        this.calculator3=calculator;
    }


    //метод numbersAddition  суммирует 2 числа
    //@param a слагаемое
    //@param b слагаемое
    //@return возвращает сумму чисeл
    public double numbersAddition(double a, double b){
        if(calculator1!=null){
            incrementCountOperation();
            return calculator1.numbersAddition(a, b);
        }else if(calculator2!=null){
        incrementCountOperation();
        return calculator2.numbersAddition(a, b);
        }else{
            incrementCountOperation();
            return calculator3.numbersAddition(a, b);
        }
    }


    //метод numbersSubtraction  находит разницу чисел
    //@param a уменьшаемое
    //@param b вычитаемое
    //@return возвращает разность чисел
    public double numbersSubtraction(double a, double b){
        if(calculator1!=null){
            incrementCountOperation();
            return calculator1.numbersSubtraction(a, b);
        }else if(calculator2!=null){
            incrementCountOperation();
            return calculator2.numbersSubtraction(a, b);
        }else{
            incrementCountOperation();
            return calculator3.numbersSubtraction(a, b);
        }
    }



    //метод numbersDivision находит частное  чисел
    //@param a делимое
    //@param b делитель
    //@return возвращает частное чисeл
    public double numbersDivision(double a, double b) {
        if(calculator1!=null){
            incrementCountOperation();
            return calculator1.numbersDivision(a, b);
        }else if(calculator2!=null){
            incrementCountOperation();
            return calculator2.numbersDivision(a, b);
        }else{
            incrementCountOperation();
            return calculator3.numbersDivision(a, b);
        }
    }



    //метод numbersMultiplication находит произведение чисел
    //@param a множитель
    //@param b множитель
    //@return возвращает произведение чисeл
    public double numbersMultiplication(double a, double b) {
        if(calculator1!=null){
            incrementCountOperation();
            return calculator1.numbersMultiplication(a, b);
        }else if(calculator2!=null){
            incrementCountOperation();
            return calculator2.numbersMultiplication(a, b);
        }else{
            incrementCountOperation();
            return calculator3.numbersMultiplication(a, b);
        }
    }



    // метод numberExponentiation возводит число в степень
    //@param a число
    //@param b степень
    //@return возвращает число возведенное в степень
    public double numberExponentiation(double a,int b) {
        if(calculator1!=null){
            incrementCountOperation();
            return calculator1.numberExponentiation(a, b);
        }else if(calculator2!=null){
            incrementCountOperation();
            return calculator2.numberExponentiation(a, b);
        }else{
            incrementCountOperation();
            return calculator3.numberExponentiation(a, b);
        }
    }



    //метод numberModule находит модуль числа
    //@param a число
    //@return возвращает модуль числа
    public double numberModule(double a) {
        if(calculator1!=null){
            incrementCountOperation();
            return calculator1.numberModule(a);
        }else if(calculator2!=null){
            incrementCountOperation();
            return calculator2.numberModule(a);
        }else{
            incrementCountOperation();
            return calculator3.numberModule(a);
        }
    }



    // метод numberSquareRoot находит квадратный корень из числа
    //@param a число
    //@return квадратный корень
    public double numberSquareRoot(double a) {
        if(calculator1!=null){
            incrementCountOperation();
            return calculator1.numberSquareRoot(a);
        }else if(calculator2!=null){
            incrementCountOperation();
            return calculator2.numberSquareRoot(a);
        }else{
            incrementCountOperation();
            return calculator3.numberSquareRoot(a);
        }
    }



    //метод getCountOperation возвращает количество использований данного калькулятора
    //@return возвращает количество использований калькулятора
    public long getCountOperation() {
        return countOperation;
    }

    //метод setCountOperation устанавливает значение в поле countOperation
    public void setCountOperation(long countOperation) {
        this.countOperation = countOperation;
    }

    //метод incrementCountOperation увеличивает внутренний счетчик в калькуляторе
    public void incrementCountOperation(){
        countOperation++;
    }
}

