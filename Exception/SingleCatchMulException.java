package Exception;

public class SingleCatchMulException {
    public static void main(String[] args) {
        String s = "arun";
        //   String s = null;
        try {
            System.out.println(s.charAt(7));
        } catch (NullPointerException | StringIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }

}
