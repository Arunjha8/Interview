package Collection.Queue;

import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class TestAddOffer {
    public static void main(String[] args) {
        Queue q = new ArrayBlockingQueue(2);
        q.add(1);
        q.add(2);
        //  q.add(3);
        System.out.println(q);

        Queue q1 = new ArrayBlockingQueue(2);
        q1.offer(3);
        q1.offer(4);
        q1.offer(5);
        System.out.println(q1);

    }
}
