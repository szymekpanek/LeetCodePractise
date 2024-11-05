package Easy_level;
/*
Given a string s consisting of words and spaces, return the length of the last word in the string.

A word is a maximal
substring
 consisting of non-space characters only.
 */
public class Ex14 {
    public int lengthOfLastWord(String s) {
        s = s.trim();

        int length = 0;
        int index = s.length() -1;

        while (index >= 0 && s.charAt(index) != ' ') {
            length++;
            index--;
        }
        return length;
    }

    public static void main(String[] args) {
        Ex14 ex14 = new Ex14();
        String s = "dupsko  ";
        System.out.println("Word s has " + ex14.lengthOfLastWord(s));
    }
}
