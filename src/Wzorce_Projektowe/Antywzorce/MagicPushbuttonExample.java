package Wzorce_Projektowe.Antywzorce;

import java.util.Scanner;

public class MagicPushbuttonExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MagicPushbutton button = new MagicPushbutton();

        System.out.println("Magic Pushbutton Menu:");
        System.out.println("1 - Wyslij email i usun plik");
        System.out.println("2 - Zapisz plik i wyslij email");
        System.out.println("3 - Usun plik");
        System.out.println("4 - Wyjscie");

        while (true) {
            System.out.print("Wybierz co chcesz zrobic (1-4)");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    button.sendEmail();
                    button.deleteFile();
                    break;
                case 2:
                    button.saveFile();
                    button.sendEmail();
                    break;
                case 3:
                    button.deleteFile();
                    button.sendEmail();
                    break;
                case 4:
                    System.out.println("Wyjscie z programu");
                    button.sendEmail();
                    scanner.close();
                    return;
                default:
                    System.out.println("Zly wybor");
                    button.deleteFile();
            }
        }
    }
}

class MagicPushbutton {

    public void sendEmail() {
        System.out.println("Email zostal wyslany");
    }

    public void saveFile() {
        System.out.println("Plik zostal zapisany");
    }

    public void deleteFile() {
        System.out.println("Plik zostal usuniety");
    }
}
