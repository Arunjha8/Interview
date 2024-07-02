package Exception;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class A {
    public static void main(String[] args) {
        List l = new ArrayList();
        l.add("1");
        l.add("2");
        Iterator it = l.iterator();
        while (it.hasNext()) {
            String s = (String) it.next();
         //   System.out.println(s);
        }
        try {
            String s1 = (String) it.next();
        } catch (NoSuchElementException e) {
           // e.printStackTrace();
            System.out.println(e);
        }
    }
}

