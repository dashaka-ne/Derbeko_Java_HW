package home_work_4;


import java.util.Arrays;

public class DataContainerMain {
    public static void main(String[] args) {
        Integer[] dataArr=new Integer[5];
        DataContainer<Integer> data = new DataContainer<>(dataArr);
        data.add(8);
        data.add(5);
        data.add(7);
        System.out.println(data.add(8));
        System.out.println(data.add(null));
        System.out.println(data.getIndex(3));
        System.out.println(Arrays.toString(data.getItems()));
        System.out.println(data.delete(2));//удаление по индексу
        System.out.println("После удаления по индексу: "+Arrays.toString(data.getItems()));
        System.out.println(data.delete(Integer.valueOf(8)));//удаление по значению
        System.out.println("После удаления по значению: "+Arrays.toString(data.getItems()));
        System.out.println(data.delete(null));//удаление если передано null для значения
        System.out.println("После удаления null: "+Arrays.toString(data.getItems()));


    }
}
