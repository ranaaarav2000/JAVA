package advanced.aarav;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class gregorian_Calendar_class {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c.getTime());
        //Some methods calendar class
        System.out.println(c.get(Calendar.DATE));
        System.out.println(c.get(Calendar.SECOND));
        System.out.println(c.get(Calendar.HOUR));
//        To display 24H time
        System.out.println(c.get(Calendar.HOUR_OF_DAY) +":"+ c.get(Calendar.MINUTE)  +":"+ c.get(Calendar.SECOND)  +":"+ c.get(Calendar.MILLISECOND));
//        To display 24H time
        //Some methods for calendar class

//        Gregorian calendar
        GregorianCalendar cal = new GregorianCalendar();
        System.out.println(cal.isLeapYear(2018));
//        Gregorian Calendar


        // Some important methods of time zone class(only 2)
        System.out.println(TimeZone.getAvailableIDs()[0]);
        System.out.println(TimeZone.getAvailableIDs()[1]);
        System.out.println(TimeZone.getAvailableIDs()[2]);
        System.out.println(TimeZone.getDefault());
        // Some important methods of time zone class(only 2)
    }
}
