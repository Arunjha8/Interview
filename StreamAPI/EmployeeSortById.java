package StreamAPI;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class EmployeeSortById {
    public static void main(String[] args) {
        List<Employee> l = new ArrayList();

        l.add(new Employee(8, "Arun"));
        l.add(new Employee(5, "Yugal"));
        l.add(new Employee(10, "Amisha"));
        l.add(new Employee(1, "Mahak"));

        l.stream().sorted(Comparator.comparingInt(Employee::getId)).forEach(e -> System.out.println(e.getId() + " " + e.getName()));
    }
}
