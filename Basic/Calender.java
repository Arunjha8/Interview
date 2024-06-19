package Basic;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Calender {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Calendar cal = Calendar.getInstance();
        for (int i = 1; i < 12; i++) {
            cal.add(Calendar.DATE, 30);
            //  System.out.println(cal.getTime());
            System.out.println(sdf.format(cal.getTime()));
        }
//        System.out.print(" ");
//        System.out.println(cal.getCalendarType());
//        System.out.println(cal.getTimeZone());
//        System.out.println(cal.getWeekYear());
//        System.out.println(cal.getWeeksInWeekYear());
    }
}
