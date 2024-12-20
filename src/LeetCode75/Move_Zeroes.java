package LeetCode75;

public class Move_Zeroes {
    public void moveZeroes(int[] nums) {
        int count = 0;

        for (int i = 0; i < nums.length ; i++) {
            if (nums[i]!=0){
                nums[count++] = nums[i];
            }
        }

        while (count < nums.length){
            nums[count++] = 0;
        }

        for (int i = 0; i < nums.length ; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static void main(String[] args) {
        int [] nums = {0,1,0,3,12};
        Move_Zeroes moveZeroes = new Move_Zeroes();
        moveZeroes.moveZeroes(nums);
    }
}
