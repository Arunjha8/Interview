package string;

public class ExtractIntFromString {
    public static void main(String[] args) {
        String name = "arun1234";
        int[] array = new int[name.length()];

        for (int i = 0; i < name.length(); i++) {
            if (Character.isDigit(name.charAt(i))) {
                array[i] = Integer.parseInt(String.valueOf(name.charAt(i)));
            }
        }
         System.out.println(array[4] + " , " + array[6]);
        System.out.println(array[5]+array[6]);
    }
}
