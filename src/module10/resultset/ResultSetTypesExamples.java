package module10.resultset;

import java.sql.ResultSet;

public class ResultSetTypesExamples {
    public static void main(String[] args) {
        //mostly used
        int typeForwardOnly = ResultSet.TYPE_FORWARD_ONLY;

        //Allows to move backward
        //supported by most drivers
        int typeScrollInsensitive = ResultSet.TYPE_SCROLL_INSENSITIVE;

        //Allows to move backward
        //not supported by most drivers
        int typeScrollSensitive = ResultSet.TYPE_SCROLL_SENSITIVE;
    }
}
