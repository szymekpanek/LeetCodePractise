package Wzorce_Projektowe.Dekorator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class BasicPizza implements Pizza {
    @Override
    public String getIngrediens() {
        return "Ciasto na pizzę z sosem i serem";
    }

    @Override
    public double getPrice() {
        return 34.00;
    }
}

abstract class PizzaDecorator implements Pizza {
    protected Pizza pizza;

    public PizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getIngrediens() {
        return pizza.getIngrediens();
    }

    @Override
    public double getPrice() {
        return pizza.getPrice();
    }
}

class HamDecorator extends PizzaDecorator {
    public HamDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getIngrediens() {
        return pizza.getIngrediens() + ", szynka";
    }

    @Override
    public double getPrice() {
        return pizza.getPrice() + 4.50;
    }
}

class SalamiDecorator extends PizzaDecorator {
    public SalamiDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getIngrediens() {
        return pizza.getIngrediens() + ", salami";
    }

    @Override
    public double getPrice() {
        return pizza.getPrice() + 5.00;
    }
}

class MushroomsDecorator extends PizzaDecorator {
    public MushroomsDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getIngrediens() {
        return pizza.getIngrediens() + ", pieczarki";
    }

    @Override
    public double getPrice() {
        return pizza.getPrice() + 3.00;
    }
}

class SpecialDecorator extends PizzaDecorator {
    public SpecialDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getIngrediens() {
        return pizza.getIngrediens() + ", PAKIET PREMIUM";
    }

    @Override
    public double getPrice() {
        return pizza.getPrice() + 100.0;
    }
}

public class PizzaOrderApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pizza pizza = new BasicPizza();
        List<String> selectedToppings = new ArrayList<>();

        System.out.println("Witamy w pizzerii!");
        System.out.println("Podstawowa pizza: " + pizza.getIngrediens() + " - " + pizza.getPrice() + " PLN");

        while (true) {
            System.out.println("\nDostępne dodatki:");
            System.out.println("1. Szynka (4.50 PLN)");
            System.out.println("2. Salami (5.00 PLN)");
            System.out.println("3. Pieczarki (3.00 PLN)");
            System.out.println("4. Pakiet Premium - JADALNE ZLOTO (100 PLN)");
            System.out.println("5. Zakończ wybieranie dodatków");
            System.out.print("Wybierz opcję (1-5): ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> {
                    pizza = new HamDecorator(pizza);
                    selectedToppings.add("Szynka");
                }
                case 2 -> {
                    pizza = new SalamiDecorator(pizza);
                    selectedToppings.add("Salami");
                }
                case 3 -> {
                    pizza = new MushroomsDecorator(pizza);
                    selectedToppings.add("Pieczarki");
                }
                case 4 -> {
                    pizza = new SpecialDecorator(pizza);
                    selectedToppings.add("Pakiet premium");
                }
                case 5 -> {
                    System.out.println("\nPodsumowanie zamówienia:");
                    System.out.println("Twoja pizza: " + pizza.getIngrediens());
                    System.out.println("Dodatki: " + (selectedToppings.isEmpty() ? "Brak" : String.join(", ", selectedToppings)));
                    System.out.println("Całkowity koszt: " + pizza.getPrice() + " PLN");
                    System.out.println("Dziękujemy za zamówienie!");
                    return;
                }
                default -> System.out.println("Niepoprawny wybór, spróbuj ponownie.");
            }
        }
    }
}
