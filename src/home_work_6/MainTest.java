package home_work_6;

public class MainTest {
    public static void main(String[] args) {
        SearchRegisterIgnore s=new SearchRegisterIgnore(new RegExSearch());
        System.out.println(s.search("мир  мИр  мир! мир- анмир,,,,, . мирный МИР ","мир"));
    }
}
