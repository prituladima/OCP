package module5.review;

import java.util.Locale;

public class Question3 {

    public static void main(String[] args) {

//        properties defined in Java may NOT be defined in *.properties file
//        properties defined in *.properties file may be replaced by java file
//        only for current process
        Locale.setDefault(new Locale("iw"));
//        Java_en.java -> Java_en.properties both allowed

    }

}
