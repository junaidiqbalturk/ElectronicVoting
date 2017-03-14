/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.innovatraasolutions.eev.bl;

import com.innovatraasolutions.eev.bo.Voters;
import com.innovatraasolutions.eev.dal.CastVoteDAO;

/**
 *
 * @author SuperMan
 */
public class CastVoteHandler {
    
    /**
     *
     * @param voter
     */
    public Object[] verifyCnic(Voters voter){
        CastVoteDAO castvoteDAO = new CastVoteDAO();
        Object[] obj = castvoteDAO.verifyCnic(voter);
       return obj;
    }
    
}
