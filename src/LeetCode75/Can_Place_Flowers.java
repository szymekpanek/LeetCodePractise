package LeetCode75;
/*
You have a long flowerbed in which some of the plots are planted, and some are not. However, flowers cannot be planted in adjacent plots.

Given an integer array flowerbed containing 0's and 1's, where 0 means empty and 1 means not empty, and an integer n,
return true if n new flowers can be planted in the flowerbed without violating the no-adjacent-flowers rule and false otherwise.

 */

public class Can_Place_Flowers {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        // Obsługa przypadku, gdy flowerbed ma tylko jeden element
        if (flowerbed.length == 1) {
            return flowerbed[0] == 0 ? n <= 1 : n == 0;
        }

        for (int i = 0; i < flowerbed.length; i++) {
            // Sprawdź, czy można posadzić kwiat na pierwszej pozycji
            if (i == 0 && flowerbed[i] == 0 && flowerbed[i + 1] == 0) {
                flowerbed[i] = 1;  // posadź kwiat
                n--;  // zmniejsz liczbę potrzebnych kwiatów
            }
            // Sprawdź, czy można posadzić kwiat na ostatniej pozycji
            else if (i == flowerbed.length - 1 && flowerbed[i] == 0 && flowerbed[i - 1] == 0) {
                flowerbed[i] = 1;
                n--;
            }
            // Sprawdź, czy można posadzić kwiat na pozycji pomiędzy
            else if (i > 0 && i < flowerbed.length - 1 && flowerbed[i] == 0 && flowerbed[i - 1] == 0 && flowerbed[i + 1] == 0) {
                flowerbed[i] = 1;
                n--;
            }

            // Jeśli posadziliśmy już wszystkie potrzebne kwiaty, zwróć true
            if (n <= 0) {
                return true;
            }
        }

        // Jeśli nie udało się posadzić wszystkich wymaganych kwiatów, zwróć false
        return n <= 0;
    }

    public static void main(String[] args) {
        int[] flowerbed = {1, 0, 0, 0, 1};
        int n = 1;

        Can_Place_Flowers canPlaceFlowers = new Can_Place_Flowers();
        System.out.println(canPlaceFlowers.canPlaceFlowers(flowerbed, n));  // Oczekiwany wynik: true
    }
}