package advanced.aarav;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class java_time_api {
    public static void main(String[] args) {

//        I dunno why i made this file again but for help

//        These are the methods for time API
        LocalDate d = LocalDate.now();
        System.out.println(d);

        LocalTime time = LocalTime.now();
        System.out.println(time);

        LocalDateTime localtime = LocalDateTime.now();
        System.out.println(localtime);
//        These are the methods for time API

    }
}
