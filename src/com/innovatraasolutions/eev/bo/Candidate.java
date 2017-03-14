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
public class Candidate {
    
    private String FullName;
    private String Cnic;
    private String RegistrationType;
    private String NaConstituency;
    private String PaConstituency;
    
    
    public Candidate(String FullName,String Cnic,String RegistrationType, String NaConstituency, String PaConstituency){
        this.FullName = FullName;
        this.Cnic = Cnic;
        this.RegistrationType = RegistrationType;
        this.NaConstituency = NaConstituency;
        this.PaConstituency = PaConstituency;
        
    }
    
    public void setFullName(String FullName){
        this.FullName = FullName;
        
    }
    
        public void setCnic(String Cnic){
            this.Cnic = Cnic;
        }
    
            public void setRegistrationType(String RegistrationType){
                this.RegistrationType = RegistrationType;
            }
    
                public void setNaConstituency(String NaConstituency){
                    this.NaConstituency = NaConstituency;
                }
    
                    public void setPaConstituency(String PaConstituency){
                        this.PaConstituency = PaConstituency;
                    }
    
                        public String getFullName(){
                            return FullName;
                        }
    
                            public String getCnic(){
                                return Cnic;
                            }
    
                                public String getRegistrationType(){
                                    return RegistrationType;
                                }
    
                                        public String getNaConstituency(){
                                            return NaConstituency;
                                        }
    
                                            public String getPaConstituency(){
                                                return PaConstituency;
                                            }
    
}
