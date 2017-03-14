/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.innovatraasolutions.eev.dal;

import com.innovatraasolutions.eev.bo.Candidate;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;

/**
 *
 * @author SuperMan
 */
public class AddCandidateDAO {
    
    /**
     *
     * @param candidate
     * @return
     */
    public Boolean verifyAddCandidate(Candidate candidate){
        
        FileWriter AddCandidateWriter = null;
        
        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter("Candidates.txt",true));
            PrintWriter Writer = new PrintWriter(writer);
            
            Writer.println(candidate.getFullName());
            
            Writer.println(candidate.getCnic());
            
            Writer.println(candidate.getRegistrationType());
            
            Writer.println(candidate.getNaConstituency());
            
            Writer.println(candidate.getPaConstituency());
            
            Writer.println("\n");
            
            Writer.close();
        }catch(Exception Ex){
                System.err.println("Exception occured: VerifyAddCandidateDAL::verifyAddCandidate!");
           }
        
        
        return true;
    }
    
}
