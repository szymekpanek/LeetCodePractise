package Easy_level;
/*
Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.

Consider the number of elements in nums which are not equal to val be k, to get accepted, you need to do the following things:

Change the array nums such that the first k elements of nums contain the elements which are not equal to val. The remaining elements of nums are not important as well as the size of nums.
Return k.

 */
public class Ex13 {
    public int removeElement(int[] nums, int val) {
    int k = 0;

        for (int i = 0; i < nums.length ; i++) {
            if (nums[i] == val){
                nums[k]= nums[i];
                k++;
            }
        }

        for (int i = k; i <nums.length ; i++) {
            System.out.print(nums[i]);
        }
        System.out.print(" k = ");
    return k;
    }

    public static void main(String[] args) {
        Ex13 ex13 = new Ex13();
        int [] nums = {1,1,1,1,1,1,1,2,2};
        System.out.println(ex13.removeElement(nums, 1));
    }
}
