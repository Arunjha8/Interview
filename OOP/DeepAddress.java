package OOP;

public class DeepAddress implements Cloneable {
    public String city;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
