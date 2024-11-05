package Pele;

import java.lang.reflect.Array;
import java.util.*;

public class Zadanie2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean run = true;

        Stack<Integer> stack = new Stack<>();

        while (run) {
            System.out.println("Wybierz opcję:");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 0){
                while (!stack.isEmpty()) {
                    System.out.print(stack.pop());
                }
                run = false;
            }
            else {
                stack.push(choice);
            }
        }
        scanner.close();
    }
}
