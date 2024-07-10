package Collection;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Test {
    public static void main(String[] args) {
        // Queue q = new LinkedList();
        Queue q = new ArrayBlockingQueue(2);

        // Adding elements using add and offer
        q.add("Element 1");
        q.offer("Element 2");
        // q.add("Element 3");           // add throws Exception
        q.offer("Element 3");

        System.out.println(q);
    }
}
