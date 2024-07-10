package Collection.FailFastSafe;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class FailSafe {
    public static void main(String[] args) {
        Vector l = new Vector();
        l.add(1);
        l.add(2);
        l.add("arun");

        Enumeration e = l.elements();

        l.add(3);
        l.addElement(4);
        l.addElement("mahak");
//        l.remove(0);                  // value remove on particular index
//        l.set(0, 8);                  // value set on particular index
        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }
//        Iterator it = l.iterator();
//        while (it.hasNext()) {
//            System.out.println(it.next());
//        }
    }
}
