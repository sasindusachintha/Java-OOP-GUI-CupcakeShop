
package com.sweetcupcake.controller;
import com.sweetcupcake.dao.*;
import com.sweetcupcake.model.*;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;

public class AuthController {
    private final UserDAO userDao;
    
    public AuthController(UserDAO userDao){
        this.userDao = userDao;
}
    public User login(String username, String password) throws SQLException{
        try{
            User user = userDao.findByUsernameANDPassword(username, password);
            if(user != null){
             userDao.insertLoginHistory(user);
             
             JOptionPane.showMessageDialog(null, "Login Successful!");
             return user;
            }else{
              JOptionPane.showMessageDialog(null, "Invalid Username or Password!");
              return null;
            }
        }catch(SQLException e){
                    JOptionPane.showMessageDialog(null, e);
                    return null;
        }
    }
      public List<User> getAllUsers() {
      return userDao.findAllUsers();
    } 
   public UserDAO getUserDao(){
     return this.userDao;
    }
}
  


   
