package LeetCode75;

public class Increasing_Triplet_Subsequence {

    public boolean increasingTriplet(int[] nums) {
        if (nums == null || nums.length < 3) return false;
        int f = Integer.MAX_VALUE;
        int s = Integer.MAX_VALUE;

        for (int num : nums) {
            if (num <= f) f = num;
            else if (num <= s) s = num;
            else return true;
        }
        return false;
    }


    public static void main(String[] args) {
        int[] nums = {20, 100, 10, 12, 5, 13};
        Increasing_Triplet_Subsequence increasingTripletSubsequence = new Increasing_Triplet_Subsequence();
        System.out.println(increasingTripletSubsequence.increasingTriplet(nums)); // powinno zwrócić true
    }
}
