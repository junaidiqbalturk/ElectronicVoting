/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.innovatraasolutions.eev.dal;
import com.innovatraasolutions.eev.bo.Contact;
import com.innovatraasolutions.eev.bo.Parties;
import com.innovatraasolutions.eev.ui.ManageParties;

import com.innovatraasolutions.eev.bo.User;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;
import com.innovatraasolutions.eev.ui.ManageParties;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.OutputStream;





/**
 *
 * @author SpiderMan
 */
public class LoginDAO {

    /**
     *
     * @param user
     */
    public void verifyLogin(User user){
       //read user's file which contain username and password
         FileReader userFileReader = null;
        try {
            userFileReader = new FileReader("users.txt");
            BufferedReader userFileBuffReader = new BufferedReader(userFileReader);
            Integer userCount = Integer.parseInt(userFileBuffReader.readLine());
            for(int i=0; i<userCount; i++){
                String uname = userFileBuffReader.readLine();
                String pwd = userFileBuffReader.readLine();
                String name = userFileBuffReader.readLine();
                if(uname.equals(user.getUsername()) && pwd.equals(user.getPassword()))
                {
                    user.setName(name);
                    FileReader contactsFileReader = new FileReader(uname + ".txt");
                    List<Contact> contacts = new ArrayList<Contact>();
                    BufferedReader contactsFileBuffReader = new BufferedReader(contactsFileReader);
                    Integer contactCount = Integer.parseInt(contactsFileBuffReader.readLine());
                    for(int j=0; j<contactCount; j++){
                        String fullName = contactsFileBuffReader.readLine();
                        String phoneNumber = contactsFileBuffReader.readLine();
                        String address = contactsFileBuffReader.readLine();
                        Contact contact = new Contact(fullName, phoneNumber, address);
                        contacts.add(contact);
                    }
                    user.setContacts(contacts);
                    break;
                }
            }
            
        } catch (FileNotFoundException ex) {
            System.err.println("File not found!");
           // ex.printStackTrace();
        } 
        catch (Exception ex) {
            System.err.println("Exception occured: LoginDAL::verifyLogin !");
            //ex.printStackTrace();
        }
       
    }
    
  
       
        
}
