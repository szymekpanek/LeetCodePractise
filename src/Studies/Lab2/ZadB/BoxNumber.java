package Studies.Lab2.ZadB;
/*
Stosując typy generyczne zaproponuj rozwiązanie, które jako składową klasy będzie umożliwiać stworzenie obiektu
zawierającego tylko wartości liczbowe. Nazwa klasy to BoxNumber
 */

public class BoxNumber <T extends Number>{
    T value;

    public BoxNumber(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "BoxNumber{" +
                "value=" + value +
                '}';
    }
}

