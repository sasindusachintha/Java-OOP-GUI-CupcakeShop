package com.sweetcupcake.dao;

import java.sql.*;
import net.proteanit.sql.DbUtils;
import javax.swing.*;

public class BillHistoryTable {
    Connection conn;
    
    public BillHistoryTable(Connection conn){
        this.conn = conn;
    }
    public void UpdateTable(JTable table){
        try{
            String sql = " SELECT * FROM transactionhistory ";
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            table.setModel(DbUtils.resultSetToTableModel(rs));
            table.setDefaultEditor(Object.class, null);
            
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
