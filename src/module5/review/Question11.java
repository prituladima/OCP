package module5.review;

import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Question11 {
    public static void main(String[] args) {
        LocalDateTime d = LocalDateTime.of(2015, 5, 10, 11, 22, 33);
        Period p = Period.ofDays(1).ofYears(2);//DOES NOT ALLOWS CHAINS/ SO ONLY LAST WILL BE APPLIED

        d = d.minus(p);

        DateTimeFormatter f = DateTimeFormatter.
                ofLocalizedDateTime(FormatStyle.SHORT);
        System.out.println(f.format(d));
    }
}
