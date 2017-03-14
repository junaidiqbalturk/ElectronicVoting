/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.innovatraasolutions.eev.controller;

import com.innovatraasolutions.eev.bl.AddCandidateHandler;
import com.innovatraasolutions.eev.bl.AddPartyHandler;
import com.innovatraasolutions.eev.bl.CastVoteHandler;
import com.innovatraasolutions.eev.bl.LoginHandler;
import com.innovatraasolutions.eev.bl.PartiesHandler;
import com.innovatraasolutions.eev.bl.VoterHandler;
import com.innovatraasolutions.eev.bo.Parties;
import com.innovatraasolutions.eev.bo.User;
import com.innovatraasolutions.eev.bo.Voters;
import com.innovatraasolutions.eev.constants.Constants;
import com.innovatraasolutions.eev.bl.DltPartyHandler;
import com.innovatraasolutions.eev.bl.SearchPartyHandler;
import com.innovatraasolutions.eev.bo.Candidate;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author SpiderMan
 */
public class Controller {           //COntroller class objective is to call suitable Handler for process
    
    /**
     *
     * @param action
     * @param parameters
     * @return
     */
        
  public  Object[] processRequest(int action,Object[] parameters) throws SQLException{
       Object[] returnobj = null;
       
       
       switch(action){
           case Constants.LoginAction: returnobj = verifyLogin(parameters); break; //parameters will be from Login Form
           case Constants.viewVoter: returnobj = verifyVoter(parameters); break;//VerifyVoter to print all Voter information
           case Constants.ViewAllParty: returnobj = viewParties(parameters); break;
           case Constants.CastVote: returnobj = verifyCnic(parameters); break; //Verify Vote func for casting Vote
           case Constants.AddParty: returnobj = verifyAddParty(parameters); break; 
           case Constants.DeleteParty: returnobj = verifyDltParty(parameters); break;
           case Constants.SearchParty: returnobj = verifySearch(parameters); break;
           case Constants.AddCandidate: returnobj = verifyAddCandidate(parameters); break;
       }
       
       return returnobj;
       
    }
    
   Object[] verifyLogin(Object[] parameters){           //verifying Login credentials
        Object[] returnobj = null;
        String username = (String)parameters[0];
       String password = new String((char[])parameters[1]);
        User user = new User(username,password,"");
        
        LoginHandler loginHandler = new LoginHandler();
        loginHandler.verifyLogin(user);
        
        if(user.getName() != null && !user.getName().equals("")){       //verfication sucessCase
            returnobj = new Object[1];
            returnobj[0] = user;
            /*POlyMorphmism here Base class -> Object  and copying
            the reference of User class Object which actually the child class*/
            
        }
        return returnobj;
    }
   
    
    
    Object[] verifyVoter(Object[] parameters) throws SQLException{
        Object[] returnObj = null;
          
          Voters voter = new Voters();
          VoterHandler voterHandler = new VoterHandler();
          
           List<Voters> list = voterHandler.verifyVoter(voter);
           returnObj = new Object[list.size()];
            for(int i=0;i<list.size();i++){
                returnObj[i]=list.get(i);
            }
             return returnObj;
    }
    
    Object[] viewParties(Object[] parameters){
        Object[] returnObj = null;
        
        Parties parties = new Parties();
        PartiesHandler partiesHandler = new PartiesHandler();
        
        List<Parties> list = partiesHandler.viewparties(parties);
        returnObj = new Object[list.size()];
        
        for(int i=0;i<list.size();i++){
            returnObj[i] = list.get(i);
        }
        return returnObj;
    }
    
        Object[] verifyAddParty(Object[] parameters){
            Object[] returnObj = null;
            
            String NameOfParty = (String)parameters[0];
            String HeadOfParty = (String)parameters[1];
            String ElectoralSymbol = (String)parameters[2];
            
            Parties parties = new Parties(NameOfParty,HeadOfParty,ElectoralSymbol);
            
            AddPartyHandler addpartyHandler = new AddPartyHandler();
            addpartyHandler.verifyAddParty(parties);
            return returnObj;
        }
            
            Object[] verifyDltParty(Object[] parameters){
                
                Object[] returnObj = null;
                
                String NameOfParty = (String)parameters[0];
                
                Parties parties = new Parties(NameOfParty);
                
                DltPartyHandler deletepartyHandler = new DltPartyHandler();
                deletepartyHandler.verifyDltParty(parties);
                return returnObj;
            }
            
                Object[] verifySearch(Object[] parameters){
                    Object[] returnObj = null;
                    String NameOfParty = (String)parameters[0];
                    
                    Parties parties = new Parties(NameOfParty);
                    SearchPartyHandler searchpartyHandler = new SearchPartyHandler();
                    searchpartyHandler.verifySearch(parties);
                    return returnObj;
                }
                
                /* CastVote Controller*/
       //Begin
                    Object[] verifyCnic(Object[] parameters){
                        Object[] returnobj = new Object[5];
                        
                        String cnic = (String)parameters[0];
                        Voters voter = new Voters(cnic);
                        
                        CastVoteHandler castvoteHandler = new CastVoteHandler();
                        castvoteHandler.verifyCnic(voter);
                        return returnobj;
                    }
                    //End>>>
                        
                       Object[] verifyAddCandidate(Object[] parameters){
                           Object[] returnObj = null;
                           
                           String FullName = (String)parameters[0];
                           String Cnic = (String)parameters[1];
                           String RegistrationType = (String)parameters[2];
                           String NaConstituency = (String)parameters[3];
                           String PaConstituency = (String)parameters[4];
                           
                           Candidate candidate = new Candidate(FullName,Cnic,RegistrationType,NaConstituency,PaConstituency);
                           
                           AddCandidateHandler CandidateHandler = new AddCandidateHandler();
                           CandidateHandler.verifyAddCandidate(candidate);
                           return returnObj;
                       }
}


    
