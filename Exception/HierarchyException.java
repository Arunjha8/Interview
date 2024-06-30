package Exception;

public class HierarchyException {
    public static void main(String[] args) {
        String s="arun";
        try{
            System.out.println(s.charAt(4));
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("StringIndexOutOfBoundsException");
        }catch (RuntimeException e){
            System.out.println("RuntimeException");
        }catch (Exception e){
            System.out.println("Exception");
        }
    }
}
