package Collection.FailFastSafe;

import java.util.ArrayList;
import java.util.Iterator;

public class FailFast2 {
    public static void main(String[] args) {
        ArrayList l = new ArrayList();
        l.add("one");
        l.add("two");
        l.add("three");
        l.add("four");

        //   Integer i = new Integer(8);
        int i = 8;
        l.add(i);
        l.add("five");

        System.out.println(l.get(3));

        String s = (String) l.get(3);
        System.out.println(s);
       
//        Iterator it = l.iterator();
//        // l.add("six");
//        while (it.hasNext()) {
//            System.out.println(it.next());
//        }
    }
}
