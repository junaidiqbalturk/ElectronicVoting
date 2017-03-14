/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.innovatraasolutions.eev.dal;
import com.innovatraasolutions.eev.bo.Parties;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.FileReader;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;

/**
 *
 * @author SuperMan
 */
public class DltPartyDAL {
    
    /**
     *
     * @param parties
     * @return
     */
    public Boolean verifyDltParty(Parties parties){
        Connection connection = null;
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
           
           //System.out.println("Sucessfully connected to the DataBase");  
       } catch(ClassNotFoundException e){
           System.out.println("Class Not Found Exeption::Couldn't find the database driver" + e.getMessage());
       } catch(SQLException e) {
           System.out.println("Couldn't connect to the database" + e.getMessage());
       }
       
       /*-----------------------DbConnectivity--------------------------------------------*/
       
       try{
           Statement statement = connection.createStatement();
           String query = "Delete from Party where nameofparty=";
           String query1  = parties.getNameOfParty();
           
           ResultSet resultset = statement.executeQuery(query+"'"+query1+"'");
           
       }catch(Exception e){
           e.printStackTrace();
       }
       return true;
        
        
        
//       try{
//       BufferedReader reader = new BufferedReader(new FileReader("parties.txt"));
//       BufferedWriter writer = new BufferedWriter(new FileWriter("temp.txt"));
//       PrintWriter Writer = new PrintWriter(writer);
//       int linecount = 0;
//       String line;
//       
//        while((line = reader.readLine())!=null){
//            linecount++;
//
//            if(line.equals(parties.getNameOfParty()))
//            {
//                System.out.println("Found!!!"+line);
//                
//            }
//            else
//            {
//                System.out.println("Not Found"+line);
//               
//            }
//         }
//     }
//       catch(Exception ex){
//           System.err.println("Error!!!");
//       } 
   }
}
