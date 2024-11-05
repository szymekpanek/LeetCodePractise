package DailyChallanges;

/*
Given a string word, compress it using the following algorithm:

Begin with an empty string comp. While word is not empty, use the following operation:
Remove a maximum length prefix of word made of a single character c repeating at most 9 times.
Append the length of the prefix followed by c to comp.
Return the string comp.

 */
public class String_Compression {
    public String compressedString(String word) {
        StringBuilder comp = new StringBuilder();// inicjalizuje zmienna ktora bedzie zwracana

        if (word.isEmpty()){
            return comp.toString();
        }

        while (!word.isEmpty()) {
            int length = 1;  // Start z długością 1, ponieważ przynajmniej jeden znak jest w prefiksie
            char currentChar = word.charAt(0);  // Zapisujemy powtarzający się znak

            // Pętla do zliczania długości prefiksu
            for (int i = 1; i < word.length() && word.charAt(i) == currentChar && length < 9; i++) {
                length++;
            }

            // Dodajemy wynik do `comp`
            comp.append(length).append(currentChar);

            // Usuwamy przetworzony prefiks z `word`
            word = word.substring(length);
        }
        return comp.toString();
    }

    public static void main(String[] args) {
        String word = "aaaaaaaaaaaaaabb";
        String word1 = "abcde";
        String word2 = "";
        String_Compression stringCompression = new String_Compression();
        System.out.println(stringCompression.compressedString(word2));
    }
}
