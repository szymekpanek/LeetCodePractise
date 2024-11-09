package LeetCode75;

import java.util.HashMap;
import java.util.Map;

public class Max_Number_of_K_Sum_Pairs {

    public int maxOperations(int[] nums, int k) {
        int result = 0;
        Map<Integer, Integer> numCounts = new HashMap<>();

        // Wypełnienie mapy liczebności elementów w tablicy
        for (int num : nums) {
            numCounts.put(num, numCounts.getOrDefault(num, 0) + 1);
        }

        // Sprawdzanie par sumujących się do k
        for (int num : nums) {
            int complement = k - num;

            // Sprawdzenie, czy możemy utworzyć parę (num, complement)
            if (numCounts.getOrDefault(num, 0) > 0 && numCounts.getOrDefault(complement, 0) > 0) {
                // Dodatkowy warunek dla przypadków, gdy num == complement (np. dla 2 + 2 = 4)
                if (num == complement && numCounts.get(num) < 2) {
                    continue;
                }

                // Znaleziono parę, zwiększamy wynik
                result++;

                // Zmniejszamy liczebność num i complement w mapie
                numCounts.put(num, numCounts.get(num) - 1);
                numCounts.put(complement, numCounts.get(complement) - 1);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int k = 5;
        Max_Number_of_K_Sum_Pairs maxNumberOfKSumPairs = new Max_Number_of_K_Sum_Pairs();
        System.out.println(maxNumberOfKSumPairs.maxOperations(nums, k));  // Powinno wyświetlić 2
    }
}
