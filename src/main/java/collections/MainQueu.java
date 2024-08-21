package collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;

public class MainQueu {

    public static void main(String[] args) {

        Deque<String> deque1 = new ArrayDeque<>();

        deque1.addFirst("added elem");
        deque1.addLast("last element");
        deque1.addFirst("first element");

        deque1.removeFirst();
        deque1.removeLast();
        deque1.offer("offered element");
        deque1.offerFirst("Offered first element");
        deque1.offer("offered last element");

        System.out.println(deque1);

        // Priority Queue
        PriorityQueue<Integer> prioQ1 = new PriorityQueue<>();

        prioQ1.add(4);
        prioQ1.add(3);
        prioQ1.add(5);
        System.out.println(prioQ1);
        System.out.println(prioQ1.poll());
        System.out.println(prioQ1.poll());




    }
}
