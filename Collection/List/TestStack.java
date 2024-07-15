package Collection.List;

import java.util.Stack;

public class TestStack {
    public static void main(String[] args) {
        Stack s = new Stack();
        //  LIFO
        s.push("Arun");
        s.push("Mahak");
        s.push(100);

        System.out.println(s.search("Arun"));
        System.out.println(s);
        System.out.println(s.peek());       // get the element not remove
        s.push("Amisha");
        System.out.println(s);
        System.out.println(s.pop());        // get the element and remove also
        System.out.println(s);

    }
}
