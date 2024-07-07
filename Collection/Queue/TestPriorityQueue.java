package Collection.Queue;

import java.util.PriorityQueue;

public class TestPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue p = new PriorityQueue();
//        p.add(1);
//        p.add(6);
//        p.add(2);
//        p.add('A');
//        System.out.println(p);
        p.offer("one");
        p.offer("Three");
        p.offer("Two");

//        System.out.println(p);
//        System.out.println(p.peek());
//        System.out.println(p);
//        System.out.println(p.poll());
//        System.out.println(p);
        Object o = p.element();
        System.out.println(o);
        o=p.remove();
        System.out.println(p);
        System.out.println(o);

    }
}
