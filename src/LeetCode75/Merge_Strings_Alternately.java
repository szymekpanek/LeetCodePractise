package LeetCode75;
/*
You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1.
If a string is longer than the other, append the additional letters onto the end of the merged string.

Return the merged string.


Example 1:

Input: word1 = "abc", word2 = "pqr"
Output: "apbqcr"
Explanation: The merged string will be merged as so:
word1:  a   b   c
word2:    p   q   r
merged: a p b q c r

 */
public class Merge_Strings_Alternately {
    public String Solution(String word1, String word2) {
        StringBuilder result = new StringBuilder();
        int index1 = 0;
        int index2 = 0;

        while(index1 < word1.length() || index2 < word2.length()){
            if (index1 < word1.length()){
                result.append(word1.charAt(index1));
            }
            if (index2 < word2.length()){
                result.append(word2.charAt(index2));
            }
            index1++;
            index2++;
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Merge_Strings_Alternately mergeStringsAlternately = new Merge_Strings_Alternately();
        String word1 = "abc", word2 = "pqr";
        System.out.println(mergeStringsAlternately.Solution(word1, word2));
    }
}
