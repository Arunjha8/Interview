package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee e1 = new Employee(1, "abc", 1000);
        Employee e2 = new Employee(2, "xyz", 2000);

        List l = new ArrayList();
        l.add(e1);
        l.add(e2);

        Iterator it = l.iterator();
        while (it.hasNext()) {
            Employee e = (Employee) it.next();
 //           System.out.println(e);
            System.out.println(e.getId());
            System.out.println(e.getName());
            System.out.println(e.getSalary());
        }
    }
}
