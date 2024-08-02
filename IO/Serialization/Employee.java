package IO.Serialization;

import java.io.Serializable;

public class Employee implements Serializable {
    public int id = 0;
    public String name = null;
    public String address = null;
    public transient int salary = 5000;

}
