package Collection.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TestStudent {
    public static void main(String[] args) {
        List l = new ArrayList();

        l.add(new Student("Arun", 10));
        l.add(new Student("Amisha", 100));
        l.add(new Student("Mahak", 10));
        l.add(new Student("Amisha", 10));

        Collections.sort(l);

        Iterator it = l.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

//        l.forEach(System.out::println);
    }
}
