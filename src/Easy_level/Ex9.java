package Easy_level;

public class Ex9 {
    public void moveZeroes(int[] nums) {
        int count = 0; // Licznik zer

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
     int nums [] = {0,1,0,3,12};
     Ex9 ex9 = new Ex9();
        ex9.moveZeroes(nums);
    }
}
// jeżeli napotkam 0 to sprawdzam to zamieniam miejscami z następnym elementem jeżeli jest takowy


//