package OOP;

public class ReturnTest {
    public static void main(String[] args) {

        ReturnShape r = ReturnShape.getShape(1);
        ReturnShape c = ReturnShape.getShape(2);
        System.out.println(r.area());
        System.out.println(c.area());
    }
}
