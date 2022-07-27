package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterClassic extends CalculatorWithMathExtends {
    private long countOperation=0; // счетчик

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
