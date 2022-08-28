package home_work_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NameTwoTest {
    public final String hello="Привет!\n Я тебя так долго ждал";
    public final String wait="Я тебя так долго ждал";
    public final String unknown="Добрый день, а вы кто?";
    @Test
    public void nameCheckIfElse(){
        ICommunicationPrinter nameOne=new NameOne();
        assertEquals(hello,nameOne.welcome("Вася"));
    }

    @Test
    public void nameCheckIfElse2(){
        ICommunicationPrinter nameTwo=new NameTwo();
        assertEquals(wait, nameTwo.welcome("Анастасия"));
    }

    @Test
    public void nameCheckIfElse3(){
        ICommunicationPrinter nameTwo=new NameTwo();
        assertNotEquals(unknown, nameTwo.welcome("Анастасия"));
    }
    @Test
    public void nameCheckIfElse4(){
        ICommunicationPrinter nameTwo=new NameTwo();
        assertNotEquals(unknown, nameTwo.welcome("Вася"));
    }

}