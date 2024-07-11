package Exception;

public class Z {
    public static void main(String[] args) {
        try {
            int c = 10 / 0;
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
