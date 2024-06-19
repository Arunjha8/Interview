package OOP;

public class ShallowClonee implements Cloneable {
    public int a;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
