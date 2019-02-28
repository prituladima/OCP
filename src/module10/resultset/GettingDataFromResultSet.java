package module10.resultset;

import java.sql.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class GettingDataFromResultSet {
    public static void main(String[] args) throws SQLException {
        ResultSet resultSet = null;
        if (resultSet != null) {
            boolean aBoolean = resultSet.getBoolean(0);

            Date date = resultSet.getDate(0);
            LocalDate localDate = date.toLocalDate();

            double aDouble = resultSet.getDouble(0);
            int anInt = resultSet.getInt(0);
            long aLong = resultSet.getLong(0);
            Object object = resultSet.getObject(0);
            if(object instanceof Integer){
                int id = (Integer)object;
            }
            if(object instanceof String){
                String id = (String)object;
            }

            String string = resultSet.getString(0);

            Time time = resultSet.getTime(0);
            LocalTime localTime = time.toLocalTime();

            Timestamp timestamp = resultSet.getTimestamp(0);
            LocalDateTime localDateTime = timestamp.toLocalDateTime();

        }
    }
}
