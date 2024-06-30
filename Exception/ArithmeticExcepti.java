package Exception;

public class ArithmeticExcepti {
    public static void main(String[] args) {
       // int a = 10;
        try {
            int c = 10 / 0;
            System.out.println(c);
        } catch (Exception e) {
            System.out.println("ArithmeticException");
        }
    }
}
