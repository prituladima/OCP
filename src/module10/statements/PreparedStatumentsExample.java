package module10.statements;

import java.sql.*;

public class PreparedStatumentsExample {
    public static void main(String[] args) throws SQLException {

//        Instances of PreparedStatement contain an SQL statement that has already been compiled.
//        This is what makes a statement "prepared."

//        The SQL statement contained in a PreparedStatement object may have one or more IN
//        parameters. An IN parameter is a parameter whose value is not specified when the SQL
//        statement is created. Instead, the statement has a question mark (?) as a placeholder for
//        each IN parameter. The ? is also known as a parameter marker or parameter placeholder. An
//        application must set a value for each parameter marker in a prepared statement before
//        executing the prepared statement.

        Connection con = null;
        PreparedStatement pstmt2 = con.prepareStatement(
                "SELECT a, b, c FROM Table1", ResultSet.TYPE_SCROLL_SENSITIVE,

                ResultSet.CONCUR_UPDATABLE);

//        Passing IN Parameters
        pstmt2.setLong(1, 123456789L);
        pstmt2.setLong(2, 100000000L);

        pstmt2.addBatch();

        pstmt2.setClob(1, (Clob) null);//Blob
        pstmt2.setLong(2, 350985840);


        ResultSet rs = pstmt2.executeQuery();
    }

}
