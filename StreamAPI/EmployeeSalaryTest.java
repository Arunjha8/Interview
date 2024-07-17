package StreamAPI;

import java.util.ArrayList;
import java.util.List;

public class EmployeeSalaryTest {
    public static void main(String[] args) {
        List<EmployeeSalary> l = new ArrayList<EmployeeSalary>();

        l.add(new EmployeeSalary("Arun", 25000));
        l.add(new EmployeeSalary("Yugal", 30000));
        l.add(new EmployeeSalary("Amisha", 10000));
        l.add(new EmployeeSalary("Mahak", 15000));

        l.stream().distinct().filter(e -> (e.getSalary() >= 20000)).forEach(e -> System.out.println(e.getName() + " " + e.getSalary()));
    }
}
