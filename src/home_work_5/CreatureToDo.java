package home_work_5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class CreatureToDo {
    /**
     * метод создает и наполняет коллецию Person
     *
     * @param isSpeed определяет надо ли использовать функцию вывода в консоль скорости заполнения коллекции
     * @return коллекцию
     */
    public List<Person> add(List collection, boolean isSpeed) {                             //если static то не смогу к полям обратиться
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
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
        System.out.println("1 Размер коллекции " + collection.size());//удалить потом
        return collection;

    }

    /**
     * метод создает и наполняет коллецию Animal
     *
     * @param isSpeed определяет надо ли использовать функцию вывода в консоль скорости заполнения коллекции
     * @return коллекцию
     */
    public List<Animal> addAnimal(List collection, boolean isSpeed) {                             //если static то не смогу к полям обратиться
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            Animal animal = new Animal();
            animal.setNick(RandomString.randomString(CharsCyrillic.getChars()));
            animal.setAge(RandomAge.randomAge(15));
            collection.add(animal);
        }
        long stop = System.currentTimeMillis();
        if (isSpeed) {
            System.out.println("Операция заполнения animals заняла " + (stop - start) + " мс");
        }
        return collection;

    }

    /**
     * метод измеряет скорость итерирования коллекции при помощи Iterator
     *
     * @param collection коллеция для итерирования
     */
    public static <T> void iteratorSpeed(List<T> collection) {
        Iterator<T> itr = collection.iterator();
        long start = System.currentTimeMillis();
        while (itr.hasNext()) {
            T item = itr.next();
        }
        long stop = System.currentTimeMillis();
        System.out.println("Операция итерирования iteratorSpeed заняла " + (stop - start) + " мс");
    }

    /**
     * метод измеряет скорость итерирования коллекции при помощи for i
     *
     * @param collection коллеция для итерирования
     */
    public static <T> void forISpeed(List<T> collection) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < collection.size(); ) {
            i++;
        }
        long stop = System.currentTimeMillis();
        System.out.println("Операция итерирования forISpeed заняла " + (stop - start) + " мс");
    }


    /**
     * метод сортирует коллекцию Person при помощи компаратора ComparatorPasswordLengthNick
     *
     * @param collection коллекция для сортировки
     */
    public static void personSort2(List<Person> collection) {
        collection.sort(new ComparatorPasswordLengthNick());
        System.out.println("Сортировка Person при помощи компаратора ComparatorPasswordLengthNick");
        for (Person i : collection) {
            System.out.println("Пароль: " + i.getPassword() + " Псевдоним: " + i.getNick() + " Имя: " + i.getName());
        }
    }

    /**
     * метод сортирует коллекцию Person при помощи компаратора ComparatorPasswordLength
     *
     * @param collection коллекция для сортировки
     */
    public static void personSort(List<Person> collection) {
        collection.sort(new ComparatorPasswordLengthNick());
        System.out.println("Сортировка Person при помощи компаратора ComparatorPasswordLength");
        for (Person i : collection) {
            System.out.println("Пароль: " + i.getPassword() + " Имя: " + i.getName());
        }
    }

    /**
     * метод сортирует коллекцию Animal при помощи компаратора ComparatorAnimalAgeNick
     *
     * @param collection коллекция для сортировки
     */
    public static void animalSort2(List<Animal> collection) {
        collection.sort(new ComparatorAnimalAgeNick());
        System.out.println("Сортировка Animal при помощи компаратора ComparatorAnimalAgeNick");
        for (Animal i : collection) {
            System.out.println("Возраст: " + i.getAge() + " Кличка:" + i.getNick());
        }
    }

    /**
     * метод сортирует коллекцию Animal при помощи компаратора ComparatorAnimalAge
     *
     * @param collection коллекция для сортировки
     */
    public static void animalSort(List<Animal> collection) {
        collection.sort(new ComparatorAnimalAge());
        System.out.println("Сортировка Animal при помощи компаратора ComparatorAnimalAge");
        for (Animal i : collection) {
            System.out.println("Возраст: " + i.getAge() + " Кличка:" + i.getNick());
        }
    }

    /**
     * метод удаляет элементы коллекци при помощи Iterator
     *
     * @param collection коллекция для сортировки
     */
    public static <T> void iteratorDel(List<T> collection) {
        Iterator<T> itr = collection.iterator();
        long start = System.currentTimeMillis();
        while (itr.hasNext()) {
            T item = itr.next();
            itr.remove();
        }
        long stop = System.currentTimeMillis();
        System.out.println("Операция итерирования iteratorSpeed заняла " + (stop - start) + " мс");
    }
}

