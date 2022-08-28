package home_work_2.loop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LoopOneTest {
    @Test
    public void resultCheck() {
        assertEquals(120, LoopOne.result(new long[]{1, 2, 3, 4, 5}));
    }

    @Test
    public void resultCheck2() {
        assertEquals(0, LoopOne.result(new long[]{1, 0}));
    }

    @Test
    public void createArrayCheck() {
        long[] array = {1, 2, 3, 4, 5};
        assertArrayEquals(array, LoopOne.createArr(5));
    }
}