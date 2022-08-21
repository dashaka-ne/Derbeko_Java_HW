package home_work_5;

import java.util.Comparator;

public class ComparatorAnimalAge implements Comparator<Animal> {
    public int compare(Animal o1, Animal o2) {
        return o1.getAge() - o2.getAge();
    }
}
