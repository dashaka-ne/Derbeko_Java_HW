package home_work_4;


import java.util.Arrays;

public class DataContainerMain {
    public static void main(String[] args) {
        Integer[] dataArr = new Integer[9];
        DataContainer<Integer> data = new DataContainer<>(dataArr);
        ComparatorMy comparator = new ComparatorMy();//создание компоратора

        String [] arrString=new String[5];  // для преобразования to String
        DataContainer <String> arr = new DataContainer<>(arrString);


        data.add(1);
        data.add(8);
        data.add(3);
        data.add(5);
        data.add(8);

        arr.add("текст");
        arr.add("текст2");
        arr.add("текст3");

        System.out.println("Индекс добавленного числа: " + data.add(7));
        System.out.println("Попытка добавления null " + data.add(null));
        System.out.println("Число по индексу: " + data.getIndex(3));
        System.out.println("Массив: " + Arrays.toString(data.getItems()));
        System.out.println("Удаление по индексу: " + data.delete(2));//удаление по индексу
        System.out.println("После удаления по индексу: " + Arrays.toString(data.getItems()));
        System.out.println("Удаление по значению: " + data.delete(Integer.valueOf(8)));//удаление по значению
        System.out.println("После удаления по значению: " + Arrays.toString(data.getItems()));
        System.out.println("Попытка удаления значения=null: " + data.delete(null));//удаление если передано null для значения
        System.out.println("После удаления null: " + Arrays.toString(data.getItems()));

        data.sort(comparator);//сортировка компоратором
        System.out.println("Сортировка: " + Arrays.toString(data.getItems()));//на печать массив после сортировки
        System.out.printf("Переопределенный toString: "+ arr.toString());// c переопределенным toString

    }
}