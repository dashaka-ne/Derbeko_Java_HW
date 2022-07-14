package home_work_1;
import java.util.Objects;
import java.util.Scanner;

public class NameOne {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String name = in.next();
        Object name1="Вася";
        Object name2="Анастасия";
        if(Objects.equals(name,name1)){
            System.out.println("Привет!\nЯ тебя так долго ждал");
        }
        if(Objects.equals(name,name2)){
            System.out.println("Я тебя так долго ждал");
        }
        if (!Objects.equals(name,name1)&&!Objects.equals(name,name2)){
            System.out.println("Добрый день, а вы кто?");
        }
    }
}
