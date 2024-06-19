package OOP;

public class PersonConstructorCalling {
    String fname;
    String lname;
    String address;

    public PersonConstructorCalling(String fname, String lname) {
        this.fname = fname;
        this.lname = lname;
        System.out.println(fname);
        System.out.println(lname);
    }

    public PersonConstructorCalling(String fname, String lname, String address) {
        this(fname, lname);
        this.address = address;
        System.out.println(address);
    }
}
