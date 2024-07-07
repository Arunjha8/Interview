package Collection.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestSet {
    public static void main(String[] args) {
        Set s = new HashSet();      // unorderd collection
        s.add(1);                   // duplicate value not support
        s.add("one");
        s.add(1);
        s.add(null);
        s.add(null);
        //  s.remove(1);
        // System.out.println("set = " + s);
        Iterator it = s.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
            it.remove();
        }
        System.out.println(s + " it.remove() remove all element");

        System.out.println("-------------------");
        Set s2 = new HashSet();
        s2.add(12);
        s2.add(11);
        s2.add(14);
        s2.add(13);
        System.out.println(s2);
        Iterator it2 = s2.iterator();
        while (it2.hasNext()) {
            System.out.println(it2.next());
        }
    }
}
