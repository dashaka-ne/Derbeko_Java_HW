package home_work_4;

import java.util.Arrays;
import java.util.Comparator;


public class DataContainer<T> {
    private T[] data;

    public DataContainer(T[]array){
            this.data = array;
        }

        //Задание 4
        //метод добавляет значение в массив вместо первого null значения
        //@param item - значение добавляемое в массив
        //@return индекс для которого было добавлено значение
        public int add (T item){
            if(item!=null){
                int c=arrIndex(data);                     //отдаем не null:в массиве был найден null
                    if (c >= 0) {
                        data[c] = item;
                        return c;
                    } else {                               //отдаем не null: в массиве нет null
                        data = Arrays.copyOf(data, data.length + 1);
                        data[data.length-1] = item;
                        return  data.length-1;
                    }
                 }
                return -1;          //отдаем -1 для null значения
            }



        //метод возвращает индекс первого null элемента
        //@param data массив в котором происходит поиск
        //@return возвращает индекс первой позиции с null или -1(означает что в массиве нет null)
        public int arrIndex (T[]data){
            for (int i = 0; i < data.length; i++) {
                if (data[i] == null) {
                    return i;
                }
            }
            return -1;
        }

        //Задание 5
        //метод возвращает значение хранимое  в массиве для указанного индекса
        //@param index индекс массива
        //@return значение для индекса
        public T getIndex(int index){
            if(index< data.length){
                return data[index];
            }else{
                return null;
            }
        }


        //Задание 6
        // метод возвращает значение поля data
        //@return возвращает  массив в data
        public T[] getItems(){
           return data;
        }



        //Задание 7
        //метод удаляет значения для индекса полученного в аргументе
        //@param index индекс
        //@return возвращает true при успешном удалении элемента и false если индекс выходит за пределы массива
        public boolean delete(int index){
            T[] data2;
        if (index<= data.length-1){
            int i;
            data2=Arrays.copyOf(data,data.length-(data.length-index));
            data2=Arrays.copyOf(data2,data.length-1);
            for(i=index;i< data.length-1;i++){
                data2[i]=data[i+1];
            }
            data=data2;
             return true;
            }else{
                return false;
            }
        }


        //Задание 8
        //метод перебирает массив и удаляет первое из значений равное полученному в аргументе
        //@param item значение для удаления из массива
        //@return возвращает true при успешном удалении элемента и false если значение не найдено в массиве
        public boolean delete(T item) {
            if (item == null){
                return false;
            } else{
                   for (int i = 0; i < data.length; i++) {
                        if (data[i] == item) {
                            delete(i);
                            return true;
                        }
                   }
            }
                return false;
        }


         //метод сортирует элементы массива по убыванию
         //@param передается компаратор
          public void sort(Comparator<T> comparator){
                for(int j=0;j< data.length;j++){
                    if(data[j]!=null){
                          for(int i=0;i<data.length-1;i++){
                                 if(data[i+1]!=null){
                                    if(comparator.compare(data[i],data[i+1])<0){
                                    T c=data[i];
                                    data[i]=data[i+1];
                                    data[i+1]=c;
                                    }
                                 }
                             }
                    }

                }
          }


}


