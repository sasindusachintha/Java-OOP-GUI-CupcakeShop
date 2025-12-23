package com.sweetcupcake.dao;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;
import javax.swing.*;
import net.proteanit.sql.DbUtils;
import com.sweetcupcake.model.*;

public class CupcakeDetails {
    
    private Connection conn; 
    
    public CupcakeDetails(Connection conn){
        this.conn = conn;
    }
    public List<Cupcake> getAllCupcakes() throws SQLException{
          List<Cupcake> list = new ArrayList<>();
          String sql = "SELECT * FROM cupcake";
          PreparedStatement pst = conn.prepareStatement(sql);
          ResultSet rs = pst.executeQuery();
          
          while(rs.next()){
              Cupcake c = new Cupcake(
              rs.getInt("Cupcake_ID"),
              rs.getString("Cupcake_Name"),
              rs.getString("Category"),
              rs.getDouble("Price"),
              rs.getInt("Quantity"),
              rs.getString("Status")
              );
              list.add(c);
          }
    return list;
}

public boolean updateQuantity(int cupcakeId, int soldQuantity) throws SQLException
   {
     String sql = "UPDATE cupcake SET Quantity = Quantity - ? WHERE Cupcake_ID = ? AND Quantity >= ?";
     PreparedStatement pst = conn.prepareStatement(sql);
     pst.setInt(1, soldQuantity);
     pst.setInt(2, cupcakeId);
     pst.setInt(3, soldQuantity);

     int rows = pst.executeUpdate();
     return rows > 0;
}
}
  
