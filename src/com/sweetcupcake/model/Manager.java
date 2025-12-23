
package com.sweetcupcake.model;

/**
 *
 * @author sasin
 */
public class Manager extends User{
    public Manager(int id, String fullName, String contact, String username, String password){
        super(id, fullName, contact, "Manager", username, password);
    }
}
