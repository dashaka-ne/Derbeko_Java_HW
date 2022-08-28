package home_work_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class YearTest {
    @Test
    public void yearCheck() {
        assertEquals("2019-невисокосный год", Year.text(2019));
    }

    @Test
    public void yearCheck2() {
        assertEquals("1700-невисокосный год", Year.text(1700));
    }

    @Test
    public void yearCheck3() {
        assertEquals("1600-високосный год", Year.text(1600));
    }

    @Test
    public void yearCheck4() {
        assertEquals("2100-невисокосный год", Year.text(2100));
    }

}