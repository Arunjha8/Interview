package Basic;

public class HarmonicSeries {
    public static void main(String[] args) {
        // Pattern 1
        int num = 5;
        double result = 0.0;
        while (num > 0) {
            result = result + 1 / num;
            num--;
            System.out.print(result + ", ");
        }
        System.out.println();

        //Pattern 2
        for (float i = 1; i <= 5; i++) {
            System.out.print(1 / i + ",");
        }
        System.out.println();
        //Patern 3
        int n = 5;
        System.out.print("Harmonic Series up to " + n + " terms: ");
        for (int i = 1; i <= n; i++) {
            System.out.print("1/" + i);
            if (i != n) {
                System.out.print(" + ");
            }
        }
        System.out.println();

        //Pattern 4
        int numb = 5;
        int i = 1;
        System.out.print("Harmonic Series up to " + n + " terms: ");
        while (i <= n) {
            System.out.print("1/" + i);
            if (i != n) {
                System.out.print(" + ");
            }
            i++;
        }
        System.out.println();
    }
}
