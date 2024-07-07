package Collection;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;

public class TestList {
    public static void main(String[] args) {
        List l = new ArrayList();
        l.add('a');
        l.add('b');
        l.add('c');

        System.out.println("List = " + l);

        l.add(2, "one");
        System.out.println("List = " + l.get(2));

        l.remove(2);
        System.out.println("List Remove = " + l);

        l.set(2, "one");
        System.out.println("List = " + l);

        System.out.println("List indexOf = " + l.indexOf('b'));
        System.out.println(l.subList(0, 4));
    }
}
