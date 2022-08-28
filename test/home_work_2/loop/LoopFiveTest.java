package home_work_2.loop;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class LoopFiveTest {
    @Test
    public void checkMaxNumber() {
        assertEquals(9, LoopFive.largestNumber(189401));
    }

    @Test
    public void checkRevert() {
        assertEquals("104981", LoopFive.revert("189401"));
    }

    @Test
    public void checkFib() {
        int[] arrExpected = {1, 2, 3, 5, 8};
        int[] arrActual = LoopFive.fib(5);
        assertArrayEquals(arrExpected, arrActual);
    }

    @Test
    public void checkEvenOdd() {
        int[] arrExpected = {3, 4};
        int[] arrActual = LoopFive.evenOdd(1234459);
        assertArrayEquals(arrExpected, arrActual);
    }

    @Test
    public void checkStep() {
        int[] arrExpected = {3, 6, 9, 12, 15};
        int[] arrActual = LoopFive.step(3, 16, 3);
        assertArrayEquals(arrExpected, arrActual);
    }

    @Test
    public void checkStep2() {
        int[] arrExpected = {3, 6, 9, 12, 15, 18};
        int[] arrActual = LoopFive.step(3, 18, 3);
        assertArrayEquals(arrExpected, arrActual);
    }

    @Test
    public void checkStep3() {
        int[] arrExpected = {-4, 1, 6, 11, 16};
        int[] arrActual = LoopFive.step(-4, 18, 5);
        assertArrayEquals(arrExpected, arrActual);
    }
}