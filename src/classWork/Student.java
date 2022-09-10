package classWork;

import java.io.Serializable;

public class Student implements Serializable {
    public String name;
    public String middleName;
    public String patronymic;
    public int grade;

    public static String getFullName(String name, String middleName, String patronymic) {
        return (name + " " + middleName + " " + patronymic);
    }


}
