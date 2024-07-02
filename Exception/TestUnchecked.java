package Exception;

public class TestUnchecked {
    public static void main(String[] args) {
        int i = 5;
        if (i != 5) {
            System.out.println("i is not equal");
        } else {
            RuntimeException e = new RuntimeException("Wrong Number");
            System.out.println(e);
            throw e;
        }
    }
}
