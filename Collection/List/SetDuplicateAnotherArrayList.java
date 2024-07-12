package Collection.List;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetDuplicateAnotherArrayList {
    public static void main(String[] args) {
        List l = new ArrayList();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(2);
        l.add("arun");
        l.add("abc");
        l.add("abc");

        Set unique = new HashSet();
        Set duplic = new HashSet();
        for (Object o : l) {
            if (!unique.add(o)) {
                duplic.add(o);
            }
        }

        List dupList = new ArrayList(duplic);
        List ori = new ArrayList(unique);
        System.out.println("Original List: " + l);
        System.out.println("Original Value List: " + ori);
        System.out.println("Duplicate List: " + dupList);
    }
}
