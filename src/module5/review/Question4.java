package module5.review;

import java.util.Locale;
import java.util.ResourceBundle;

public class Question4 {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("en", "US"));
        ResourceBundle b = ResourceBundle.getBundle("Dolphins");
        b.getString("name");
//        if all defined in classpath
//        Dolphins_en.java will be used before Dolphins_en.properties

    }


}
