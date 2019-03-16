package module5.review;

import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Question10 {
    public static void main(String[] args) {
        LocalDateTime d = LocalDateTime
                .of(2015, 5, 10, 11, 22, 33);
        Period p = Period
                .of(1, 2, 3);
        d = d.minus(p);

        DateTimeFormatter f = DateTimeFormatter.
                ofLocalizedTime(//this mean that only time!!!
                        FormatStyle.SHORT
                );
        System.out.println(d.format(f));
    }
}
