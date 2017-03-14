/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.innovatraasolutions.eev.bo;

import java.util.List;

/**
 *
 * @author SpiderMan
 */
public class User {
    
    private String username;
    private String password;
    private String name;
    private List<Contact> contacts;
    
    public User(String username,String password,String name){
        this.username = username;
        this.password = password;
        this.name = name;
    }
   
    //getter for USername
    public String getUsername(){
      return username;  
    }
    
    //getter for password
    public String getPassword(){
        return password;
    }
    
    //Setter for USername
    public void setUsername(String username){
        this.username = username;
    }
    
    //Setter for Password
    public void setPassword(String password){
        this.password = password;
    }
    
    //getter for USer
    public String getName(){
        return name;
    }
    
    //setter for User
    public void setName(String name){
        this.name = name;
    }
    
    public void setContacts(List<Contact> contacts){
        this.contacts=contacts;
    }
    
}
