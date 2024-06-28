package advanced.aarav;

import java.util.Calendar;
import java.util.TimeZone;

public class calendar_class {
    public static void main(String[] args) {

//        gregorian calendar class is always an abstract class
//       カレンダ　クラス　は　いつも　アブスラクト　クラス　ですよ＾

        // to print the calendar type
        Calendar c = Calendar.getInstance();
        System.out.println(c.getCalendarType());//in this case the type is gregory
        // to print the calendar type

        //for time zone :)
        System.out.println(c.getTimeZone());
        //for time zone :)

//        for selecting time zone, add the TimeZone.getTimeZone("Asia/Japan or Asia/India or Asia/Norway or Asia/Poland") whatever the time zone you like
        Calendar c1 = Calendar.getInstance(TimeZone.getTimeZone("Asia/Singapore"));
        System.out.println(c1.getTimeZone());
//        for selecting time zone, add the TimeZone.getTimeZone("JST or IST") whatever the time zone you like



//        To get ID
        Calendar c1getId = Calendar.getInstance(TimeZone.getTimeZone("Asia/Singapore"));
        System.out.println(c1getId.getTimeZone().getID());
//        To get ID

//        go down
//            scrolll down to find more about calendars （ちゅいしてください）｜｜｜｜｜👇🏻👇🏻👇🏻👇🏻👇🏻
















//        what is a gregory calendar?
//         The Gregorian calendar is a solar dating
//        system used by most of the world. It is named for Pope Gregory
//        XIII, who issued the papal bull Inter gravissimas in 1582,
//        announcing calendar reforms.
//        for all of Catholic Christendom.

//        in case for japanese people
//        グレゴリオ暦は、世界中のほとんどの国で使用されている太陽年代測定システムです。
//        この名前は、1582 年にカトリックキリスト
//        教世界全体に暦改革を発表する教皇勅令 Inter gravissimas
//    を発行した教皇グレゴリウス 13 世にちなんで名付けられました。



    }
}
