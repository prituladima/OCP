package module10.statements;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ExecutionStatements {
    public static void main(String[] args) throws SQLException {

//        stmt.execute() boolean
//        stmt.executeQuery() ResultSet
//        stmt.executeUpdate() int

//■ Always use an if statement or while loop when calling rs.next().
//■ Column indexes begin with 1.

        Connection conn = null;
        Statement stmt = conn.createStatement();


        int result = stmt.executeUpdate(
                "insert into species values(10, 'Deer', 3)");
        System.out.println(result); // 1
        result = stmt.executeUpdate(
                "update species set name = '' where name = 'None'");
        System.out.println(result); // 0
        result = stmt.executeUpdate(
                "delete from species where id = 10");
        System.out.println(result); // 1


        ResultSet rs = stmt.executeQuery("select * from species");

        boolean isResultSet = stmt.execute("");
        if (isResultSet) {
            ResultSet rs1 = stmt.getResultSet();
            System.out.println("ran a query");
        } else {
            int result1 = stmt.getUpdateCount();
            System.out.println("ran an update");
        }
    }
}
