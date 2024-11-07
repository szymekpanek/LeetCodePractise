package Studies.Lab1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Zadanie3 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            System.out.println("Wprowadź numer studenta i imię (format: <numer> <imię>): ");
            int id = scanner.nextInt();
            String name = scanner.next();
            map.put(id, name);
        }
        System.out.println("Zawartość kolekcji:");
        map.forEach((id, name) -> System.out.println("Numer: " + id + ", Imię: " + name));
    }
}


