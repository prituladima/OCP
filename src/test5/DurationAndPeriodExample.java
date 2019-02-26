package test5;

import java.time.Duration;
import java.time.Period;

public class DurationAndPeriodExample {
    public static void main(String[] args) {
        Duration d = Duration.ofDays(1);
        System.out.println(d);

        d = Duration.ofMinutes(0);
        System.out.println(d);

        Period p = Period.ofMonths(1);
        p = Period.of(1, 1, 1);

        System.out.println(p);
    }
}
