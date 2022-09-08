package home_work_6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EasySearchTest {
    @Test
    public void checkSearch1(){
        ISearchEngine count=new EasySearch();
        assertEquals(3,count.search("мир мирный война Мир мир немирный МИР мир", "мир"));
    }

    @Test
    public void checkSearch2(){
        ISearchEngine count=new EasySearch();
        assertEquals(1,count.search("мир мирный война Мир мир немирный МИР мир", "Мир"));
    }

    @Test
    public void checkSearch3(){
        ISearchEngine count=new EasySearch();
        assertEquals(0,count.search("мир мирный война Мир мир немирный МИР мир", "мИр"));
    }

    @Test
    public void checkSearch4(){
        ISearchEngine count=new EasySearch();
        assertEquals(1,count.search("мир мирный война Мир мир немирный МИР мир ", "МИР"));
    }

    @Test
    public void checkSearch5(){
        ISearchEngine count=new EasySearch();
        assertEquals(6,count.search(" мир мир: мир! мир- мир, мирный, немирный! мирр мир  ", "мир"));
    }

    @Test
    public void checkSearch6(){
        ISearchEngine count=new EasySearch();
        assertEquals(0,count.search("", "мир"));
    }
    @Test
    public void checkSearch7(){
        ISearchEngine count=new EasySearch();
        assertEquals(1,count.search( "и", "и"));
    }

    @Test
    public void checkSearch8(){
        ISearchEngine count=new EasySearch();
        assertEquals(1,count.search( " и ", "и"));
    }
}