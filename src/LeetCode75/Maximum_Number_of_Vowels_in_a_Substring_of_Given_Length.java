package LeetCode75;

import java.util.Set;

public class Maximum_Number_of_Vowels_in_a_Substring_of_Given_Length {

    public int maxVowels(String s, int k) {
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
        int currentVowelCount = 0;
        int maxVowelCount = 0;

        // Pierwsze okno - oblicz liczbę samogłosk w pierwszych k elementach
        for (int i = 0; i < k; i++) {
            if (vowels.contains(s.charAt(i))) {
                currentVowelCount++;
            }
        }

        // To jest nasza początkowa liczba samogłosek
        maxVowelCount = currentVowelCount;

        // Teraz przesuwamy okno po stringu
        for (int i = k; i < s.length(); i++) {
            // Usuwamy lewy element z okna
            if (vowels.contains(s.charAt(i - k))) {
                currentVowelCount--;
            }

            // Dodajemy prawy element do okna
            if (vowels.contains(s.charAt(i))) {
                currentVowelCount++;
            }

            // Sprawdzamy, czy nowa liczba samogłosk jest większa od poprzedniej maksymalnej
            maxVowelCount = Math.max(maxVowelCount, currentVowelCount);
        }

        return maxVowelCount;
    }

    public static void main(String[] args) {
        String s = "abciiidef";
        int k = 3;
        Maximum_Number_of_Vowels_in_a_Substring_of_Given_Length maximumNumberOfVowelsInASubstringOfGivenLength = new Maximum_Number_of_Vowels_in_a_Substring_of_Given_Length();
        System.out.println(maximumNumberOfVowelsInASubstringOfGivenLength.maxVowels(s, k));  // powinno wypisać 3
    }
}
