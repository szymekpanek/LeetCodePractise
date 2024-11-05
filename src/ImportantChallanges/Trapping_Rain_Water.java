package ImportantChallanges;

public class Trapping_Rain_Water {
    public int trap(int[] height) {
        // Inicjalizujemy zmienne do przechowywania wskaźników na lewą i prawą stronę.
        int left = 0;
        int right = height.length - 1;
        // Zmienna do przechowywania maksymalnej wysokości ściany po lewej stronie.
        int leftMax = 0;
        // Zmienna do przechowywania maksymalnej wysokości ściany po prawej stronie.
        int rightMax = 0;
        // Zmienna do przechowywania całkowitej ilości wody.
        int result = 0;

        // Pętla wykonuje się, dopóki wskaźnik lewy nie jest mniejszy niż wskaźnik prawy.
        while (left < right) {
            // Sprawdzamy, która ściana jest niższa - lewa czy prawa.
            if (leftMax < rightMax) {
                // Zaktualizuj maksymalną wysokość po lewej stronie, jeśli jest wyższa niż aktualna.
                leftMax = Math.max(leftMax, height[left]);
                // Obliczamy, ile wody można zatrzymać na bieżącej pozycji lewego wskaźnika.
                result += leftMax - height[left];
                // Przesuwamy lewy wskaźnik w prawo.
                left++;
            } else {
                // Zaktualizuj maksymalną wysokość po prawej stronie, jeśli jest wyższa niż aktualna.
                rightMax = Math.max(rightMax, height[right]);
                // Obliczamy, ile wody można zatrzymać na bieżącej pozycji prawego wskaźnika.
                result += rightMax - height[right];
                // Przesuwamy prawy wskaźnik w lewo.
                right--;
            }
        }

        // Zwracamy całkowitą ilość zatrzymanej wody.
        return result;
    }

    public static void main(String[] args) {
        /*
        test case
        height = [0,1,0,2,1,0,1,3,2,1,2,1]
        height = [4,2,0,3,2,5]
         */
        int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};

        // Tworzymy obiekt klasy Trapping_Rain_Water i wywołujemy metodę trap.
        Trapping_Rain_Water trappingRainWater = new Trapping_Rain_Water();
        System.out.println(trappingRainWater.trap(height));
    }
}
