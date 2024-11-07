package Studies.Lab2.ZadA;

public class Main{
    public static void main(String[] args) {
        Car<String> car1 = new Car<String>("Toyota", "Awensis", "SABCDEFG");
        Car<Integer> car2 = new Car<Integer>("Ford", "Bronco", 186342);

        System.out.println(car1);
        System.out.println(car2);
    }
}
