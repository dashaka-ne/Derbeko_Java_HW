package home_work_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SleepTest {
    @Test
    public void dayWeekCheckTrue() {
        assertTrue(Sleep.isWeekDay("да"));
    }

    @Test
    public void dayWeekCheckFalse() {
        assertNotEquals(false, Sleep.isWeekDay("да"));
    }

    @Test
    public void dayVacationCheckTrue() {
        assertTrue(Sleep.isVacationDay("да"));
    }

    @Test
    public void dayVacationCheckFalse() {
        assertNotEquals(false, Sleep.isVacationDay("да"));
    }

    @Test
    public void resultTextCheck() {
        assertEquals("Можно спать!", Sleep.result(true));
    }

    @Test
    public void resultTextCheck2() {
        assertEquals("Пора работать!", Sleep.result(false));
    }

    @Test
    public void resultSleep() {
        assertTrue(true);
    }

    @Test
    public void resultSleep2() {
        assertFalse(false);
    }

}