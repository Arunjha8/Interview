package Basic;

import java.sql.SQLOutput;

public class TestArmsInterface {
    public static void main(String[] args) {
        ArmsInterface armsInterface = (b) -> {
            int sum = 0;
            int r;
            int a = b;
            while (b > 0) {
                r = b % 10;
                sum += (r * r * r);
                b = b / 10;
            }
            if (sum == a) {
                System.out.println("ArmStrong Number");
            } else {
                System.out.println("Not ArmStrong Number");
            }
        };

        armsInterface.arms(153);  //153, 371

    }
}
