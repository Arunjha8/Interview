package Collection.List;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class TestListIterator {
    public static void main(String[] args) {
        List l = new ArrayList();
        l.add(10);
        l.add(12);
        l.add("Arun");
        l.add("Mahak");

        ListIterator it = l.listIterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
