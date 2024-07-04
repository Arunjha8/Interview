package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FailFast {
    public static void main(String[] args) {
        List l = new ArrayList();
        l.add(1);
        l.add(2);
        l.add(3);

        Iterator it = l.iterator();

//        l.add(4);    // Here we cannot add or remove elements
//        l.clear();
//        l.add(5);
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
