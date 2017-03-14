/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.innovatraasolutions.eev.bl;

import com.innovatraasolutions.eev.bo.Parties;
import com.innovatraasolutions.eev.dal.PartiesDAO;
import java.util.List;

/**
 *
 * @author SuperMan
 */
public class PartiesHandler {
    
    /**
     *
     * @param parties
     * @return
     */
    public List<Parties> viewparties(Parties parties){
        PartiesDAO partiesDAO = new PartiesDAO();
        
        return partiesDAO.viewparties(parties);
    }
}
