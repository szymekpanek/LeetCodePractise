package HSBC;

//Sprawdzanie poprawności nawiasów
public class Valid_Parentheses {


    public boolean isValid(String s) {
        char[] stack = new char[s.length()];
        int top = -1;

        for (int i = 0; i < s.length(); i++) {
            char bracket = s.charAt(i);
            if (bracket == '{' || bracket == '[' || bracket == '(') {
                stack[++top] = bracket;
            } else {
                if (top == -1) {
                    return false;
                }
                char topBracket = stack[top--];
                if (bracket == ')' && topBracket != '(' ||
                    bracket == '}' && topBracket != '{' ||
                    bracket == ']' && topBracket != '['){
                    return  false;
                }
            }
        }
        return top == -1;
    }

    public static void main(String[] args) {
        //test case
        /*
        s = "()"
        s = "()[]{}"

        s = "([])"
        */
        String s = "()[]{}";
        Valid_Parentheses validParentheses = new Valid_Parentheses();
        System.out.println(validParentheses.isValid(s));
    }
}
