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
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;
/**
 *
 * @author SuperMan
 */
public class VoterDAO {
    
    /**
     *
     * @param voter
     * @return
     */
    public List<Voters> verifyVoter(Voters voter){
       String filename = null;
       FileReader userFileReader = null;
       FileReader userFileReader2 = null;
       Connection connection = null;
       
       List<Voters> list = new ArrayList<Voters>();
       
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

       /*---------------------------------------------------*/
        //for reterieving Data from DataBase
       try{
           Statement statement = connection.createStatement();
           ResultSet resultSet  = statement.executeQuery("select *from Voter");
           
           while(resultSet.next()){
               Voters localVoter = new Voters();
               String vcnic = resultSet.getString(1);
               localVoter.setCnic(vcnic);
               
               String Fname = resultSet.getString(2).toString();
               localVoter.setFname(Fname);
               
               String Lname = resultSet.getString(3).toString();
               localVoter.setLname(Lname);
               
               String VoteRegisteredIn = resultSet.getString(4).toString();
               localVoter.setVoteRegistered(VoteRegisteredIn);
               
               String Address = resultSet.getString(5).toString();
               localVoter.setAddress(Address);
                 
               list.add(localVoter);
           }
           resultSet.close();
           
       }catch(Exception e){
           e.printStackTrace();
       }
       return list; 
       
   /*   try{
           userFileReader = new FileReader("voters.txt");
           String line = "a";
           BufferedReader voterFileBuffReader = new BufferedReader(userFileReader);
           
            while((line = voterFileBuffReader.readLine()) != null){
               // System.out.println("Yesss");
                //filename = line + ".txt";
                //System.out.println(filename);
                //System.out.println("first While");
               
                userFileReader2 = new FileReader("voters.txt");
                BufferedReader studFileBuffReader = new BufferedReader(userFileReader2);
                
                while((line = studFileBuffReader.readLine()) != null){
                    //System.out.println("Second While");
                    String Cnic = line;
                    voter.setCnic(Cnic);
                    
                    String Fname = studFileBuffReader.readLine();
                    voter.setFname(Fname);
                    
                    String Lname = studFileBuffReader.readLine();
                    voter.setLname(Lname);
                    
                    String VoteRegistered = studFileBuffReader.readLine();
                    voter.setVoteRegistered(VoteRegistered);
                    
                    String Address = studFileBuffReader.readLine();
                    voter.setAddress(Address);
                    
                    list.add(voter);
                    
                    
        }
                  
     }
            
  }*/
      /* catch(Exception e){
           System.err.println("Exception::");
       } */ 
       
 }
    
}
       
