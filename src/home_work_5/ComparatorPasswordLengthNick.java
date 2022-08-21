package home_work_5;

import java.util.Comparator;

public class ComparatorPasswordLengthNick implements Comparator<Person> {
    public int compare(Person o1, Person o2) {
        int password1 = String.valueOf(o1.getPassword()).length();
        int password2 = String.valueOf(o2.getPassword()).length();
        if (password1 != password2) {
            return password1 - password2;
        }
        return o1.getNick().compareTo(o2.getNick());
    }

}
