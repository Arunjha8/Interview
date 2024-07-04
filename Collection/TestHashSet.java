package Collection;

import java.util.HashSet;
import java.util.Set;

public class TestHashSet {
    public static void main(String[] args) {
        Set s = new HashSet();      // unorderd collection
        s.add(1);                   // duplicate value not support
        s.add("one");
        s.add(1);
        s.add(null);
        s.add(null);

        System.out.println("set = " + s);
    }
}
