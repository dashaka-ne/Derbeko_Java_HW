package home_work_5;

import java.util.*;

public class ToDo {
    public  Set<Person> add(Set <Person>collection, boolean isSpeed) {                             //если static то не смогу к полям обратиться
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10; i++) {
            Person person = new Person();
            person.setNick(RandomString.randomString(CharsCyrillic.getChars()));
            person.setPassword(RandomString.randomString(Chars.getChars(), 5, 10));
            person.setName(RandomName.randomName());
            collection.add(person);

        }
        long stop = System.currentTimeMillis();
        if (isSpeed) {
            System.out.println("Операция заполнения persons заняла " + (stop - start) + " мс");
        }
        System.out.println("Размер коллекции " + collection.size());//удалить потом

        return collection;

    }


    public static void personSort(Set<Person> collection) {
        List <Person> collectionList=new ArrayList<>(collection);
        collectionList.sort(new ComparatorPasswordLength());
        HashSet <Person> collectionSet=new HashSet<>(collectionList);
        System.out.println("Сортировка Person при помощи компаратора ComparatorPasswordLength");
        for (Person i: collectionSet) {
            System.out.println("Пароль: " + i.getPassword() + " Имя: " + i.getName());
        }

    }
    public static void personSort2(Set<Person> collection) {
        List <Person> collectionList=new ArrayList<>(collection);
        collectionList.sort(new ComparatorPasswordLengthNick());
        HashSet <Person> collectionSet=new HashSet<>(collectionList);
        System.out.println("Сортировка Person при помощи компаратора ComparatorPasswordLength");
        for (Person i: collectionSet) {
            System.out.println("Пароль: " + i.getPassword() + " Псевдоним: " + i.getNick() + " Имя: " + i.getName());
        }

    }

    public static void animalSort2(List<Animal> collection) {
        List <Animal> collectionList=new ArrayList<>(collection);
        collectionList.sort(new ComparatorAnimalAgeNick());
        HashSet <Animal> collectionSet=new HashSet<>(collectionList);
        System.out.println("Сортировка Animal при помощи компаратора ComparatorAnimalAgeNick");
        for (Animal i : collectionSet) {
            System.out.println("Возраст: " + i.getAge() + " Кличка:" + i.getNick());
        }
    }

    public static void animalSort(List<Animal> collection) {
        List <Animal> collectionList=new ArrayList<>(collection);
        collectionList.sort(new ComparatorAnimalAge());
        HashSet <Animal> collectionSet=new HashSet<>(collectionList);

        System.out.println("Сортировка Animal при помощи компаратора ComparatorAnimalAge");
        for (Animal i : collectionSet) {
            System.out.println("Возраст: " + i.getAge() + " Кличка:" + i.getNick());
        }
    }








    public static <T> void iteratorSpeed(Collection<T> collection) {
        Iterator<T> itr = collection.iterator();
        long start = System.currentTimeMillis();
        while (itr.hasNext()) {
            T item = itr.next();
        }
        long stop = System.currentTimeMillis();
        System.out.println("Операция итерирования iteratorSpeed заняла " + (stop - start) + " мс");
    }


    public static <T> void forISpeed(Collection<T> collection) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < collection.size(); ) {
            i++;
        }
        long stop = System.currentTimeMillis();
        System.out.println("Операция итерирования forISpeed заняла " + (stop - start) + " мс");
    }

    public static <T> void iteratorDel(Collection<T> collection) {
        Iterator<T> itr = collection.iterator();
        long start = System.currentTimeMillis();
        while (itr.hasNext()) {
            T item = itr.next();
            itr.remove();
        }
        long stop = System.currentTimeMillis();
        System.out.println("Операция удаления iteratorSpeed заняла " + (stop - start) + " мс");
    }
}
