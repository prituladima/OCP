package module10.metadata;

import java.sql.*;

public class MataDataExample {
    public static void main(String[] args) throws SQLException {

        Connection con = null;
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("select * from COFFEES");
        ResultSetMetaData rsmd = rs.getMetaData();
        int columnCount = rsmd.getColumnCount();

        while (rs.next()) {
            for (int i = 1; i <= columnCount; i++) {
                System.out.print(
                        rsmd.getColumnName(i) + " " +
                                rsmd.getColumnType(i) + " " +
                                rs.getObject(i) + " ");
            }
            System.out.println();
        }

    }
}
