package module5;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;

public class LocalizationUsage {

    public static void main(String[] args) {
        Locale yourLocale = new Locale("ru");
        Locale yourLocale1 = new Locale("iw");
        Locale yourLocale2 = new Locale("ch");

        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, yourLocale2);
        Date yourDate = new Date();
        String formattedDate = df.format(yourDate);
        System.out.println(formattedDate);

        double amount = 200.0;
        Locale locale = new Locale("iw", "IS");
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(locale);
        System.out.println(currencyFormatter.format(amount));
    }


}
