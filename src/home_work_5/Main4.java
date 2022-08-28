package home_work_5;

import java.util.TreeSet;
import java.util.Set;

public class Main4 {
    public static void main(String[] args) {
        ComparatorPasswordLength comparatorPassword = new ComparatorPasswordLength();
        Set<Person> peopleCollection = new TreeSet<>(comparatorPassword);
        CreatureToDo createCollection = new CreatureToDo();

        ComparatorAnimalAge comparatorAge = new ComparatorAnimalAge();
        Set<Animal> animalCollection = new TreeSet<>(comparatorAge);
        CreatureToDo createCollectionAnimal = new CreatureToDo();

        //6.1 и 6.2 заполнение коллекции рандомными значениями
        Set<Person> persons = createCollection.add(peopleCollection, false);
        Set<Animal> animals = createCollectionAnimal.addAnimal(animalCollection, false);


        //6.3.1 cортировка sort
        Set<Person> peopleCollectionSort = new TreeSet<>(comparatorPassword); //сразу сортируются по ключу(см компаратор) при создании
        Set<Animal> animalCollectionSort = new TreeSet<>(comparatorAge); //сразу сортируются по ключу(см компаратор) при создании


        //6.4.1 скорость заполнения коллекции
        Set<Person> peopleCollection2 = new TreeSet<>(comparatorPassword);
        Set<Person> persons2 = createCollection.add(peopleCollection2, true);
        Set<Animal> animalCollection2 = new TreeSet<>(comparatorAge);
        Set<Animal> animals2 = createCollectionAnimal.addAnimal(animalCollection2, true);

        //6.4.2 скорость итерирования коллекции Iterator
        CreatureToDo.iteratorSpeed(persons);
        CreatureToDo.iteratorSpeed(animals);

        //6.4.2.2 скорость итерирования коллекции
        CreatureToDo.forISpeed(persons);
        CreatureToDo.forISpeed(animals);

        //6.4.3 скорость удаления коллекции Iterator
        CreatureToDo.iteratorDel(persons);
        CreatureToDo.iteratorDel(animals);
    }
}
