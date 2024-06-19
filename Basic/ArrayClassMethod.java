package Basic;

public class ArrayClassMethod {
    public static void main(String[] args) {
        int[] i = new int[2];
        i[0] = 10;
        i[1] = 20;

        String[] s = new String[2];
        s[0] = "10";
        s[1] = "20";
//output [I = represent integer
        String packageName = i.getClass().getPackageName();
        String className = i.getClass().getName();
        System.out.println(packageName);
        System.out.println(className);
    }
}
