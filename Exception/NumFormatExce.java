package Exception;

public class NumFormatExce {
    public static void main(String[] args) {
        String s="aa12";
        try {
            int i=Integer.parseInt(s);
        }catch (NumberFormatException e){
            System.out.println(e);
        }
    }
}
