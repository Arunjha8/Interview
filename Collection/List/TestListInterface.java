package Collection.List;

import java.util.ArrayList;
import java.util.List;

// List Can Be Null
// List Can Be Duplicate
// List in Always Natural Order
// List Supported Multiple Data Type
public class TestListInterface {
    public static void main(String[] args) {
        List l = new ArrayList();

        l.add(10);
        l.add(5.1);
        l.add("Arun");
        l.add("Mahak");
        System.out.println("All Element of List" + l);

        System.out.println(l.indexOf("Mahak"));

        System.out.println(l.lastIndexOf("A"));

        System.out.println(l.subList(0,4));
        l.add(1,78);
        System.out.println(l);

        System.out.println(l.size());

        l.set(1,"Amisha");
        System.out.println(l);

        System.out.println(l.isEmpty());
        System.out.println(l.contains(10));

        List l2=new ArrayList();
        l2.add("Amisha");
        l2.add("Yugal");

        //Contain all element of l2 which are same in l
 //       l2.retainAll(l);
        System.out.println(l2);

        System.out.println(l.removeAll(l2));
		System.out.println(l2);
        System.out.println(l);

    }
}
