package module6;

import java.sql.SQLException;

public class Review {
//    1C ok
//    2BC ok
//    3E ok
//    4ABF wrong F
//    5C ok
//    6G ok
//    7C ok
//    8BC ok
//    9AD ok
//    10ADE wrong D //if compile - doesn't mean appropriate
//    11BD wrong E //DateTimeParseException is RunTime
//    12ACDE wrong C //mistake
//    13A ok
//    14F ok
//    15BCEF wrong CF //error are not required to check
//    16C ok
//    17AB ok
//    18F? wrong B //Closable can't catch something not io
//    19AD wrong A
//    20E ok

    public void read() throws SQLException {
        try {
            readFromDatabase();
        } catch (Exception e) {
//            e = new Exception();//o_O
            throw e;
        }
    }
    private void readFromDatabase() throws SQLException { }

    public static void main(String[] args) {
        System.out.println(13./20);
    }
}
