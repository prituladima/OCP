package module5.review;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class Question13 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2016, Month.MARCH, 13);
        LocalTime time = LocalTime.of(1, 30);
        ZoneId zone = ZoneId.of("US/Eastern");

        ZonedDateTime dateTime1 = ZonedDateTime.of(date, time, zone);
        ZonedDateTime dateTime2 = dateTime1.plus(1, ChronoUnit.HOURS);

        System.out.println(dateTime1);
        System.out.println(dateTime2);

        long hours = ChronoUnit.HOURS.between(dateTime1, dateTime2);
        int clock1 = dateTime1.getHour();
        int clock2 = dateTime2.getHour();


        System.out.println(hours + "," + clock1 + "," + clock2);
    }
}
