package home_work_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AverageTest {
    @Test
    public void avgB() {
        assertEquals("Average number is: 10", Average.avg(15, 10, 5));
    }

    @Test
    public void avgC() {
        assertEquals("Average number is: 10", Average.avg(15, 5, 10));
    }

    @Test
    public void avgA() {
        assertEquals("Average number is: 10", Average.avg(10, 15, 5));
    }

    @Test
    public void avgC2() {
        assertEquals("Average number is: 10", Average.avg(5, 15, 10));
    }

    @Test
    public void avgB2() {
        assertEquals("Average number is: 10", Average.avg(5, 10, 15));
    }

    @Test
    public void avgA2() {
        assertEquals("Average number is: 10", Average.avg(10, 5, 15));
    }

    @Test
    public void avgA3() {
        assertEquals("Average number is: -5", Average.avg(-5, 5, -15));
    }

    @Test
    public void avgB3() {
        assertEquals("Average number is: 0", Average.avg(-5, 0, 5));
    }

    @Test
    public void avgC3() {
        assertEquals("Average number is: -1", Average.avg(-15, 10, -1));
    }

    @Test
    public void avgA4() {
        assertEquals("Average number is: 1", Average.avg(1, 1, 2));
    }

    @Test
    public void avgC4() {
        assertEquals("Average number is: 1", Average.avg(1, 2, 1));
    }

    @Test
    public void avgB4() {
        assertEquals("Average number is: 2", Average.avg(5, 2, 2));
    }

    @Test
    public void avgA5() {
        assertEquals("Average number is: 1", Average.avg(1, 1, 0));
    }

    @Test
    public void avgC5() {
        assertEquals("Average number is: 1", Average.avg(1, 0, 1));
    }

    @Test
    public void avgB5() {
        assertEquals("Average number is: 2", Average.avg(1, 2, 2));
    }

    @Test
    public void avgABC() {
        assertEquals("Average number is: 2", Average.avg(2, 2, 2));
    }

}
