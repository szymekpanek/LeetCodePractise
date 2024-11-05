package Easy_level_LeetCode;

public class Ex11 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int index1 = m - 1;
        int index2 = n - 1;
        int mergedIndex = m + n - 1;

        // Extend nums1 array to accommodate merged elements
        int[] temp = new int[m];
        for (int i = 0; i < m; i++) {
            temp[i] = nums1[i];
        }

        // Continue merging until one of the arrays is fully merged
        while (index1 >= 0 && index2 >= 0) {
            // Compare elements from nums1 and nums2 and place the larger one at the end of nums1
            if (temp[index1] > nums2[index2]) {
                nums1[mergedIndex] = temp[index1];
                index1--;
            } else {
                nums1[mergedIndex] = nums2[index2];
                index2--;
            }
            mergedIndex--;
        }

        // If there are remaining elements in nums2, copy them into nums1
        while (index2 >= 0) {
            nums1[mergedIndex] = nums2[index2];
            index2--;
            mergedIndex--;
        }

        // Print merged nums1
        System.out.println("Merged nums1: ");
        for (int num : nums1) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Ex11 ex11 = new Ex11();
        int[] nums1 = {1,2,3,0,0,0}; // Extend nums1 to accommodate merged elements
        int[] nums2 = {2,5,6};

        ex11.merge(nums1,3,nums2,3);
    }
}
