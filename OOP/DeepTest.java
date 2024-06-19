package OOP;

public class DeepTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        DeepAddress add = new DeepAddress();
        add.setCity("Indore");

        DeepStudent s = new DeepStudent();
        s.setRollNo(101);
        s.setAddress(add);

        DeepStudent s1 = (DeepStudent) s.clone();
        s1.setRollNo(102);
        s1.address.city = "Gwalior";

        System.out.println(s.getRollNo());
        System.out.println(s.getAddress().city);
        System.out.println();
        System.out.println(s1.getRollNo());
        System.out.println(s1.address.city);
    }
}
