package Basic;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateParsing {
    public static void main(String[] args) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String date = "01/07/2001";
        Date d = sdf.parse(date);
        System.out.println(d+" = String to date");
        String stringDate=sdf.format(d);
        System.out.println(stringDate+" = Date to String");
    }
}
