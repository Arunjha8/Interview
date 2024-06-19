package Basic;

import java.util.ArrayList;
import java.util.List;

public class ForEachhh {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(1);
        list.add("Two");
        list.add("Three");
        list.add("Four");
        list.forEach(e -> System.out.println(e));
    }
}
