package module10.statements;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

public class CallableStatuments {
    public static void main(String[] args) throws SQLException {

        //IN OUT PARAM
        String sql = "{call updateStats(?, ?)}";
        Connection con = null;
        CallableStatement cstmt = con.prepareCall(sql);
        cstmt.setInt("TRIALS", 398);
        cstmt.setDouble("DILUTION", 0.04395);


        CallableStatement cstmt1 = con.prepareCall(
                "{call reviseTotal(?)}");
        cstmt1.setByte(1, (byte)25);
        cstmt1.registerOutParameter(1, java.sql.Types.TINYINT);
        cstmt1.executeUpdate();
        byte x = cstmt1.getByte(1);

    }
}
