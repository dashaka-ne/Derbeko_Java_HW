package home_work_5;

import java.util.*;

public class CreatureToDo {
    /**
     * метод создает и наполняет коллецию Person
     *
     * @param isSpeed определяет надо ли использовать функцию вывода в консоль скорости заполнения коллекции
     * @return коллекцию
     */
    public List<Person> add(List<Person> collection, boolean isSpeed) {                             //если static то не смогу к полям обратиться
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
        return collection;
    }

    public Set<Person> add(Set<Person> collection, boolean isSpeed) {                             //если static то не смогу к полям обратиться
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
        return collection;
    }

    /**
     * метод создает и наполняет коллецию Animal
     *
     * @param isSpeed определяет надо ли использовать функцию вывода в консоль скорости заполнения коллекции
     * @return коллекцию
     */
    public List<Animal> addAnimal(List<Animal> collection, boolean isSpeed) {                             //если static то не смогу к полям обратиться
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

    public Set<Animal> addAnimal(Set<Animal> collection, boolean isSpeed) {                             //если static то не смогу к полям обратиться
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
    public static <T> void iteratorSpeed(Collection<T> collection) {
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
    public static <T> void forISpeed(Collection<T> collection) {
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

    public static void personSort2(Set<Person> collection) {
        List<Person> collectionList = new ArrayList<>(collection);
        collectionList.sort(new ComparatorPasswordLengthNick());
        HashSet<Person> collectionSet = new HashSet<>(collectionList);
        System.out.println("Сортировка Person при помощи компаратора ComparatorPasswordLength");
        for (Person i : collectionSet) {
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

    public static void personSort(Set<Person> collection) {
        List<Person> collectionList = new ArrayList<>(collection);
        collectionList.sort(new ComparatorPasswordLength());
        HashSet<Person> collectionSet = new HashSet<>(collectionList);
        System.out.println("Сортировка Person при помощи компаратора ComparatorPasswordLength");
        for (Person i : collectionSet) {
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

    public static void animalSort2(Set<Animal> collection) {
        List<Animal> collectionList = new ArrayList<>(collection);
        collectionList.sort(new ComparatorAnimalAgeNick());
        HashSet<Animal> collectionSet = new HashSet<>(collectionList);
        System.out.println("Сортировка Animal при помощи компаратора ComparatorAnimalAgeNick");
        for (Animal i : collectionSet) {
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

    public static void animalSort(Set<Animal> collection) {
        List<Animal> collectionList = new ArrayList<>(collection);
        collectionList.sort(new ComparatorAnimalAge());
        HashSet<Animal> collectionSet = new HashSet<>(collectionList);

        System.out.println("Сортировка Animal при помощи компаратора ComparatorAnimalAge");
        for (Animal i : collectionSet) {
            System.out.println("Возраст: " + i.getAge() + " Кличка:" + i.getNick());
        }
    }

    /**
     * метод удаляет элементы коллекци при помощи Iterator
     *
     * @param collection коллекция для сортировки
     */
    public static <T> void iteratorDel(Collection<T> collection) {
        Iterator<T> itr = collection.iterator();
        long start = System.currentTimeMillis();
        while (itr.hasNext()) {
            T item = itr.next();
            itr.remove();
        }
        long stop = System.currentTimeMillis();
        System.out.println("Операция удаления iteratorDel заняла " + (stop - start) + " мс");
    }
}

