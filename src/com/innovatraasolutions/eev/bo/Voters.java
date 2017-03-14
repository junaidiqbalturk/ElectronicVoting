/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.innovatraasolutions.eev.bo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SuperMan
 */
public class Voters {
     private String cnic;
    private String Fname;
    private String Lname;
    private String VoteRegistered;
    private String Address;
    List<Voters> Details;
    
    
    public Voters(){
        this.cnic = null;
        this.Fname = null;
        this.Lname = null;
        this.VoteRegistered = null;
        this.Address = null;
        
    }
    
    public Voters(String cnic){
        this.cnic = cnic;
        this.Fname = null;
        this.Lname = null;
        this.VoteRegistered = null;
        this.Address = null;
    }
    
    public Voters(String cnic,String Fname, String Lname,String VoteRegistered,String Address){
        this.cnic =  cnic;
        this.Fname = Fname;
        this.Lname = Lname;
        this.VoteRegistered = VoteRegistered;
        this.Address = Address;
    }
    
    public void setCnic(String cnic){
        this.cnic = cnic;
    }
    
    public void setFname(String Fname){
        this.Fname = Fname;
    }
    
    public void setLname(String Lname){
        this.Lname = Lname;
    }
    
    public void setVoteRegistered(String VoteRegistered){
        this.VoteRegistered = VoteRegistered;
        
    }
    
    public void setAddress(String Address){
        this.Address = Address;
    }
    
    public String getCnic(){
        return cnic;
    }
    
    public String getFname(){
        return Fname;
    }
    
    public String getLname(){
        return Lname;
    }
    
    public String getVoteRegistered(){
        return VoteRegistered;
    }
    
    public String getAddress(){
        return Address;
    }
     
    public void setDetails(List<Voters> details){
        this.Details = details;
    }
    
    public List<Voters>getDetails(){
        return Details;
    }

}
