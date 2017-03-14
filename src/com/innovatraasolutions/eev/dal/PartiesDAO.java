/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.innovatraasolutions.eev.dal;
import com.innovatraasolutions.eev.bo.Parties;
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
public class PartiesDAO {
    
    /**
     *
     * @param parties
     * @return
     */
    public List<Parties> viewparties(Parties parties){
       String filename = null;
       FileReader userFileReader = null;
       FileReader userFileReader2 = null;
       Connection connection = null;
       
       List<Parties> list = new ArrayList<Parties>();
       
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
       /*-----------------DB Connectivity----------------------------------------------*/
       
       try{
           Statement statement  = connection.createStatement();
           ResultSet resultset = statement.executeQuery("select *from party");
           
           while(resultset.next()){
               Parties localparties = new Parties();
               String PartyName = resultset.getString(1).toString();
               localparties.setNameOfParty(PartyName);
               
               String HeadOfParty = resultset.getString(2).toString();
               localparties.setHeadOfParty(HeadOfParty);
               
               String ElectoralSymbol = resultset.getString(3).toString();
               localparties.setElectoralSymbol(ElectoralSymbol);
               
               list.add(localparties);
           }
           
       }catch(Exception e){
           e.printStackTrace();
       }
       return list;
       
//      try{
//           userFileReader = new FileReader("parties.txt");
//           String line = "a";
//           BufferedReader voterFileBuffReader = new BufferedReader(userFileReader);
//           
//            while((line = voterFileBuffReader.readLine()) != null){
//               // System.out.println("Yesss");
//                //filename = line + ".txt";
//                //System.out.println(filename);
//                //System.out.println("first While");
//               
//                userFileReader2 = new FileReader("parties.txt");
//                BufferedReader studFileBuffReader = new BufferedReader(userFileReader2);
//                
//                while((line = studFileBuffReader.readLine()) != null){
//                    //System.out.println("Second While");
//                    String partyName = line;
//                    parties.setNameOfParty(partyName);
//                    
//                    String HeadOfParty = studFileBuffReader.readLine();
//                    parties.setHeadOfParty(HeadOfParty);
//                    
//                    String ElectoralSymbol = studFileBuffReader.readLine();
//                    parties.setElectoralSymbol(ElectoralSymbol);
//                    
//                    list.add(parties);
//        }
//                  
//     }
            
  //}
//       catch(Exception e){
//           System.err.println("Exception::");
//       }  
       
 }
}
