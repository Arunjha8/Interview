package Collection.Queue;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;

public class TestQueueArrayDeque {
    public static void main(String[] args) {
        Queue q = new ArrayDeque();
        q.add("adf");
        q.add(4);
        q.add(5);
        q.add(2);
        q.offer(6);

        System.out.println(q.element());
        System.out.println(q);

        q.remove();
        Iterator it = q.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
