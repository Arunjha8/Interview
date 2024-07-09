package Collection.List;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateFromArrayList {
    public static void main(String[] args) {
        List l = new ArrayList();

        l.add(1);
        l.add(2);
        l.add(3);
        l.add(1);
        l.add("xyz");
        l.add("xyz");

        System.out.println(l);

        Set s = new HashSet(l);
        System.out.println(s);
    }
}
