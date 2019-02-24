package module6;

import java.sql.SQLException;
import java.time.DateTimeException;
import java.util.MissingResourceException;

public class UnCheckedException {
    public static void main(String[] args) {
        RuntimeException exception = new ArrayStoreException();
        RuntimeException exception1 = new DateTimeException("");
        RuntimeException exception2 = new MissingResourceException("", "", "");
        RuntimeException exception3 = new IllegalStateException();
        RuntimeException exception4 = new UnsupportedOperationException();


        try {
            throw new IllegalArgumentException(new NullPointerException());
        } catch (IllegalArgumentException a) {
            System.out.println(a);
        } catch (NullPointerException n) {
            System.out.println(n);
        }


        if (false) try {
            getDataBase();
//            int n;
        } catch (SQLException e) {
            e.printStackTrace();//TECHNICALLY UNREACHABLE BUT COMPILE
        }
    }


    public static String getDataBase() throws SQLException {
        throw new UnsupportedOperationException();
    }
}
