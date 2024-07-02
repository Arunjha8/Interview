package Exception;

public class HierarchyException {
    public static void main(String[] args) {
        String s = "arun";
        try {
            int c = 10 / 0;
            System.out.println(s.charAt(4));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException");
        } catch (RuntimeException e) {
            System.out.println(e);
            // System.exit(0);
        } catch (Exception e) {
            System.out.println("Exception");
            System.exit(0);
        } finally {
            System.out.println("Finally block");
        }
    }
}
