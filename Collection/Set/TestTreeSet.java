package Collection.Set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestTreeSet {
    public static void main(String[] args) {
        TreeSet s = new TreeSet();
        s.add(25);
        s.add(13);
        s.add(40);
        s.add(21);
        s.add(29);
//        s.add("abc");
//        s.add("xyz");

        System.out.println(s);
        System.out.println(s.first());
        System.out.println(s.last());

        System.out.println(s.ceiling(25));    // get data to near to given value
//        Iterator it = s.iterator();
//        while (it.hasNext()) {
//            System.out.println(it.next());
//        }
    }
}
