package Collection.Comparater;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class EmployeeTestComparater {
    public static void main(String[] args) {
        List l = new ArrayList();

        l.add(new Employee("Arun", 103, 2000));
        l.add(new Employee("Mahak", 101, 5000));
        l.add(new Employee("Rahul", 102, 3000));
        l.add(new Employee("Amisha", 100, 1000));
        l.add(new Employee("Amisha", 100, 2000));

//        EmployeeShortByName byName = new EmployeeShortByName();
//        Collections.sort(l, byName);
//        System.out.println("ShortByName>>>");
////        l.forEach(System.out::println);
//        Iterator it = l.iterator();
//        while (it.hasNext()) {
//            System.out.println(it.next());
//        }
//
//        System.out.println("________________________");
//
//        EmployeeShortBySalary bySalary = new EmployeeShortBySalary();
//        Collections.sort(l, bySalary);
//        System.out.println("ShortBySalary>>>");
//        l.forEach(System.out::println);
//
//        System.out.println("________________________");
//
//        EmployeeShortById byId = new EmployeeShortById();
//        Collections.sort(l, byId);
//        System.out.println("ShortById>>>");
//        l.forEach(System.out::println);
//
//        System.out.println("________________________");
//
//        EmployeeShortByIdName byIdName = new EmployeeShortByIdName();
//        Collections.sort(l, byIdName);
//        System.out.println("ShortByIdOrName>>>");
//        l.forEach(System.out::println);

        System.out.println("________________________");

        EmployeeShortByIdNameSalary byIdNameSalary = new EmployeeShortByIdNameSalary();
        Collections.sort(l, byIdNameSalary);
        System.out.println("ShortByIdNameSalary>>>");
        Iterator i = l.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
}
