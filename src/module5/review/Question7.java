package module5.review;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Question7 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.parse(
                "2018–04–30", DateTimeFormatter.ISO_LOCAL_DATE);
        date.plusDays(2);//LocalDate is immutable
//        date.plusHours(3);//illegal for LocalDate
        System.out.println(date.getYear() + " "
                + date.getMonth() + " "+ date.getDayOfMonth());
    }
}
