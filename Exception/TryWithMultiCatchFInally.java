package Exception;

public class TryWithMultiCatchFInally {
    public static void main(String[] args) {
        String s = "arun";
        try {
            System.out.println(s.length());
            System.out.println(s.charAt(8));
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Finally block");
        }
    }
}
