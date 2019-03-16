package testfinal.time;

import java.time.Duration;
import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class InstantExample {
    public static void main(String[] args) {

        Instant now  = Instant.now();
        Instant after  = Instant.now();

        Duration between = Duration.between(now, after);

        System.out.println(between.toMillis());

        long epochSeconds = 0;
        Instant instant = Instant.ofEpochSecond(epochSeconds);
        System.out.println(instant);

        Instant nextDay = instant.plus(1, ChronoUnit.DAYS);
        System.out.println(nextDay); // 2015–05–26T15:55:00Z
        Instant nextHour = instant.plus(1, ChronoUnit.HOURS);
        System.out.println(nextHour); // 2015–05–25T16:55:00Z
        Instant nextWeek = instant.plus(1, ChronoUnit.WEEKS); // exception

    }
}
