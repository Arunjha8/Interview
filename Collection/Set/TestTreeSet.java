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

        System.out.println(s);
        System.out.println(s.first());
        System.out.println(s.last());

//        Iterator it = s.iterator();
//        while (it.hasNext()) {
//            System.out.println(it.next());
//        }
    }
}
