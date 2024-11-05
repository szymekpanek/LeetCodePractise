package Easy_level;
public class Ex5 {
    public int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length ; i++) {
            if (nums[i] == target){
                return i;
            } else if (nums[i] > target) {
                return i;
            }
        }
        return nums.length;
    }


    public static void main(String[] args) {
        int nums[] = {1, 3, 5, 6};
        int target = 7;

        Ex5 ex5= new Ex5();
        System.out.println(ex5.searchInsert(nums, target));

    }
}
