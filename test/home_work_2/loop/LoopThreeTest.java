package home_work_2.loop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LoopThreeTest {
    @Test
    public void degreeCheck() {
        assertEquals(1889568.0, LoopThree.result(18, 5));
    }

    @Test
    public void degreeCheck2() {
        assertEquals(56.25, LoopThree.result(7.5, 2));
    }

    @Test
    public void degreeCheck3() {
        assertEquals(1, LoopThree.result(-1, 0));
    }
}