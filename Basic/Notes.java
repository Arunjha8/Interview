package Basic;

public class Notes {
    public static void main(String[] args) {
        int[] notes = {500, 200, 100, 50, 20, 10, 5, 2, 1};
        int a = 4552;   //a=amount
        int r;          //r=radius
        for (int i = 0; i < notes.length; i++) {
            r = a / notes[i];
            if (r > 0) {
                System.out.println(notes[i] + " = " + r);
                a = a % notes[i];
            }
        }
    }
}
