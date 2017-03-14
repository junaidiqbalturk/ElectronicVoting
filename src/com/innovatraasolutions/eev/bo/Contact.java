/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.innovatraasolutions.eev.bo;

/**
 *
 * @author SpiderMan
 */
public class Contact {
    private String fullName;
    private String phoneNumber;
    private String address;
    
    public Contact(String fullName,String phoneNumber,String address){
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.address = address;
        
    }
    public String getAddress(){
        return address;
        
    }
    
    public String fullName(){
        return fullName;
    }
    
    public String phoneNumber(){
        return phoneNumber;
    }
    
    public void setAddress(String address){
        this.address = address;
    }
    
    public void setFullName(String fullName){
        this.fullName = fullName;
    }
    
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    
}
