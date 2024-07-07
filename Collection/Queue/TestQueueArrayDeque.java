package Collection.Queue;

import java.util.ArrayDeque;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Queue;

public class TestQueueArrayDeque {
    public static void main(String[] args) {
        Queue q = new ArrayDeque();
        q.offer("adf");
        q.offer(4);
        q.add(5);
        q.add(2);
        System.out.println(q);
        Iterator it = q.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
