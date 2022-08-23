package home_work_5;

import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        List<Person> peopleCollection = new ArrayList<>();
        CreatureToDo createCollection = new CreatureToDo();
        List<Animal> animalCollection = new ArrayList<>();
        CreatureToDo createCollectionAnimal = new CreatureToDo();

        //6.1 и 6.2 заполнение коллекции рандомными значениями
        List<Person> persons = createCollection.add(peopleCollection, false);
        List<Animal> animals = createCollectionAnimal.addAnimal(animalCollection, false);

        //6.3.1 cортировка sort
        CreatureToDo.personSort(persons);
        CreatureToDo.personSort2(persons);
        CreatureToDo.animalSort(animals);
        CreatureToDo.animalSort2(animals);

        //6.4.1 скорость заполнения коллекции
        List<Person> peopleCollection2 = new ArrayList<>();
        List<Person> persons2 = createCollection.add(peopleCollection2, true);
        List<Animal> animalCollection2 = new ArrayList<>();
        List<Animal> animals2 = createCollectionAnimal.addAnimal(animalCollection2, true);

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
