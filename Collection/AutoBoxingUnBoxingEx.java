package Collection;

public class AutoBoxingUnBoxingEx {
    public static void main(String[] args) {
        //AutoBoxing
        int i = 10;
        Integer i1 = i;
//        System.out.println(i);
        System.out.println(i1);

        //Unboxing
        Integer a = 20;
        int a2 = a;
//        System.out.println(a);
        System.out.println(a2);

        //AutoBoxing
        String str = "Anshul";
        String s = new String(str);
        System.out.println(s);

        //Unboxing
        String s1 = new String("Prajapati");
        String str1 = s1;
        System.out.println(str1);

    }
}
