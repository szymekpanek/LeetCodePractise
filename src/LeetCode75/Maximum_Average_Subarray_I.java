package LeetCode75;

public class Maximum_Average_Subarray_I {

    public double findMaxAverage(int[] nums, int k) {
        double maxAvg = Integer.MIN_VALUE;  // Największa średnia
        double sum = 0;

        // Początkowe obliczenie sumy dla pierwszych k elementów
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        // Na początku maxAvg to średnia pierwszych k elementów
        maxAvg = sum / k;

        // Teraz przesuwamy okno po tablicy, zaczynając od indexu k
        for (int i = k; i < nums.length; i++) {
            sum += nums[i] - nums[i - k];  // Dodajemy nowy element, usuwamy najstarszy
            maxAvg = Math.max(maxAvg, sum / k);  // Sprawdzamy, czy nowa średnia jest większa
        }

        return maxAvg;
    }


    public static void main(String[] args) {
        int[] nums = {1,12,-5,-6,50,3};
        int k = 4;

        Maximum_Average_Subarray_I maximumAverageSubarrayI = new Maximum_Average_Subarray_I();
        System.out.println(maximumAverageSubarrayI.findMaxAverage(nums, k));

    }
}
