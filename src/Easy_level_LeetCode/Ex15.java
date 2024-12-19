package Easy_level_LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Ex15 {
    public static boolean contains(int[] array, int number) {
        for (int n : array) {
            if (n == number) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int [] numbers = {3,6,8,9};
        Stack<Integer> stack = new Stack<>();
        int counter = 1;
        while (counter <= 10){
            if (!contains(numbers, counter)){
                stack.push(counter);
            }
            counter++;
        }

        stack.forEach(System.out::println);

    }
}
