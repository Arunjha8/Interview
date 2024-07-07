package Collection.List;

import java.util.ArrayList;
import java.util.Iterator;

public class TestArrayList {
    public static void main(String[] args) {
        ArrayList l = new ArrayList();
        l.add(10);
        l.add(20);
        System.out.println(l);

        ArrayList l2 = new ArrayList();
        l2.add(30);
        l2.add(40);
        l2.addAll(l);

        System.out.println(l2);
        System.out.println(l.size() + " " + l2.size());

        // l2.clear();
        Iterator it = l2.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
