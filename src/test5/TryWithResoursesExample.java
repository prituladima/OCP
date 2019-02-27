package test5;

import java.sql.*;

public class TryWithResoursesExample {

    public static void main(String[] args) {
        try (Connection c = DriverManager.getConnection("module10:derby://localhost:1527/sample", "app", "app");
             Statement stmt = c.createStatement();) {
            ResultSet rs = stmt.executeQuery("select * from STUDENT");
            while (rs.next()) {
                System.out.println(rs.getString(0));
            }
        } catch (SQLException e) {
            System.out.println("Exception ");
        }


    }

}
