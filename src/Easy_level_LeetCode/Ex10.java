package Easy_level_LeetCode;

public class Ex10 {
    public int majorityElement(int[] nums) {
        int counter;
        for (int i = 0; i < nums.length ; i++) {
            counter = nums [i];
            if (nums[i++] == counter){
                
            }

        }

        return nums[0];
    }

    public static void main(String[] args) {
        int [] nums = {1,3,3};
        Ex10 ex10 = new Ex10();
        System.out.println(ex10.majorityElement(nums));
    }
}
