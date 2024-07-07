package Collection.List;

import java.util.Iterator;
import java.util.LinkedList;

public class TestLinkedList {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.add("Arun");
        list.add("Rahul");
        list.add("Amisha");

        System.out.println(list);

        Iterator it = list.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println(list.indexOf("Amisha"));
        System.out.println(list.get(1));
        list.set(1, "Mahak");
        System.out.println(list);

    }
}
