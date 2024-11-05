package ImportantChallanges;

/*
You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).

Find two lines that together with the x-axis form a container, such that the container contains the most water.

Return the maximum amount of water a container can store.

Notice that you may not slant the container.
*/


public class hsbc1 {


    public static void main(String[] args) {
        int [] height = {1,8,6,2,5,4,8,3,7};
        int result;
        int max = 0;
        for (int i = 0; i < height.length; i++) {
            for (int j = 1; j < height.length; j++) {
                result = Math.min(height[i], height[j]) * (j - i);
                if (result > max){
                    max = result;
                }
            }
        }
    }
}
