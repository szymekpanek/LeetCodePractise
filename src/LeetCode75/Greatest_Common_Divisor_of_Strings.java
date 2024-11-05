package LeetCode75;

public class Greatest_Common_Divisor_of_Strings {
    public String gcdOfStrings(String str1, String str2) {
        String shorter = str1.length() < str2.length() ? str1 : str2;

        // Iterujemy od długości krótszego ciągu do 1
        for (int len = shorter.length(); len > 0; len--) {
            // Sprawdzenie, czy długości str1 i str2 są podzielne przez len
            if (str1.length() % len == 0 && str2.length() % len == 0) {
                // Pobieramy kandydat na dzielnik
                String candidate = shorter.substring(0, len);
                // Sprawdzamy, czy candidate dzieli oba ciągi
                if (str1.equals(candidate.repeat(str1.length() / len)) &&
                        str2.equals(candidate.repeat(str2.length() / len))) {
                    return candidate; // Zwracamy największy wspólny dzielnik
                }
            }
        }

        return ""; // Zwracamy pusty ciąg, jeśli nie znaleziono dzielnika
    }

    public static void main(String[] args) {
        Greatest_Common_Divisor_of_Strings greatestCommonDivisorOfStrings = new Greatest_Common_Divisor_of_Strings();
        String str1 = "ABABAB", str2 = "ABAB";
        System.out.println(greatestCommonDivisorOfStrings.gcdOfStrings(str1, str2)); // Output: "AB"
    }
}
