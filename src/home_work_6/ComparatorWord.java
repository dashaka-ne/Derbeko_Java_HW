package home_work_6;

import java.util.Map.Entry;
import java.util.Comparator;
import java.util.Map;


public class ComparatorWord implements Comparator<Map.Entry<String, Long>> {
    @Override
    public int compare(Entry<String, Long> o1, Entry<String, Long> o2) {
        return o2.getKey().compareTo(o1.getKey());
    }
}
