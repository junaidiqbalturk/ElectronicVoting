/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.innovatraasolutions.eev.bl;

import com.innovatraasolutions.eev.bo.Parties;
import com.innovatraasolutions.eev.dal.SearchPartyDAO;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author SuperMan
 */
public class SearchPartyHandler {
    
    /**
     *
     * @param parties
     * @return Parties
     */
    public Parties verifySearch(Parties parties){
        SearchPartyDAO searchPartyDAO = new SearchPartyDAO();
       return searchPartyDAO.verifySearch(parties);
        
     }
}
