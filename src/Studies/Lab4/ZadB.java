package Studies.Lab4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class ZadB {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        int size = random.nextInt(100, 200);

        IntStream.range(0, size).forEach(i -> list.add(random.nextInt(100, 10000)));

        System.out.println("Wygenerowana lista ->  " + list);

        int min = list.stream()
                .min(Integer::compareTo)
                .orElseThrow();
        System.out.println("Najmniejszy element = " + min);


        int max = list.stream()
                .max(Integer::compareTo)
                .orElseThrow();
        System.out.println("Największy element =  " + max);
    }
}
