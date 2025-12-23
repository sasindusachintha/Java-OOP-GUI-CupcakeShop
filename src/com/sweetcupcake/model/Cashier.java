
package com.sweetcupcake.model;

/**
 *
 * @author sasin
 */
public class Cashier extends User {
    public Cashier(int id, String fullName, String contact, String username,String password){
        super(id, fullName, contact, "Cashier", username, password);
    }
}
