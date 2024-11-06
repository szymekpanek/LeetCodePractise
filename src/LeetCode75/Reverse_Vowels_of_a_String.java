package LeetCode75;

import java.util.Arrays;
import java.util.Set;
import java.util.Stack;

public class Reverse_Vowels_of_a_String {
    public String reverseVowels(String s) {
        Stack<Character> stack = new Stack<Character>();
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (vowels.contains(s.charAt(i))) {
                stack.add(s.charAt(i));
            }
        }

        for (int i = 0; i < s.length(); i++) {
            if (vowels.contains(s.charAt(i))) {
                stringBuilder.append(stack.pop());
            } else stringBuilder.append(s.charAt(i));
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        String s = "leetcode";
        Reverse_Vowels_of_a_String reverseVowelsOfAString = new Reverse_Vowels_of_a_String();
        System.out.println(reverseVowelsOfAString.reverseVowels(s));
    }
}
