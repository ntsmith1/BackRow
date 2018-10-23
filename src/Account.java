/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dmich
 */
public class Account {
    
    public String name;
    public String meterType;
    public long accountID;
    
    //constructor
    public void Account(String name, String meterType, long accountID) {
        this.name = name;
        this.meterType = meterType;
        this.accountID = accountID;
    }
}
