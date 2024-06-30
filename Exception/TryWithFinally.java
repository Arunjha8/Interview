package Exception;

public class TryWithFinally {
    public static void main(String[] args) {
        String s="arun";
        try{
            System.out.println( s.charAt(3));
           // System.exit(0);
        }finally {
            System.out.println("end of program");
        }
    }
}
