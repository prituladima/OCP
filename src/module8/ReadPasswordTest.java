package module8;

import java.io.Console;

public class ReadPasswordTest {
    public static void main(String[] args) {
        //WE CAN READ/WRITE IN CONSOLE
        Console c = System.console();//return null in idea
        System.out.println("Enter password: ");
        char[] ch = c.readPassword();
        String pass = String.valueOf(ch);//converting char array into string
        System.out.println("Password is: " + pass);

        c.readPassword();
        c.reader();
        c.writer();
        c.readLine();
        c.format(null, null);
//        c.read()
//        c.getPassword()

        //console never throws any exception
    }
}
