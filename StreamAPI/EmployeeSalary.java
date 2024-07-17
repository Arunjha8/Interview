package StreamAPI;

public class EmployeeSalary {
    private String name;
    private int salary;

    public EmployeeSalary(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }
}
