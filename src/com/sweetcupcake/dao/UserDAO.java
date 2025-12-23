
package com.sweetcupcake.dao;
import com.sweetcupcake.model.*;
import java.sql.*;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author sasin
 */
public class UserDAO {
    private Connection conn;
    
    public UserDAO(Connection conn){
        this.conn = conn;
    }
    public User findByUsernameANDPassword(String username, String password) throws SQLException
    {    
     String sql = "SELECT * FROM userinfo WHERE username = ? AND password = ? ";
        
         PreparedStatement pst = conn.prepareStatement(sql);
         pst.setString(1, username.trim());
         pst.setString(2, password.trim());
         
         ResultSet rs = pst.executeQuery();
         
         if(rs.next()){   
             int userid = rs.getInt("User_ID");
             String fullname = rs.getString("Full_Name");
             String role = rs.getString("Role");   
              
              if (role.equalsIgnoreCase("Manager")){
                  return new Manager(userid, fullname, role, username, password);
            }else {
                  return new Cashier(userid, fullname, role, username, password);
             }
         } else{
        return null;    
      }                    
    }

public void insertLoginHistory(User user) throws SQLException{
    String insertsql = "INSERT INTO loginhistory (User_ID, Full_Name, Role, [Date]) VALUES (?, ?, ?, ?)";
    PreparedStatement pst1 = conn.prepareStatement(insertsql);      
    pst1.setTimestamp(4, new java.sql.Timestamp(System.currentTimeMillis()));
    pst1.setInt(1,user.getId());
    pst1.setString(2, user.getFullName());
    pst1.setString(3, user.getRole());
    pst1.setTimestamp(4, new Timestamp(System.currentTimeMillis()));
    pst1.executeUpdate();
  }


    public boolean addUser(User user) {
    try {
        String sql = "INSERT INTO userinfo (User_ID, Full_Name, Contact, Role, username, password) VALUES (?, ?, ?, ?, ?, ?)";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setInt(1, user.getId());
        pst.setString(2, user.getFullName());
        pst.setString(3, user.getContact());
        pst.setString(4, user.getRole());
        pst.setString(5, user.getUsername());
        pst.setString(6, user.getPassword());
        return pst.executeUpdate() > 0;
    } catch (SQLException e) {
        e.printStackTrace();
        return false;
    }
}
    public boolean updateUser(User user) {
        try {
            String sql = "UPDATE userinfo SET Full_Name = ?, Contact = ?, Role = ?, username = ?, password = ? WHERE User_ID = ?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, user.getFullName());
            pst.setString(2, user.getContact());
            pst.setString(3, user.getRole());
            pst.setString(4, user.getUsername());
            pst.setString(5, user.getPassword());
            pst.setInt(6, user.getId());
            return pst.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
        public boolean deleteUser(int userId) {
        try {
            String sql = "DELETE FROM userinfo WHERE User_ID = ?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(1, userId);
            return pst.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    // Get all users
    public List<User> findAllUsers() {
        List<User> users = new ArrayList<>();
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM userinfo");
            while(rs.next()) {
                users.add(new User(
                    rs.getInt("User_ID"),
                    rs.getString("Full_Name"),
                    rs.getString("Contact"),
                    rs.getString("Role"),
                    rs.getString("username"),
                    rs.getString("password")
                ));
            }
        } catch(SQLException e) {
            e.printStackTrace();
        }
        return users;
    }
public List<User> getAllUsers() {
    return this.findAllUsers();
}

}

