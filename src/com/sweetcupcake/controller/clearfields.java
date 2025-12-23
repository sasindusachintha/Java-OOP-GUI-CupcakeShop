package com.sweetcupcake.controller;

import javax.swing.*;

public class clearfields {
    public static void clear(JComponent... components){
        for(JComponent c : components){
            if(c instanceof JTextField){
                ((JTextField) c).setText("");
            }else if(c instanceof JLabel){
                ((JLabel) c).setText("");
          }
        }
    }
}
