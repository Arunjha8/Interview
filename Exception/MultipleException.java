package Exception;

public class MultipleException {
    public static void main(String[] args) {
        String name = null;
        try {
            System.out.println(name.length());
            System.out.println(name.charAt(5));
        } catch (NullPointerException e) {
            System.out.println("name can't be null");
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("String is small");
        }
    }
}
