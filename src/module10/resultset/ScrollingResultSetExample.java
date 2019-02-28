package module10.resultset;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ScrollingResultSetExample {
    public static void main(String[] args) throws SQLException {

        ResultSet resultSet = null;

        resultSet.afterLast();//void

        assert resultSet.isAfterLast();//boolean

        while (resultSet.previous()) {
            System.out.println(resultSet.getObject(1));
        }

        assert resultSet.isBeforeFirst();

        assert !resultSet.first();//move and true if exist

        /////////////////

        resultSet.beforeFirst();//void

        assert resultSet.isBeforeFirst();//boolean

        while (resultSet.next()) {
            System.out.println(resultSet.getObject(1));
        }

        assert resultSet.isAfterLast();

        assert !resultSet.last();//move and true if exist


        resultSet.beforeFirst();
        assert resultSet.isBeforeFirst();
        int k = 0;
        while (resultSet.absolute(++k)) {
            System.out.println(resultSet.getObject(0));
        }

        resultSet.beforeFirst();
        assert resultSet.isBeforeFirst();
        while (resultSet.relative(1)) {
            System.out.println(resultSet.getObject(0));
        }

        resultSet.afterLast();
        assert resultSet.isAfterLast();
        while (resultSet.relative(-1)) {
            System.out.println(resultSet.getObject(0));
        }


    }
}
