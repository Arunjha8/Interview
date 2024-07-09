package Collection.FailFastSafe;

import java.util.Enumeration;
import java.util.Vector;

public class FailSafe {
    public static void main(String[] args) {
        Vector l = new Vector();
        l.add(1);
        l.add(2);
        l.add("arun");

        Enumeration it = l.elements();

        l.add(3);
        l.addElement(4);
        l.addElement("mahak");
//        l.remove(0);
//        l.set(0, 8);
        while (it.hasMoreElements()) {
            System.out.println(it.nextElement());
        }
    }
}
