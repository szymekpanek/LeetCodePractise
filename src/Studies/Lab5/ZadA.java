package Studies.Lab5;

import java.io.*;

public class ZadA {

    public static void main(String[] args){
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("plik1.txt"))) {
            Integer number;
            for (int i = 0; i <= 10000; i++) {
                writer.write(i  + "\n");
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }

        try(BufferedReader reader = new BufferedReader(new FileReader("plik1.txt"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("plik2.txt"))){
            String line;

            while ((line = reader.readLine()) != null){
                writer.write(line + "\n");
            }

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
