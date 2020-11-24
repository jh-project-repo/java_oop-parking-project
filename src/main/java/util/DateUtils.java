package util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {

    private static final String DATE_FORMAT = "yyyyMMddHHmm";
    private static final String NEW_DATE_FORMAT = "yyyy/MM/dd HH:mm";

    public static String getDateFormat(final String time) {
        String newTime = "";
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT);
            SimpleDateFormat newDateFormat = new SimpleDateFormat(NEW_DATE_FORMAT);
            Date date = dateFormat.parse(time);
            newTime = newDateFormat.format(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return newTime;
    }

}
