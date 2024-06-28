package advanced.aarav;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class date_time_formatter {
    public static void main(String[] args) {
        // local date time object
        LocalDateTime time = LocalDateTime.now();
        System.out.println(time);
        // local date time object

        // normal date object
        Date today = new Date();
        System.out.println(today);
        // normal date object

        // formating date and time, just for you guyz :)
        LocalDateTime myTime = LocalDateTime.now();
        System.out.println("Before formatting: "+myTime);
        DateTimeFormatter myFormatter = DateTimeFormatter.ofPattern("dd MMM, yyyy H:mm:ss");
        String formatted_date1 = myTime.format(myFormatter);
        System.out.println("After formatting: "+formatted_date1);
        // formating date and time.. just for you guyz :)
    }
}
