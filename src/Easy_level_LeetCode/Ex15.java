package Easy_level_LeetCode;

import java.util.Arrays;
import java.util.Stack;

public class Ex15 {
    public static boolean contains(int[] array, int number) { // funkcja sprawdza czy dana cyfra znajduje się w tablicy
        for (int n : array) {
            if (n == number) { // jezeli znajduje sie to zwraca true
                return true;
            }
        }
        return false;
    }

    public static Object[] notContain (int [] array){
        Object[] result;
        Stack<Integer> stack = new Stack<>();

        int counter = 1;
        while (counter <= 10){
            if (!contains(array, counter)){ // jezeli liczba nie znajduje sie w tablicy to dodajemy ja do stosu
                stack.push(counter);
            }
            counter++;
        }
        result = stack.toArray();

        return result;
    }

    public static void main(String[] args) {
        int [] numbers = {3,6,8,9};
        System.out.println(Arrays.toString(notContain(numbers)));
    }
}
