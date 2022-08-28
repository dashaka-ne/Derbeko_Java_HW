package home_work_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivisionTest {
    @Test
    public void division() {
        assertEquals("Если число 6 разделить на 3 получится 2", Division.division(6, 3));
    }

    @Test
    public void division2() {
        assertEquals("Если число 6 разделить на 4 получится 1 с остатком 2", Division.division(6, 4));
    }

    @Test
    public void division3() {
        assertEquals("Если число 0 разделить на 3 получится 0", Division.division(0, 3));
    }

    @Test
    public void division4() {
        assertEquals("Если число -15 разделить на 2 получится -7 с остатком -1", Division.division(-15, 2));
    }

    @Test
    public void division5() {
        assertEquals("Если число -100 разделить на -20 получится 5", Division.division(-100, -20));
    }

    @Test
    public void division6() {
        assertEquals("Если число 1 разделить на 2 получится 0 с остатком 1", Division.division(1, 2));
    }
}