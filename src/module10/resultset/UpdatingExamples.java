package module10.resultset;

import java.sql.*;

public class UpdatingExamples {
    public static void main(String[] args) throws SQLException {
        Statement stmt;
        try (Connection con = DriverManager.getConnection(
                "jdbc:mySubprotocol:mySubName")) {
            stmt = con.createStatement(
                    ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);

            ResultSet uprs = stmt.executeQuery(
                    "SELECT COF_NAME, PRICE FROM COFFEES");
            uprs.updateFloat("PRICE", 10.99f);
            if (false) {
                uprs.cancelRowUpdates();
            }
            uprs.updateRow();


            uprs.moveToInsertRow();

            uprs.updateString("COF_NAME", "Kona");
            uprs.updateInt("SUP_ID", 150);
            uprs.updateFloat("PRICE", 10.99f);
            uprs.updateInt("SALES", 0);
            uprs.updateInt("TOTAL", 0);

            uprs.insertRow();


            uprs.absolute(4);
            uprs.deleteRow();

            uprs.refreshRow();
        }
    }
}
