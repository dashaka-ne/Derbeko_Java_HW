package home_work_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NameThreeTest {
    public final String hello="Привет!\n Я тебя так долго ждал";
    public final String wait="Я тебя так долго ждал";
    public final String unknown="Добрый день, а вы кто?";
    @Test
    public void nameCheckSwitch(){
        ICommunicationPrinter nameThree=new NameThree();
        assertEquals(hello,nameThree.welcome("Вася"));
    }

    @Test
    public void nameCheckSwitch2(){
        ICommunicationPrinter nameThree=new NameThree();
        assertEquals(wait,nameThree.welcome("Анастасия"));
    }

    @Test
    public void nameCheckSwitch3(){
        ICommunicationPrinter nameThree=new NameThree();
        assertNotEquals(unknown,nameThree.welcome("Анастасия"));
    }
    @Test
    public void nameCheckSwitch4(){
        ICommunicationPrinter nameThree=new NameThree();
        assertNotEquals(unknown,nameThree.welcome("Вася"));
    }

}