/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dmich
 */
public class Secretary {
    
    public String name;
    public char[] password;
    
    //constructor
    public void Secretary(String name, char[] password) {
        this.name = name;
        this.password = password;
    }
    
    public double calcClientBill(Account client) {
        double minBill;
        double total;
        switch (client.meterType) {
            case "A":
                minBill = 31.54;
                break;
            case "B":
                minBill = 45.81;
                break;
            case "F":
                minBill = 76.35;
                break;
            case "K":
                minBill = 244.32;
                break;
            case "N":
                minBill = 488.64;
            case "R":
                minBill = 763.50;
        }
        return 0.0;
    }
    
    public void changeRate() {
        
    }
    
    public void addLevel() {
        
    }
    
    public void removeLevel() {
        
    }
    
    public void changeBoundaries() {
        
    }
    
    public void enterPayment(Account client, double amountPaid) {
        
    }
    
    public void viewClientInfo(Account client) {
        
    }
    
    public void viewClientInfo(String name) {
        
    }
    
    public void viewClientInfo(int accNum) {
        
    }
}
