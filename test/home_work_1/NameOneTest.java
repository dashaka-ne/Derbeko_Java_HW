package home_work_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NameOneTest {
    public final String hello="Привет!\n Я тебя так долго ждал";
    public final String wait="Я тебя так долго ждал";
    public final String unknown="Добрый день, а вы кто?";

    @Test
    public void nameCheckIf(){
        ICommunicationPrinter nameOne=new NameOne();
        assertEquals(hello,nameOne.welcome("Вася"));
    }

    @Test
    public void nameCheckIf2(){
        ICommunicationPrinter nameOne=new NameOne();
        assertEquals(wait,nameOne.welcome("Анастасия"));
    }

    @Test
    public void nameCheckIf3(){
        ICommunicationPrinter nameOne=new NameOne();
        assertNotEquals(unknown,nameOne.welcome("Анастасия"));
    }
    @Test
    public void nameCheckIf4(){
        ICommunicationPrinter nameOne=new NameOne();
        assertNotEquals(unknown,nameOne.welcome("Вася"));
    }
}