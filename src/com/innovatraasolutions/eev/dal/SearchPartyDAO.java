/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor
 */
package com.innovatraasolutions.eev.dal;
import java.util.*;

import com.innovatraasolutions.eev.bo.Parties;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.*;

/**
 *
 * @author SuperMan
 */
public class SearchPartyDAO {

    /**
     *
     * @param parties
     * @return Parties
     */
    public Parties verifySearch(Parties parties){
        
        List<Parties> list = new ArrayList<Parties>();
        Parties searchParty =new Parties();
        Connection connection = null;
        Parties MainParty = new Parties();
        
        
        
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
        
        try{
            Statement statement = connection.createStatement();
            String query = "select nameofparty,headofparty,electoralsymbol from party where nameofparty=";
            String query1 = parties.getNameOfParty();
            
            
            ResultSet resultset = statement.executeQuery(query+"'"+query1+"'");
            
            while(resultset.next()){
                Parties localparty = new Parties();
                String NameOfParty = resultset.getString(1).toString();
                localparty.setNameOfParty(NameOfParty);
                
                String HeadOfParty = resultset.getString(2).toString();
                localparty.setHeadOfParty(HeadOfParty);
                
                String ElectoralSymbol = resultset.getString(3).toString();
                localparty.setElectoralSymbol(ElectoralSymbol);
               
                MainParty = localparty;
            }
            resultset.close();
            
            
        }catch(Exception e ){
            e.printStackTrace();
        }
        return MainParty;

        
//        try{
//             BufferedReader reader = new BufferedReader(new FileReader("parties.txt"));
//            String line;
//            int linecount = 0;
//            
//            while((line = reader.readLine())!=null){
//                linecount++;
//                
//                if(line.equals(parties.getNameOfParty())){
//                    searchParty.setNameOfParty(line);
//                    
//                    String HeadOfParty = reader.readLine();
//                    searchParty.setHeadOfParty(HeadOfParty);
//            
//                    String ElectoralSymbol = reader.readLine();
//                    searchParty.setElectoralSymbol(ElectoralSymbol);  
//                }
//                list.add(searchParty);
//            } 
//        }catch(Exception ex){
//            System.err.println("Error in SearchPartyDAL!!!");
//        }
        
    }
}
