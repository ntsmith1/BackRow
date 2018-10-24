/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dmich
 */
public class Supervisor {
    
    public String name;
    private char[] password;
    
    //constructor
    public void Supervisor(String name, char[] password) {
        this.name = name;
        this.password = password;
    }
}
