package Collection.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TestStudent {
    public static void main(String[] args) {
        List s = new ArrayList();

        s.add(new Student("Arun", 10));
        s.add(new Student("Amisha", 100));
        s.add(new Student("Mahak", 10));
        s.add(new Student("Amisha", 10));

        Collections.sort(s);

        Iterator it = s.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

//        s.forEach(System.out::println);
    }
}
