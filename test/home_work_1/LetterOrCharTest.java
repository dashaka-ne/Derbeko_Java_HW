package home_work_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LetterOrCharTest {
    @Test
    public void checkLetter(){
        assertEquals("Вы ввели букву",LetterOrChar.text("а"));
    }
    @Test
    public void checkLetter1(){
        assertEquals("Вы ввели букву",LetterOrChar.text("A"));
    }
    @Test
    public void checkLetter2(){
        assertEquals("Вы ввели букву",LetterOrChar.text("Я"));
    }
    @Test
    public void checkLetter3(){
        assertEquals("Вы ввели букву",LetterOrChar.text("z"));
    }
    @Test
    public void checkLetter4(){
        assertEquals("Вы ввели букву",LetterOrChar.text("ё"));
    }
    @Test
    public void checkLetter5(){
        assertEquals("Вы ввели символ",LetterOrChar.text("+"));
    }
    @Test
    public void checkLetter6(){
        assertEquals("Вы ввели символ",LetterOrChar.text("9"));
    }
    @Test
    public void checkLetter7(){
        assertEquals("Вы ввели символ",LetterOrChar.text("#"));
    }
    @Test
    public void checkLetter10(){
        assertEquals("Вы ввели букву",LetterOrChar.text("Ё"));
    }
    @Test
    public void checkLetter11(){
        assertEquals("Вы ввели букву",LetterOrChar.text("п"));
    }
    @Test
    public void checkLetter12(){
        assertEquals("Вы ввели букву",LetterOrChar.text("R"));
    }
}