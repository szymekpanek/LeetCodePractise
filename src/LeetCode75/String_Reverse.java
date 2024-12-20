package LeetCode75;

import java.util.Stack;



public class String_Reverse {
    public static <Char> String reverse (String s){
        Stack<Character> stack = new Stack<>();
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            stack.push(s.charAt(i));
        }

        while (!stack.isEmpty()) {
            stringBuilder.append(stack.pop());
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        String string =  "reversed string";
        System.out.println(reverse(string));
    }

}
