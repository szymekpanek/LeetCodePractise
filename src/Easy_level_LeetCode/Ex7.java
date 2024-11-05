package Easy_level_LeetCode;

import java.util.Arrays;

public class Ex7 {

    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i += 2) {
            if (i == nums.length - 1 || nums[i] != nums[i + 1]) {
                return nums[i];
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Ex7 ex7 = new Ex7();
        int[] nums = {2,2,1,1,4};
        System.out.println(ex7.singleNumber(nums));
    }
}
