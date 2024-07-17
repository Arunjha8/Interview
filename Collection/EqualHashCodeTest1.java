package Collection;

import java.util.*;

public class EqualHashCodeTest1 {
    public static void main(String[] args) {
        EqualHashCode e1 = new EqualHashCode(100, "Arun", "500");
        EqualHashCode e2 = new EqualHashCode(100, "Arun", "500");
        EqualHashCode e3 = new EqualHashCode(200, "Ojha", "200");

        List l = new ArrayList();
        l.add(e1);
        System.out.println(l);

        l.remove(e2);
        System.out.println(l);

        Set s = new HashSet();
        s.add(e1);
        System.out.println(s);

        s.add(e2);
        System.out.println(s);

        s.add(e3);
        System.out.println(s);
    }
}
