package home_work_1;
import java.util.Scanner;

public class NameOne {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String name = in.next();
        Object name1="Вася";
        Object name2="Анастасия";
        if (name1.equals(name)){
            System.out.println("Привет!");
            System.out.println("Я тебя так долго ждал");
        }
        if (name2.equals(name)){
            System.out.println("Я тебя так долго ждал");
        }
        if (!name1.equals(name)&&!name2.equals(name)){
           System.out.println("Добрый день, а вы кто?");
        }
    }
}
