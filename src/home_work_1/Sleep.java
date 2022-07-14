package home_work_1;

import java.util.Objects;
import java.util.Scanner;


public class Sleep{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Сегодня рабочий день? Введите  \"да\" или \"нет\" ");
        String weekdayToday=in.next();
        System.out.print("У вас отпуск? Введите  \"да\" или \"нет\" ");
        String vacationToday=in.next();
        boolean weekday;
        boolean vacation;
        if (weekdayToday.equals("да")){
            weekday=true;
        }else {
            weekday=false;
        }

        if (vacationToday.equals("да")){
            vacation=true;
        }else {
            vacation=false;
        }

        boolean result = sleepIn(vacation,weekday);
        if(result==true){
            System.out.println("Можно спать!");
        }else{
            System.out.println("Пора работать");
        }
    }
    public static boolean sleepIn(boolean vacation, boolean weekday){
        boolean sleep;
        if (vacation == true) {
            sleep = true;
        } else if (weekday == true) {
                sleep = false;
        } else {
            sleep = true;
        }
            return sleep;
   }
}

