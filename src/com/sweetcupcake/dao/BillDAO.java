
package com.sweetcupcake.dao;
import com.sweetcupcake.model.Bill;
import java.sql.*;

public class BillDAO {
    private Connection conn;
    
    public BillDAO(Connection conn){
        this.conn = conn;
    }
    
    public boolean saveBill(Bill bill) throws SQLException{
        String dateString = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new java.util.Date());
     
            String sql = "INSERT INTO transactionhistory (Cupcake_ID, Cupcake_Name, Quantity, Unit_Price, Total_Price, [Date])"
                         +"VALUES ( ?, ?, ?, ?, ?, ?)";
            PreparedStatement pst = conn.prepareStatement(sql);
            
            pst.setInt(1, bill.getCupcake().getId());
            pst.setString(2, bill.getCupcake().getName());
            pst.setInt(3, bill.getQuantity());
            pst.setDouble(4,bill.getCupcake().getPrice());
            pst.setDouble(5, bill.getTotal());
            pst.setTimestamp(6, new java.sql.Timestamp(System.currentTimeMillis()));
   
            int rows = pst.executeUpdate();
            return rows > 0;
    }
}
