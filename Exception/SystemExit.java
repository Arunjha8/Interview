package Exception;

public class SystemExit {
    public static void main(String[] args) {
        int a = 8;
        try {
            int c=a/0;
            System.out.println(c);
        }catch (Exception e){
            System.out.println("It is AE");
            System.exit(0);
        }finally {
            System.out.println("Finally");
        }
    }
}
