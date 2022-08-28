package home_work_3.calcs.simple;

import home_work_3.calcs.additional.CalculatorWithCounterAutoAgregationInterface;
import home_work_3.calcs.api.ICalculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    //CalculatorWithOperator
    @Test
    public void numbersAddition() {
        ICalculator data = new CalculatorWithOperator();
        assertEquals(109.1, data.numbersAddition(4.1, 105));
    }

    @Test
    public void numbersSubtraction() {
        ICalculator data = new CalculatorWithOperator();
        assertEquals(105, data.numbersSubtraction(109.1, 4.1));
    }

    @Test
    public void numbersDivision() {
        ICalculator data = new CalculatorWithOperator();
        assertEquals(5.6, data.numbersDivision(28, 5));
    }

    @Test
    public void numbersMultiplication() {
        ICalculator data = new CalculatorWithOperator();
        assertEquals(105.0, data.numbersMultiplication(15, 7));
    }

    @Test
    public void numberExponentiation() {
        ICalculator data = new CalculatorWithOperator();
        assertEquals(31.359999999999996, data.numberExponentiation(5.6, 2));
    }

    @Test
    public void numberModule() {
        ICalculator data = new CalculatorWithOperator();
        assertEquals(3, data.numberModule(-3));
    }

    @Test
    public void numberModule2() {
        ICalculator data = new CalculatorWithOperator();
        assertEquals(3, data.numberModule(3));
    }

    @Test
    public void numberSquareRoot() {
        ICalculator data = new CalculatorWithOperator();
        assertEquals(7, data.numberSquareRoot(49));
    }

    //CalculatorWithMathCopy
    @Test
    public void numbersAddition1() {
        ICalculator data = new CalculatorWithMathCopy();
        assertEquals(109.1, data.numbersAddition(4.1, 105));
    }

    @Test
    public void numbersSubtraction1() {
        ICalculator data = new CalculatorWithMathCopy();
        assertEquals(105, data.numbersSubtraction(109.1, 4.1));
    }

    @Test
    public void numbersDivision1() {
        ICalculator data = new CalculatorWithMathCopy();
        assertEquals(5.6, data.numbersDivision(28, 5));
    }

    @Test
    public void numbersMultiplication1() {
        ICalculator data = new CalculatorWithMathCopy();
        assertEquals(105.0, data.numbersMultiplication(15, 7));
    }

    @Test
    public void numberExponentiation1() {
        ICalculator data = new CalculatorWithMathCopy();
        assertEquals(31.359999999999996, data.numberExponentiation(5.6, 2));
    }

    @Test
    public void numberModule1() {
        ICalculator data = new CalculatorWithMathCopy();
        assertEquals(3, data.numberModule(-3));
    }

    @Test
    public void numberModule12() {
        ICalculator data = new CalculatorWithMathCopy();
        assertEquals(3, data.numberModule(3));
    }

    @Test
    public void numberSquareRoot1() {
        ICalculator data = new CalculatorWithMathCopy();
        assertEquals(7, data.numberSquareRoot(49));
    }

    //CalculatorWithCounterAutoAgregationInterface
    @Test
    public void numbersAddition2() {
        ICalculator data = new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithMathCopy());
        assertEquals(109.1, data.numbersAddition(4.1, 105));
    }

    @Test
    public void numbersSubtraction2() {
        ICalculator data = new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithMathCopy());
        assertEquals(105, data.numbersSubtraction(109.1, 4.1));
    }

    @Test
    public void numbersDivision2() {
        ICalculator data = new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithMathCopy());
        assertEquals(5.6, data.numbersDivision(28, 5));
    }

    @Test
    public void numbersMultiplication2() {
        ICalculator data = new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithMathCopy());
        assertEquals(105.0, data.numbersMultiplication(15, 7));
    }

    @Test
    public void numberExponentiation2() {
        ICalculator data = new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithMathCopy());
        assertEquals(31.359999999999996, data.numberExponentiation(5.6, 2));
    }

    @Test
    public void numberModule21() {
        ICalculator data = new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithMathCopy());
        assertEquals(3, data.numberModule(-3));
    }

    @Test
    public void numberModule22() {
        ICalculator data = new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithMathCopy());
        assertEquals(3, data.numberModule(3));
    }

    @Test
    public void numberSquareRoot2() {
        ICalculator data = new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithMathCopy());
        assertEquals(7, data.numberSquareRoot(49));
    }

    //CalculatorWithMathExtends
    @Test
    public void numberExponentiation3() {
        ICalculator data = new CalculatorWithMathExtends();
        assertEquals(31.359999999999996, data.numberExponentiation(5.6, 2));
    }

    @Test
    public void numberModule3() {
        ICalculator data = new CalculatorWithMathExtends();
        assertEquals(3, data.numberModule(-3));
    }

    public void numberModule31() {
        ICalculator data = new CalculatorWithMathExtends();
        assertEquals(3, data.numberModule(3));
    }

    @Test
    public void numberSquareRoot3() {
        ICalculator data = new CalculatorWithMathExtends();
        assertEquals(7, data.numberSquareRoot(49));
    }
}