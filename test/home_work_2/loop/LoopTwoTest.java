package home_work_2.loop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LoopTwoTest {
    @Test
    public void resultCheck() {
        assertEquals(10080, LoopTwo.result(new long[]{1, 8, 1, 2, 3, 2, 3, 7, 5}));
    }

    @Test
    public void resultCheck2() {
        assertEquals(1, LoopTwo.result(new long[]{1}));
    }

    @Test
    public void numberArr() {
        long[] array = {5, 4, 3, 2, 1};
        assertArrayEquals(array, LoopTwo.numberArr(12345));
    }

    @Test
    public void numberArr2() {
        long[] array = {0};
        assertArrayEquals(array, LoopTwo.numberArr(0));
    }

}