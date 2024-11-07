package Studies.Lab2.ZadC;

import java.util.HashMap;
import java.util.Map;

/*
Napisz program który na wejściu otrzymuje pary liczb <K><V>,
umożliwia wprowadzenie 4 studentów: 1232 Jan , 3423 Anna , Nowak Tomasz, Kot Alicja
 */

class Student {
    private final String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}

public class Main {
    public static void main(String[] args) {
        Map<Object, Student> studentMap = new HashMap<>();

        studentMap.put(1232, new Student("Jan"));
        studentMap.put(3423, new Student("Anna "));
        studentMap.put("Nowak", new Student("Tomasz"));
        studentMap.put("Kot", new Student("Alicja "));

        for (Map.Entry<Object, Student> entry : studentMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}

