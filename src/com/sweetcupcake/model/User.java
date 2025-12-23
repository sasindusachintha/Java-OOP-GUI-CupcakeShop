
package com.sweetcupcake.model;

/**
 *
 * @author sasindu
 */
public class User {
    private int id;
    private String fullName;
    private String contact;
    private String role;
    private String username;
    private String password;
    
    public User(int id ,String fullName, String contact, String role, String username, String password){
        this.id = id;
        this.fullName = fullName;
        this.contact = contact;
        this.role = role;
        this.username = username;
        this.password = password;
    }
    //Getters
    public int getId(){
        return id;
    }
    public String getFullName(){
        return fullName;
    }
    public String getContact(){
        return contact;
    }
    public String getRole(){
        return role;
    }
    public String getUsername(){
        return username;
    }
    public String getPassword(){
        return password;
    }
}
