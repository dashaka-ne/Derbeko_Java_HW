package home_work_1;

public class Operators {
    public static void main(String[] args){
        //2.1
        int result1=5+2/8;
        System.out.println("result 2.1= "+ result1);// целая часть от 2/8 будет 0. 5+0=5

        //2.2
        int result2=(5+2) /8;
        System.out.println("result 2.2= "+ result2);// 5+2=7, целое от 7/8 будет 0

        //2.3
        int a=2;
        int result3=(5+a++) /8;
        System.out.println("result 2.3= "+ result3);
        /* a++ будет 2
         5+2=7,
         целое от 7/8 будет 0
         */

        //2.4
        int b=2;
        int c=8;
        int result4=(5+b++) /--c;
        System.out.println("result 2.4= "+ result4);
        /*
        b++ будет 2,
        5+2=7,
        --с это 8-1=7,
        целое от деления 7/7=1
         */

        //2.5
        int d=2;
        int e=8;
        int result5=(5*2 >> d++) /--e;
        System.out.println("result 2.5= "+ result5);
        /*
        5*2=10
        d++ будет 2,
        10>>2 будет в двоичной=10 и в десятичной=2,
        --e это 8-1=7,
        целое от 2/7 будет 0
        */

        //2.6
        int f=2;
        int g=8;
        int result6=(5+7>20?68:22*2 >> f++) /--g;
        System.out.println("result 2.6= "+ result6);
        /*
        5+7>20 это false, значит используем число 22
        22*2=44,
        f++ это 2
        44>>2 будет в двоичной 1011 и в десятичной 11
        --g это 8-1=7, целое от 11/7 будет 1
        */

        //2.7
        /*
        int h=2;
        int i=8;
        int result7=(5 + 7 > 20 ? 68 >= 68 : 22 * 2 >> h++) / --i;
        System.out.println("result 2.7= "+ result7);
        некорректная тернарная операция- после ? должно быть
        значение/условие со значением числовым
        */

        //2.8
        boolean result8=6 - 2 > 3 && 12 * 12 <= 119;
        System.out.println("result 2.8= "+result8);
        /*
        6 - 2 > 3 true
        12 * 12 <= 119 false
        true+false для AND возвращают false
         */

        //2.9
        boolean result9=true && false;
        System.out.println("result 2.9= "+result9);
        /*
        true+false для AND возвращают false
         */
    }
}
