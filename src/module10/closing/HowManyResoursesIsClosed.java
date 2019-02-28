package module10.closing;

import java.sql.*;

public class HowManyResoursesIsClosed {

    public static void main(String[] args) {
        String url = "jdbc:derby:zoo1";
        try (Connection conn = DriverManager.getConnection(url);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("select count(*) from animal")) {

            if (rs.next()) {
                System.out.println(rs.getInt(1));
            }

            ResultSet rs2 = stmt.executeQuery("select count(*) from animal");
            int num = stmt.executeUpdate(
                    "update animal set name = 'clear' where name = 'other'");
        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println(e.getMessage());
            System.err.println(e.getSQLState());
            System.err.println(e.getErrorCode());
        }

        //four closed resources
    }

}
