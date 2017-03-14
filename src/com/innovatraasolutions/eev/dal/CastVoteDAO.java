/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.innovatraasolutions.eev.dal;

import com.innovatraasolutions.eev.bo.Voters;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;
/**
 *
 * @author SuperMan
 */
public class CastVoteDAO {
    
    /**
     *
     * @param voter
     */
    public Object[] verifyCnic(Voters voter){
         Voters votersDetails = new Voters();
         String line = new String();
         Connection connection = null;
         Object[] mainAdmin = new Object[5];
   
        
         
         try{
           String driverName = "oracle.jdbc.driver.OracleDriver";
           Class.forName(driverName);
           String serverName = "SpiderMan";
           String serverPort = "1521";
           String sid = "XE";
           String dbname = "eev";
           String url = "jdbc:oracle:thin:@" + serverName + ":" + serverPort +  "/" + sid;
           String userName = "eev";
           String password = "123";
           
           connection = DriverManager.getConnection(url, userName, password);
           
           System.out.println("Sucessfully connected to the DataBase");  
       } catch(ClassNotFoundException e){
           System.out.println("Class Not Found Exeption::Couldn't find the database driver" + e.getMessage());
       } catch(SQLException e) {
           System.out.println("Couldn't connect to the database" + e.getMessage());
       }
         
         /*--------------------------------------*/
         
         
         try{
             Statement statement = connection.createStatement();
             String query = "select vcnic,fname,lname,voteregisteredin,address from voter where vcnic=";
             String query1 = voter.getCnic();
             ResultSet resultset = statement.executeQuery(query+"'"+query1+"'");
             
             while(resultset.next()){
                 
                 String vcnic = resultset.getString(1).toString();
                 votersDetails.setCnic(vcnic);
                 
                 
                 String Fname = resultset.getString(2).toString();
                 votersDetails.setFname(Fname);
                
                 
                 String Lname = resultset.getString(3).toString();
                 votersDetails.setLname(Lname);
                 
                 
                 String VoteRegistered = resultset.getString(4).toString();
                 votersDetails.setVoteRegistered(VoteRegistered);
                 
                 
                 String Address = resultset.getString(5).toString();
                 votersDetails.setAddress(Address);
                 
                 System.out.println(votersDetails.getCnic());
                 System.out.println(votersDetails.getFname());
                 System.out.println(votersDetails.getLname());
                 System.out.println(votersDetails.getVoteRegistered());
                 System.out.println(votersDetails.getAddress());
                 //testing purpose above printing code
                 
                 mainAdmin[0] = votersDetails.getCnic();
                 mainAdmin[1] = votersDetails.getFname();
                 mainAdmin[2] = votersDetails.getLname();
                 mainAdmin[3] = votersDetails.getVoteRegistered();
                 mainAdmin[4] = votersDetails.getAddress();
             }
             resultset.close();
         }catch(Exception e){
             e.printStackTrace();
         }
         return mainAdmin;
    }
    
}
