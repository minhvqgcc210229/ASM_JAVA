/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.io.Serializable;

/**
 *
 * @author vuong
 */
public class Racket implements Serializable{
    private String ID;
    private String Name;
    private Integer  Amount;
    private Integer  Price;

    public Racket() {
    }

    public Racket(String ID, String name, Integer Amount, Integer price) {
        this.ID = ID;
        this.Name = name;
        this.Amount = Amount;
        this.Price = price;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public Integer getAmount() {
        return Amount;
    }

    public void setAmount(Integer Amount) {
        this.Amount = Amount;
    }

    public Integer getPrice() {
        return Price;
    }

    public void setPrice(Integer price) {
        this.Price = price;
    }
    
   
    
    
}
