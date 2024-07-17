package StreamAPI;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeSortByName {
    public static void main(String[] args) {
        List<Employee> l = new ArrayList();

        l.add(new Employee(8, "Arun"));
        l.add(new Employee(5, "Yugal"));
        l.add(new Employee(10, "Amisha"));
        l.add(new Employee(1, "Mahak"));

        l.stream().sorted(Comparator.comparing(Employee::getName)).forEach(e -> System.out.println(e));
        // l.stream().sorted(Comparator.comparing(Employee::getName)).collect(Collectors.toList()).forEach(e -> System.out.println(e.getId() + " " + e.getName()));
    }
}
