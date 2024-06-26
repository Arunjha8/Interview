package OOP;

public class DeepStudent implements Cloneable {
    public int rollNo;
    public DeepAddress address;

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public DeepAddress getAddress() {
        return address;
    }

    public void setAddress(DeepAddress address) {
        this.address = address;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        DeepStudent s = (DeepStudent) super.clone();
        s.address = (DeepAddress) address.clone();
        return s;
    }
}
