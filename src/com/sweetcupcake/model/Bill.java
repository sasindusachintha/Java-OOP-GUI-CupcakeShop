package com.sweetcupcake.model;
import java.sql.*;
import com.sweetcupcake.model.*;
/**
 *
 * @author sasin
 */
public class Bill{
    private int billId;
    private Cupcake cupcake;
    private int quantity;
    private double total;
    private Date date;
    
    public Bill(int billId, Cupcake cupcake, int quantity, double total,Date date){
        this.billId = billId;
        this.cupcake = cupcake;
        this.quantity = quantity;
        this.total = total;
        this.date = date;
    }
    public Bill(Cupcake cupcake, int quantity){
        this(0, cupcake, quantity, cupcake.getPrice() * quantity,new Date(System.currentTimeMillis()));     
    }
    //Getters
    public int getBillId(){
        return billId;
    }
    public Cupcake getCupcake(){
        return cupcake;
    }
    public int getQuantity(){
        return quantity;
    }
    public double getTotal(){
        return total;
    }
    public Date getDate(){
        return date;
    }
    
    //Setters
    public void setBillId(int billId){
        this.billId = billId;
    }
    public void setCupcake(Cupcake cupcake){
        this.cupcake = cupcake;
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
    public void setTotal(double total){
        this.total = total;
    }
    public void setDate(Date date){
        this.date = date;
    }
}
