package Basic;

import java.time.LocalDate;

public class DateEndStart {
    public static void main(String[] args) {
        // if endDate is less than today print an error message
        LocalDate endDate = LocalDate.of(2024, 05, 28);

        LocalDate startDate = LocalDate.now();

        if (endDate.isBefore(startDate)) {
            System.out.println("Error Message");

        } else {
            System.out.println("Success Message");
        }
    }
}
