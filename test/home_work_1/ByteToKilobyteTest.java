package home_work_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ByteToKilobyteTest {
    @Test
    public void textB() {
        assertEquals("Это 1 килобайт", ByteToKilobyte.text("b", 1024));
    }

    @Test
    public void textKb() {
        assertEquals("Это 1024 байт", ByteToKilobyte.text("kb", 1));
    }

    @Test
    public void textError() {
        assertNotEquals("Вы ввели неверную единицу измерения", ByteToKilobyte.text("kb", 3));
    }

    @Test
    public void textError2() {
        assertNotEquals("Вы ввели неверную единицу измерения", ByteToKilobyte.text("b", 30));
    }

    @Test
    public void textB2() {
        assertEquals("Это 0 килобайт", ByteToKilobyte.text("b", 30));
    }

    @Test
    public void textKb2() {
        assertEquals("Это 0 байт", ByteToKilobyte.text("kb", 0));
    }
}