package module5.review;

import java.util.Locale;
import java.util.ResourceBundle;

public class Question5 {
    public static void main(String[] args) {
//        Dolphins.properties
//                name=The Dolphin
//                age=0
//        Dolphins_en.properties
//                name=Dolly
//        age=4
//        Dolphins_fr.properties
//                name=Dolly

        Locale fr = new Locale("fr");
        Locale.setDefault(new Locale("en", "US"));
        ResourceBundle b = ResourceBundle.getBundle("Dolphins", fr);

        b.getString("name");
        b.getString("age");


//        Hierarhy
//        fr -> default



    }
}
