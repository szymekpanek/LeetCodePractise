package Studies.Lab1;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Zadanie4 {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(new CustomComparator());

        priorityQueue.add(4);
        priorityQueue.add(1);
        priorityQueue.add(7);
        priorityQueue.add(3);
        priorityQueue.add(2);

        System.out.println("Elementy w kolejce priorytetowej:");
        while (!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.poll());
        }
    }
}

class CustomComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        if (o1 == 7) {
            return -1;
        } else if (o2 == 7) {
            return 1;
        }
        return o1.compareTo(o2);
    }
}
