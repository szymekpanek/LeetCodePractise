package LeetCode75;

import java.util.Arrays;

public class Product_of_Array_Except_Self {
    public int[] productExceptSelf(int[] nums) {
        int prefix = 1;
        int sufix = 1;
        int [] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            result[i] = prefix;
            prefix *= nums[i];
        }

        for (int i = nums.length -1; i >= 0; i--) {
            result[i] *= sufix;
            sufix *= nums[i];
        }

    return result;
    }
    public static void main(String[] args) {
        int [] nums = {1,2,3,4};
        Product_of_Array_Except_Self productOfArrayExceptSelf = new Product_of_Array_Except_Self();
        System.out.println(Arrays.toString(productOfArrayExceptSelf.productExceptSelf(nums)));
    }
}
