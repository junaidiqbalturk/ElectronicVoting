/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.innovatraasolutions.eev.dal;
import com.innovatraasolutions.eev.bo.Parties;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
/**
 *
 * @author SuperMan
 */
public class AddPartyDAL {
    
    /**
     *
     * @param parties
     * @return
     */
    public Boolean verifyAddParty(Parties parties){
        
          FileWriter AddPartyWriter = null;
          
        
        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter("parties.txt",true));
            PrintWriter Writer = new PrintWriter(writer);
            
            Writer.println(parties.getNameOfParty());
            
            Writer.println(parties.getHeadOfParty());
            
            Writer.println(parties.getElectoralSymbol());
            
            Writer.close();
        }catch(Exception Ex){
                System.err.println("Exception occured: VerifyAddPartyDAL::verifyAddParty!");
           }
           return true; 
    }
}
