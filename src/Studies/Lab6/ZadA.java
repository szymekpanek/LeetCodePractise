package Studies.Lab6;

import java.util.Arrays;
import java.util.List;

public class ZadA {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Marek", "Adam", "Jolanta", "Alicja", "Paweł", "Patrycja", "Zofia", "Adela", "Agnieszka");
        List<String> sortedNames = names.stream()
                .map(String::toLowerCase)
                .filter(name -> name.startsWith("a"))
                .toList();

        System.out.println("Posortowana lista: ");
        sortedNames.forEach(System.out::println);
    }
}
