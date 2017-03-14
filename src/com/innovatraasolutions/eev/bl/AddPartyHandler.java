/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.innovatraasolutions.eev.bl;

import com.innovatraasolutions.eev.bo.Parties;
import com.innovatraasolutions.eev.dal.AddPartyDAL;

/**
 *
 * @author SuperMan
 */
public class AddPartyHandler {
    
    /**
     *
     * @param parties
     * @return
     */
    public Boolean verifyAddParty(Parties parties){
        AddPartyDAL addPartyDAO = new AddPartyDAL();
        
        return addPartyDAO.verifyAddParty(parties);
    }
    
}
