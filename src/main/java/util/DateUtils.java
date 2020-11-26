package util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * 처음 설계에서 getPrice에 시간, 분을 매개변수로 받다보니 복잡해진 상황...
 * 어짜피 주차 요금은 시간, 분 둘다 필요한게 아닌 분만 알아도 계산이 가능하므로
 * 추후 리팩토링에서 시간+분 => 분 으로 수정...?
 */
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

    public static int getDiffHours(final String entranceTime, final String exitTime) {
        SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT, Locale.KOREA);
        int diffHours = 0;
        try {
            Date entranceDate = sdf.parse(entranceTime);
            Date exitDate = sdf.parse(exitTime);

            diffHours = (int)((exitDate.getTime() - entranceDate.getTime()) / 3600000);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return diffHours;
    }

    public static int getDiffMinutes(final String entranceTime, final String exitTime) {
        SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT, Locale.KOREA);
        int diffMinutes = 0;
        try {
            Date entranceDate = sdf.parse(entranceTime);
            Date exitDate = sdf.parse(exitTime);

            diffMinutes = (int)((exitDate.getTime() - entranceDate.getTime()) / 60000);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return diffMinutes % 60;
    }

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT, Locale.KOREA);
        Date d1 = sdf.parse("202011251200");
        Date d2 = sdf.parse("202011251330");

        int diffHour = (int) ((d2.getTime() - d1.getTime()) / 3600000);
        int diffMinute = (int) ((d2.getTime() - d1.getTime()) / 60000);
        System.out.println(diffHour);
        System.out.println(diffMinute);
    }

}
