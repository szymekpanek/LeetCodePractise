package Studies.Lab6;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class ZadB {
    public static void main(String[] args) {
        int n = 41;
        Function<Integer, Integer> fibonacci = new Function<>() {
            @Override
            public Integer apply(Integer n) {
                return n <= 1 ? n : this.apply(n - 1) + this.apply(n - 2);
            }
        };

        //Z ciekawosci dodalem pomiar czasu obliczen
        // Czas wykonania obliczen dla 50 wyniku ciagu to 79.739050233 sekund
        // Czas wykonania obliczen dla 40 to tylko 0.737401948 sekundy

        long startTime = System.nanoTime();
        int result = fibonacci.apply(n);
        long endTime = System.nanoTime();

        System.out.println("Wynikiem ciagu fibonacciego na pozycji " + n + " to: " + result);
        System.out.println("Obliczony w czasie " + (endTime - startTime) / 1_000_000_000.0 + " sekund");
    }
}
