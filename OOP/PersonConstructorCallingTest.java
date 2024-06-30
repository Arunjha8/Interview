package OOP;

public class PersonConstructorCallingTest extends PersonConstructorCalling{
    public PersonConstructorCallingTest(String fname, String lname, String address) {
        super(fname, lname, address);
    }

    public static void main(String[] args) {
        PersonConstructorCalling t = new PersonConstructorCalling("Arun", "Ojha", "Indore");
        PersonConstructorCallingTest t1 = new PersonConstructorCallingTest("Arun", "Ojha", "Indore");
    }
}
