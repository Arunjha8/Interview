package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PersonTest {
    public static void main(String[] args) {
        Person e1 = new Person(1, "abc", 1000);
        Person e2 = new Person(2, "xyz", 2000);

        List l = new ArrayList();
        l.add(e1);
        l.add(e2);

        Iterator it = l.iterator();
        while (it.hasNext()) {
            Person e = (Person) it.next();
            System.out.println(e);
//            System.out.println(e.getId());
//            System.out.println(e.getName());
//            System.out.println(e.getSalary());
        }
    }
}
