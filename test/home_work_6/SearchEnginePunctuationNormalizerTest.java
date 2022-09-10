package home_work_6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SearchEnginePunctuationNormalizerTest {
    @Test
    public void checkSearch1(){
        ISearchEngine count = new SearchEnginePunctuationNormalizer(new RegExSearch());
        assertEquals(3,count.search("мир мирный война Мир мир немирный МИР мир", "мир"));
    }

    @Test
    public void checkSearch2(){
        ISearchEngine count = new SearchEnginePunctuationNormalizer(new RegExSearch());
        assertEquals(1,count.search("мир мирный война Мир мир немирный МИР мир", "Мир"));
    }

    @Test
    public void checkSearch3(){
        ISearchEngine count = new SearchEnginePunctuationNormalizer(new RegExSearch());
        assertEquals(0,count.search("мир мирный война Мир мир немирный МИР мир", "мИр"));
    }

    @Test
    public void checkSearch4(){
        ISearchEngine count = new SearchEnginePunctuationNormalizer(new RegExSearch());
        assertEquals(1,count.search("мир мирный война Мир мир немирный МИР мир ", "МИР"));
    }

    @Test
    public void checkSearch5(){
        ISearchEngine count = new SearchEnginePunctuationNormalizer(new RegExSearch());
        assertEquals(6,count.search(" мир мир: мир! мир- мир, мирный, немирный! мирр мир  ", "мир"));
    }

    @Test
    public void checkSearch6(){
        ISearchEngine count = new SearchEnginePunctuationNormalizer(new RegExSearch());
        assertEquals(0,count.search("", "мир"));
    }
    @Test
    public void checkSearch7(){
        ISearchEngine count = new SearchEnginePunctuationNormalizer(new RegExSearch());
        assertEquals(1,count.search( "и", "и"));
    }

    @Test
    public void checkSearch8(){
        ISearchEngine count = new SearchEnginePunctuationNormalizer(new RegExSearch());
        assertEquals(1,count.search( " и ", "и"));
    }

    @Test
    public void checkSearch9(){
        ISearchEngine count = new SearchEnginePunctuationNormalizer(new RegExSearch());
        assertEquals(5,count.search( " мир! (мир мир; :анмир :мир мировой,   мировой! !!мир ", "мир"));
    }

}