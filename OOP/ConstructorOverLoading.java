package OOP;

public class ConstructorOverLoading {
    public int id;
    public String firstName;
    public String lastName;

    public ConstructorOverLoading() {
        System.out.println("This is default constructor");
    }

    public ConstructorOverLoading(int id) {
        this.id = id;
        System.out.println(id);
    }

    public ConstructorOverLoading(int id, String firstName) {
        this.id = id;
        this.firstName = firstName;
        System.out.println(id + " " + firstName);
    }

    public ConstructorOverLoading(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println(id + " " + firstName + " " + lastName);
    }

    public ConstructorOverLoading(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public static void main(String[] args) {
        ConstructorOverLoading c = new ConstructorOverLoading();
        ConstructorOverLoading c1 = new ConstructorOverLoading(10);
        ConstructorOverLoading c2 = new ConstructorOverLoading(11, "Arun");
        ConstructorOverLoading c3 = new ConstructorOverLoading(12, "Varun", "Ojha");
        ConstructorOverLoading c4 = new ConstructorOverLoading("Yugal", "Rajput");
        System.out.println(c4.firstName + " = " + c4.lastName);
    }
}
