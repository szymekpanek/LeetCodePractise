package Studies.Lab4;

import java.util.Random;

public class ZadA {
    Random random = new Random();
    int n = random.nextInt(100, 1000);
    int m = random.nextInt(100, 1000);

    public static void main(String[] args) {
        ZadA zadA = new ZadA();
        System.out.println("n = " + zadA.n);
        System.out.println("m = " + zadA.m);

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < zadA.n; i++) {
                    System.out.println("WSZIB");
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < zadA.m; i++) {
                    System.out.println("JAVA");
                }
            }
        });

        thread1.start();
        thread2.start();
    }
}
