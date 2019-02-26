package test5;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleExample {

    public static void main(String[] args) {
        Locale myLoc = new Locale("fr", "FR");
        ResourceBundle rb = ResourceBundle.getBundle("appmessages", myLoc);
        rb = ResourceBundle.getBundle("appmessages", new Locale("ch", "CH"));
        rb = ResourceBundle.getBundle("appmessages", Locale.CHINA);

    }
}
