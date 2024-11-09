package LeetCode75;
/*
Given two strings s and t, return true if s is a subsequence of t, or false otherwise.

A subsequence of a string is a new string that is formed from the original string by deleting some (can be none)
of the characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).



Example 1:

Input: s = "abc", t = "ahbgdc"
Output: true

 */
public class Is_Subsequence {
    public boolean isSubsequence(String s, String t) {
        int counter = 0;
        for (int i = 0; i < t.length() ; i++) {
            if (counter < s.length() && s.charAt(counter) == t.charAt(i)){
                counter++;
            }
        }

        return counter == s.length();
    }

    public static void main(String[] args) {
        String s = "abc";
        String t = "ahbgdc";

        Is_Subsequence is_subsequence = new Is_Subsequence();
        System.out.println(is_subsequence.isSubsequence(s,t));
    }
}
