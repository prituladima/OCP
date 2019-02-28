package module10.closing;

import java.sql.*;

public class ClosingDatabaseResources {
    public static void main(String[] args) {
        String url = " jdbc:derby:zoo";
        try (Connection conn = DriverManager.getConnection(url);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("select name from animal")) {
            while (rs.next())
                System.out.println(rs.getString(1));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
