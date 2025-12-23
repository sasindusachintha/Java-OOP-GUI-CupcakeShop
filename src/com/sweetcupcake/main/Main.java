
package com.sweetcupcake.main;
import com.sweetcupcake.controller.AuthController;
import com.sweetcupcake.dao.*;
import com.sweetcupcake.ui.*;
import java.sql.*;
import javax.swing.UIManager;
import javax.swing.*;


public class Main {
    public static void main(String[] args) {
        try {
          UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");

         SwingUtilities.invokeLater(() -> {
             try{
            Connection conn = connect.ConnectDB();

            
            UserDAO userDao = new UserDAO(conn);
            AuthController authController = new AuthController(userDao);

           
            new Login(authController, conn).setVisible(true);
             } catch (Exception e) {
                    e.printStackTrace();
             }
             });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
