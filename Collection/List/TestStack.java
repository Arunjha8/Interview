package Collection.List;

import java.util.Stack;

public class TestStack {
    public static void main(String[] args) {
        Stack s = new Stack();
//LIFO Or FIFO
        s.push("Arun");
        s.push("Mahak");
        s.push(100);

        System.out.println(s.search("Arun"));
        System.out.println(s);
        System.out.println(s.peek());
        System.out.println(s);
        System.out.println(s.pop());
        System.out.println(s);

    }
}
