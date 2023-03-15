/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.serverproject;

import java.util.Date;

/**
 *
 * @author W1805896
 */
public class DummyServer {
        
    String ID = "Server666";
    
    String Connection(String ClientID){
        

        
        System.out.println("Connection estasblishing to " + ID + "...");
                       
        System.out.println("Server -x- " + ID + ": Connection from client -x- " + ClientID);
                
        
        Date currentDateTime = new Date();
        
        return "[ " + currentDateTime + "] Server " + ID + " : Connection Succeded";
    
}
}
