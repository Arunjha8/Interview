package OOP;

public class ReferenceTest {
    public static void main(String[] args) {
        Reference r = new Reference();
        r.i = 10;

        Reference r1 = r;
        r1.i = 20;

        System.out.println(r.i);
        System.out.println(r1.i);
    }
}
