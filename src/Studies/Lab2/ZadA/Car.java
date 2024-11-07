package Studies.Lab2.ZadA;

/*
Napisz w języku Java program. Program wykorzystuje typ generyczny i umożliwia stworzenie 3 obiektów typu
Car (składowe klasy to:  brand, model oraz carVIN).Identyfikatory pojazdu nie jest określone,
 w jednym przypadku może to być liczba całkowita a w innym ciąg znaków. Zaproponuj rozwiązanie w oparciu o typ generyczny.
 */
public class Car<T> {
    private String brand;
    private String model;
    private T carVIN;

    public Car(String brand, String model, T carVIN) {
        this.brand = brand;
        this.model = model;
        this.carVIN = carVIN;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public T getCarVIN() {
        return carVIN;
    }

    public void setCarVIN(T carVIN) {
        this.carVIN = carVIN;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", carVIN=" + carVIN +
                '}';
    }
}


