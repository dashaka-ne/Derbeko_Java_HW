package home_work_5;

import java.util.Comparator;

public class ComparatorAnimalAgeNick implements Comparator<Animal> {
    public int compare(Animal o1, Animal o2){
        if (o1.getAge() != o2.getAge()) {
             return o1.getAge()-o2.getAge();
        }
        return o1.getNick().compareTo(o2.getNick());
    }
}
