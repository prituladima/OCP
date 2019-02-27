package module10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * java -cp "<java_home>/db/lib/derby.jar:." GettingDatabaseConnection
 * to run it without IDEA
 */
public class GettingDatabaseConnection {

    public static void main(String[] args) throws ClassNotFoundException {
        //not a mandatory since META-INF has java.sql.Driver description since java6 and JDBC 4.0
        Class.forName("org.apache.derby.jdbc.AutoloadedDriver");
//        Class.forName("not.a.driver");

        viaDateSource();
        viaDriverManager();
    }

    private static void viaDateSource() {

    }

    private static void viaDriverManager() {
        try (Connection conn = DriverManager.getConnection("module10:derby:zoo")) {
            System.out.println(conn);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
