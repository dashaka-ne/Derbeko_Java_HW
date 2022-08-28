package home_work_2.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ForEachOperationTest {
    private final int[] arrActual = {1, 4, 5, 8, 12, 5, 0, 5};
    private final int[] arrExpectedAll = {1, 4, 5, 8, 12, 5, 0, 5};
    private final int[] arrExpectedSecond = {4, 8, 5, 5};
    private final int[] arrExpectedRevert = {5, 0, 5, 12, 8, 5, 4, 1};

    @Test
    public void doWhileAllCheck() {
        IArraysOperation t = new ForEachOperation();
        assertArrayEquals(arrExpectedAll, t.arrayAll(arrActual));
    }

    @Test
    public void doWhileSecondCheck() {
        IArraysOperation t = new ForEachOperation();
        assertArrayEquals(arrExpectedSecond, t.arrayEverySecond(arrActual));
    }

    @Test
    public void doWhileRevertCheck() {
        IArraysOperation t = new ForEachOperation();
        assertArrayEquals(arrExpectedRevert, t.arrayRevert(arrActual));
    }
}