package Collection;

public class Person {
    private int id;
    private String name;
    private int salary;

    public Person(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        String s = id + " " + name + " " + salary;
        return s;
    }
}
