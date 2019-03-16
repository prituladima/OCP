package module5.review;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;

public class Question2 {
    public static void main(String[] args) {
        Locale yourLocale = new Locale("ru");
        Locale yourLocale1 = new Locale("iw");
        Locale yourLocale2 = new Locale("ch");

        System.out.println("Date");
        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, yourLocale2);
        Date yourDate = new Date();
        String formattedDate = df.format(yourDate);
        System.out.println(formattedDate);

        System.out.println("Currency");
        double amount = 200000.5;
        Locale locale = new Locale("iw", "IS");
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(locale);
        System.out.println(currencyFormatter.format(amount));

        System.out.println("Number");
        NumberFormat currencyFormatter1 = NumberFormat.getInstance(locale);
        System.out.println(currencyFormatter1.format(amount));



    }
}
