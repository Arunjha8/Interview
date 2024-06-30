package Exception;

public class ArrayOutofBond {
    public static void main(String[] args) {
        String[] a = {"arun", "yugal", "mahak", "lavish"};
        try {
            for (int i = 0; i < a.length; i++) {
                System.out.println(a[7]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}
