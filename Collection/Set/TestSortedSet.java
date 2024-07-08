package Collection.Set;

import java.util.*;

public class TestSortedSet {
    public static void main(String[] args) {
        // SortedSet output by default ASC order
        SortedSet s = new TreeSet();
        s.add(1);
        s.add(4);
        s.add(2);
        s.add(3);
        System.out.println(s.first());
        System.out.println(s.last());
        System.out.println(s);
//        for (Object o : s) {
//            System.out.println(o);
//        }

        Iterator it = s.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
