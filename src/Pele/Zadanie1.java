package Pele;

import java.util.HashSet;
import java.util.Scanner;

import java.util.HashSet;
import java.util.Scanner;

public class Zadanie1 {
    public HashSet<String> set = new HashSet<>();

    public HashSet<String> roadMap(String road) {
        set.add(road);
        return set;
    }

    public void printAllRoads() {
        if (set.isEmpty()) {
            System.out.println("Brak tras.");
        } else {
            System.out.println("Trasy w systemie:");
            for (String road : set) {
                System.out.println(road);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Zadanie1 zadanie1 = new Zadanie1();
        boolean run = true;

        while (run) {
            System.out.println("Wybierz opcję:");
            System.out.println("1. Dodaj trasę");
            System.out.println("2. Wyświetl wszystkie trasy");
            System.out.println("3. Zakończ program");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Podaj miejscowość:");
                    String road = scanner.nextLine();
                    zadanie1.roadMap(road);
                    System.out.println("Trasa dodana!");
                    break;
                case 2:
                    zadanie1.printAllRoads();
                    break;
                case 3:
                    run = false;
                    System.out.println("Program zakończony.");
                    break;
                default:
                    System.out.println("Nieprawidłowy wybór, spróbuj ponownie.");
                    break;
            }
        }

        scanner.close();
    }
}
