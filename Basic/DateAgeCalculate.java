package Basic;

import java.time.LocalDate;
import java.time.Period;

public class DateAgeCalculate {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate empDob = LocalDate.of(2000, 01, 8);
        Period p = Period.between(empDob, today);
        System.out.println("Employee age : " + p.getYears());
    }
}
