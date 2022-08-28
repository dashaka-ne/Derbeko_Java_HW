package home_work_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OddTest {
    @Test
    public void addition() {
        assertEquals("Число 4 четное", Odd.odd(4));
    }

    @Test
    public void addition2() {
        assertEquals("Число 5 нечетное", Odd.odd(5));
    }

    @Test
    public void addition3() {
        assertEquals("Число 0 четное", Odd.odd(0));
    }
    @Test
    public void addition4() {
        assertEquals("Число -10 четное", Odd.odd(-10));
    }
    @Test
    public void addition5() {
        assertEquals("Число -111 нечетное", Odd.odd(-111));
    }
}