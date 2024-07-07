package Collection.Queue;

import java.util.ArrayDeque;

public class TestArrayDeque {
    public static void main(String[] args) {
        ArrayDeque q = new ArrayDeque();
        q.offer(4);
        q.offer(1);
        q.offer(3);
        q.offerLast(5);
        q.offerFirst(2);
        System.out.println(q);

        // peekLast() get last element
        System.out.println(q.peek() + " get top element");
        System.out.println(q);

        // popLast() get and remove last element

        System.out.println(q.pop());
        System.out.println(q);

        // pollLast() get and remove last element
        System.out.println(q.poll());
        System.out.println(q);

    }
}
