package Collection;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Test {
    public static void main(String[] args) {
        Queue q = new LinkedList();

        // Adding elements using add and offer
        q.add("Element 1");
        q.offer("Element 2");

        System.out.println("LinkedList Queue: " + q);

        Queue q1 = new ArrayBlockingQueue(2);

        // Adding elements using add and offer
        q1.add("Element 1");
        q1.add("Element 2");
        q1.offer("Element 3");   // add throws Exception

        System.out.println(q1);
    }
}
