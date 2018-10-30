
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
public class Account {
    
    public String name;
    public String address;
    public String phone;
    public String meterNum;
    public String meterType;
    public int accountID;
    public List<Integer> readings;
    public int gallonsUsed = setGallonsUsed();
    
    
    public void Account(String name, String meterType, int accountID, String address, String phone, String meterNum) {
        this.name = name;
        this.meterType = meterType;
        this.accountID = accountID;
        this.address = address;
        this.phone = phone;
        this.meterNum = meterNum;
    }

    public int setGallonsUsed() {
        if (readings == null || readings.isEmpty()) {
            return 0;
        } else if (readings.size() == 1) {
            return readings.get(0);
        } else {
            return readings.get(readings.size() - 1) - readings.get(readings.size() - 2);
        }
    }
}
