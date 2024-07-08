package Collection.Map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap m = new HashMap();
        m.put(1, null);
        m.put(2, null);
        m.put(4, "four");
        m.put(3, "three");

        System.out.println(m.size());
        System.out.println(m);
        System.out.println(m.get(3));

        for (Object o : m.entrySet()) {
            System.out.println(o);
        }
    }
}
