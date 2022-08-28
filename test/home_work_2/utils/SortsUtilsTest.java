package home_work_2.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortsUtilsTest {
    private final int[] expected1 = {1, 3, 8, 19, 45};
    private final int[] actual1 = {1, 45, 3, 19, 8};

    private final int[] expected2 = {1, 2, 3, 4, 5, 6};
    private final int[] actual2 = {3, 1, 6, 4, 2, 5};

    private final int[] expected3 = {1, 1, 1, 1};
    private final int[] actual3 = {1, 1, 1, 1};

    private final int[] expected4 = {1, 5, 9, 9, 9, 99};
    private final int[] actual4 = {9, 1, 5, 99, 9, 9};

    private final int[] expected5 = {};
    private final int[] actual5 = {};

    private final int[] expected6 = {1, 2, 3, 4, 5, 6};
    private final int[] actual6 = {6, 5, 4, 3, 2, 1};

    @Test
    public void bubble() {
        assertArrayEquals(expected1, SortsUtils.bubble(actual1));
    }

    @Test
    public void bubble2() {
        assertArrayEquals(expected2, SortsUtils.bubble(actual2));
    }

    @Test
    public void bubble3() {
        assertArrayEquals(expected3, SortsUtils.bubble(actual3));
    }

    @Test
    public void bubble4() {
        assertArrayEquals(expected4, SortsUtils.bubble(actual4));
    }

    @Test
    public void bubble5() {
        assertArrayEquals(expected5, SortsUtils.bubble(actual5));
    }

    @Test
    public void bubble6() {
        assertArrayEquals(expected6, SortsUtils.bubble(actual6));
    }


    @Test
    public void shake() {
        assertArrayEquals(expected1, SortsUtils.shake(actual1));
    }

    @Test
    public void shake2() {
        assertArrayEquals(expected2, SortsUtils.shake(actual2));
    }

    @Test
    public void shake3() {
        assertArrayEquals(expected3, SortsUtils.shake(actual3));
    }

    @Test
    public void shake4() {
        assertArrayEquals(expected4, SortsUtils.shake(actual4));
    }

    @Test
    public void shake5() {
        assertArrayEquals(expected5, SortsUtils.shake(actual5));
    }

    @Test
    public void shake6() {
        assertArrayEquals(expected6, SortsUtils.shake(actual6));
    }

}