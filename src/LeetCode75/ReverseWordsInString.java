package LeetCode75;

import java.util.Stack;

public class ReverseWordsInString {
    public String reverseWords(String s) {
        Stack<String> stack = new Stack<>(); // Tworzymy stos do przechowywania słów
        StringBuilder word = new StringBuilder(); // StringBuilder do zbierania słów

        // Iterujemy po każdym znaku w stringu
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c != ' ') { // Jeśli to nie jest spacja, dodajemy literę do słowa
                word.append(c);
            } else {
                if (word.length() > 0) {
                    stack.push(word.toString()); // Zbieramy słowo na stos
                    word.setLength(0); // Czyszczymy StringBuilder na następne słowo
                }
            }
        }

        // Nie zapomnij dodać ostatniego słowa, jeśli jest
        if (word.length() > 0) {
            stack.push(word.toString());
        }

        // Teraz tworzymy wynik, odwracając słowa
        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.append(stack.pop()); // Pobieramy słowa ze stosu i łączymy je
            if (!stack.isEmpty()) {
                result.append(" "); // Dodajemy spację między słowami
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        ReverseWordsInString solution = new ReverseWordsInString();
        String sentence = "the sky is blue";
        System.out.println(solution.reverseWords(sentence));  // Output: "blue is sky the"
    }
}
