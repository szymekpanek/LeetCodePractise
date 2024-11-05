package Easy_level;

public class Ex12 {
    public int removeDuplicates(int[] nums) {
        int k = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }

        for (int j = 0; j < nums.length; j++) {
            System.out.print(nums[j]);

        }
        System.out.println();
        return k;
    }

    public static void main(String[] args) {
        Ex12 ex12 = new Ex12();
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int[] nums2 = {0};

        System.out.println(ex12.removeDuplicates(nums));
        System.out.println();
        System.out.println(ex12.removeDuplicates(nums2));
    }
}
