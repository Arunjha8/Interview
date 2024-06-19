package OOP;

public class ShallowCloneeTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        ShallowClonee s1 = new ShallowClonee();
        s1.setA(101);
        //  s1.a = 103;

        ShallowClonee s2 = (ShallowClonee) s1.clone();
        //s2.setA(102);
        s2.a = 104;

        System.out.println(s1.getA());
//        System.out.println(s2.getA());
//        System.out.println(s1.a);
        System.out.println(s2.a);
    }
}
