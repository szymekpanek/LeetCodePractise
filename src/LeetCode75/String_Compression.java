package LeetCode75;

public class String_Compression {

    public int compress(char[] chars) {
        int count = 1;  // Zaczynamy liczyć od 1
        int writeIndex = 0;  // To jest indeks, gdzie zapisujemy w tablicy

        for (int i = 1; i < chars.length; i++) {  // Zaczynamy od drugiego elementu
            if (chars[i] == chars[i - 1]) {
                count++;  // Jeśli element jest taki sam jak poprzedni, zwiększamy licznik
            } else {
                // Zapisujemy znak
                chars[writeIndex] = chars[i - 1];
                writeIndex++;

                // Jeśli liczba powtórzeń jest większa niż 1, zapisujemy liczbę
                if (count > 1) {
                    for (char c : Integer.toString(count).toCharArray()) {
                        chars[writeIndex] = c;
                        writeIndex++;
                    }
                }

                count = 1;  // Resetujemy licznik, bo znaleźliśmy nowy znak
            }
        }

        // Na koniec zapisujemy ostatnią grupę znaków
        chars[writeIndex] = chars[chars.length - 1];
        writeIndex++;
        if (count > 1) {
            for (char c : Integer.toString(count).toCharArray()) {
                chars[writeIndex] = c;
                writeIndex++;
            }
        }

        return writeIndex;  // Zwracamy długość skompresowanej tablicy
    }

    public static void main(String[] args) {
        char[] chars = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        String_Compression stringCompression = new String_Compression();
        System.out.println(stringCompression.compress(chars));  // Wydrukuje długość nowej tablicy
    }
}
