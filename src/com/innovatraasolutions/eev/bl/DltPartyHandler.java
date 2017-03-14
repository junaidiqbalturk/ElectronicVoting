/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.innovatraasolutions.eev.bl;

import com.innovatraasolutions.eev.bo.Parties;
import com.innovatraasolutions.eev.dal.DltPartyDAL;

/**
 *
 * @author SuperMan
 */
public class DltPartyHandler {
    
    /**
     *
     * @param parties
     * @return
     */
    public Boolean verifyDltParty(Parties parties){
        DltPartyDAL dltPartyDAO = new DltPartyDAL();
       return dltPartyDAO.verifyDltParty(parties);
    }
}
