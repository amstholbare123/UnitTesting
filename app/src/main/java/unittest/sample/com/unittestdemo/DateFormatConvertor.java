package unittest.sample.com.unittestdemo;

import java.sql.Date;
import java.text.SimpleDateFormat;

/**
 * Created by amol on 29/12/16.
 */

public class DateFormatConvertor {

    public static String converintoDateFormat(Long timestamp) {
        String formatedDate;
        try {
            Date date = new Date(timestamp);
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd MMM yyyy");
            formatedDate = dateFormat.format(date);
        } catch (Exception ec) {
            return "Enter date in proper format";
        }

        return formatedDate;


    }
}
