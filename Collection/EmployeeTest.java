package Collection;

import java.util.ArrayList;
import java.util.List;

public class EmployeeTest {
    public static void main(String[] args) {
        List list = new ArrayList();

        list.add(new Person(5, "sanat", 1000));
        list.add(new Person(2, "prakhar", 3000));
        list.add(new Person(1, "riya", 2500));
        list.add(new Person(4, "riya", 1200));
        list.add(new Person(3, "ajay", 5000));

     //   Collections.sort(list);

        for (Object object : list) {
            System.out.println(object);
        }
    }
}
