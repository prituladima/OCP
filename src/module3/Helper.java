package module3;


import java.io.FileNotFoundException;

public class Helper {
    public static <T extends Exception> void printException(T u) {
        System.out.println(u);
    }

    public static void main(String[] args) {

        Helper.printException(new FileNotFoundException("A"));
         Helper.printException(new Exception("B"));
//         Helper.<Throwable>printException(new Exception("C"));
         Helper.<NullPointerException>printException(new NullPointerException("D"));
//         Helper.printException(new Throwable("E"));

    }
}
