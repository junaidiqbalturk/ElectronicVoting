/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.innovatraasolutions.eev.bl;

import com.innovatraasolutions.eev.bo.Parties;
import com.innovatraasolutions.eev.bo.User;
//import com.innovatraasolutions.eev.bo.UserSearch;
import com.innovatraasolutions.eev.bo.Voters;
import com.innovatraasolutions.eev.dal.LoginDAO;

/**
 *
 * @author SpiderMan
 */
public class LoginHandler {
    
    /**
     *
     * @param user
     */
    public void verifyLogin(User user){
       //In this layer, the layer will  call the next layer i.e DAL Layer
       //LoginDAL:: verifyLogin()
       LoginDAO loginDAO = new LoginDAO();
       loginDAO.verifyLogin(user);  
    }
   
}
