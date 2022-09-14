package home_work_6;

import java.util.Map.Entry;
import java.util.Comparator;
import java.util.Map;


public class ComparatorWord implements Comparator<Map.Entry<String, Long>> {
    /**
     * Создаем компаратор для сравнения значений
     *
     * @param o1 the first object to be compared.
     * @param o2 the second object to be compared.
     * @return
     */
    @Override
    public int compare(Entry<String, Long> o1, Entry<String, Long> o2) {
        return o2.getValue().compareTo(o1.getValue());
    }
}
