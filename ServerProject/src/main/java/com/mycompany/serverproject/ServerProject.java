/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.serverproject;

/**
 *
 * @author W1805896
 */
public class ServerProject {
    
    DummyServer server = new DummyServer();
    
    String ClientID = "Client666";

  
    public static void main(String[] args) {

        ServerProject test = new ServerProject();
        
        test.execute();
    }
    
    private void execute(){
        
      var connectionResult= server.Connection(ClientID);
        
        System.out.println(connectionResult);
            }
           
}

