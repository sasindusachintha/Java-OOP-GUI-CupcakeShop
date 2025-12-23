package com.sweetcupcake.dao;



import javax.swing.*;
import java.sql.*;

public class connect {
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;

    public static Connection ConnectDB(){
        try{
            Connection conn = DriverManager.getConnection("jdbc:ucanaccess://database/sweetcupcake.accdb");
            JOptionPane.showMessageDialog(null, "Connection Establisheed");
            return conn;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error cannot Connect to Database! ");
            return null;
        }
    }    
}
