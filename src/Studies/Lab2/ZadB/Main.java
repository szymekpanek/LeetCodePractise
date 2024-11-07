package Studies.Lab2.ZadB;

public class Main {
    public static void main(String[] args) {
        BoxNumber<Integer> boxNumber1 = new BoxNumber<Integer>(12);
        BoxNumber<Double> boxNumber2 = new BoxNumber<Double>(12.5);
        BoxNumber<Float> boxNumber3 = new BoxNumber<Float>(12.543f);
        BoxNumber<Long> boxNumber4 = new BoxNumber<Long>(124294L);

        System.out.println(boxNumber1);
        System.out.println(boxNumber2);
        System.out.println(boxNumber3);
        System.out.println(boxNumber4);
    }
}
