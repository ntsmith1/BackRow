
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dmich
 */
public class MeterReader {
    
    public String name;
    public char[] password;
    
    //constructor
    public void MeterReader(String name, char[] password) {
        this.name = name;
        this.password = password;
    }
    
    public void enterReading(Account client, int reading) {
        client.readings.add(reading);
    }
    
    public void viewClientInfo(Account client) {
        
    }
    
    public void searchForClientbyAccountID(List<Account> accounts, int accountID) {
        
    }
    
    public void searchForClientByName(List<Account> accounts, String name) {
        
    }
    
    public void searchForClientByAddress(List<Account> accounts, String address) {
        
    }
}
