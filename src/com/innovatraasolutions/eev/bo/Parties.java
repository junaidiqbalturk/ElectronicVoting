/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.innovatraasolutions.eev.bo;

/**
 *
 * @author SuperMan
 */
public class Parties {
    private String NameOfParty;
    private String HeadOfParty;
    private String ElectoralSymbol;
    
    public Parties(String NameOfParty){
        this.NameOfParty = NameOfParty;
        this.HeadOfParty = null;
        this.ElectoralSymbol = null;
    }
    
    public Parties(){
        this.NameOfParty  = null;
        this.HeadOfParty = null;
        this.ElectoralSymbol = null;
    }
    
    public Parties(String NameOfParty,String HeadOfParty, String ElectoralSymbol){
        this.NameOfParty = NameOfParty;
        this.HeadOfParty = HeadOfParty;
        this.ElectoralSymbol = ElectoralSymbol;
    }
    
    public void setNameOfParty(String NameOfParty){
        this.NameOfParty = NameOfParty;
    }
    
    public void setHeadOfParty(String HeadOfParty){
        this.HeadOfParty = HeadOfParty;
    }
    
    public void setElectoralSymbol(String ElectoralSymbol){
        this.ElectoralSymbol = ElectoralSymbol;
    }
    
    public String getNameOfParty(){
        return NameOfParty;
    }
    
    public String getHeadOfParty(){
        return HeadOfParty;
    }
    
    public String getElectoralSymbol(){
        return ElectoralSymbol;
    }
}