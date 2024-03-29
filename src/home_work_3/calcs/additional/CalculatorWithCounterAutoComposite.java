package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoComposite {
    private long countOperation=0;

    private final CalculatorWithOperator calculatorWithOperator;

    public CalculatorWithCounterAutoComposite(){

        this.calculatorWithOperator= new CalculatorWithOperator();
    }


    //метод numbersAddition  суммирует 2 числа
    //@param a слагаемое
    //@param b слагаемое
    //@return возвращает сумму чисeл
    public double numbersAddition(double a, double b){
        incrementCountOperation();
        return calculatorWithOperator.numbersAddition(a, b);
    }

    //метод numbersSubtraction  находит разницу чисел
    //@param a уменьшаемое
    //@param b вычитаемое
    //@return возвращает разность чисел
    public double numbersSubtraction(double a, double b){
        incrementCountOperation();
        return calculatorWithOperator.numbersSubtraction(a, b);
    }

    //метод numbersDivision находит частное  чисел
    //@param a делимое
    //@param b делитель
    //@return возвращает частное чисeл
    public double numbersDivision(double a, double b) {
        incrementCountOperation();
        return calculatorWithOperator.numbersDivision(a, b);
    }

    //метод numbersMultiplication находит произведение чисел
    //@param a множитель
    //@param b множитель
    //@return возвращает произведение чисeл
    public double numbersMultiplication(double a, double b) {
        incrementCountOperation();
        return calculatorWithOperator.numbersMultiplication(a, b);
    }

    // метод numberExponentiation возводит число в степень
    //@param a число
    //@param b степень
    //@return возвращает число возведенное в степень
    public double numberExponentiation(double a,int b) {
        incrementCountOperation();
        return calculatorWithOperator.numberExponentiation(a, b);
    }

    //метод numberModule находит модуль числа
    //@param a число
    //@return возвращает модуль числа
    public double numberModule(double a) {
        incrementCountOperation();
        return calculatorWithOperator.numberModule(a);
    }

    // метод numberSquareRoot находит квадратный корень из числа
    //@param a число
    //@return квадратный корень
    public double numberSquareRoot(double a) {
        incrementCountOperation();
        return calculatorWithOperator.numberSquareRoot(a);
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
