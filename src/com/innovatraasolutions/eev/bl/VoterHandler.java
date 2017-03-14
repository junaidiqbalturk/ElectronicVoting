/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.innovatraasolutions.eev.bl;

import com.innovatraasolutions.eev.bo.Voters;
import com.innovatraasolutions.eev.dal.VoterDAO;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author SuperMan
 */
public class VoterHandler {

    /**
     *
     * @param voter
     * @return
     */
    public List<Voters> verifyVoter(Voters voter) throws SQLException{
        VoterDAO voterDAO = new VoterDAO();
        //call VoterDAO function 
        return voterDAO.verifyVoter(voter);
    }
 
}
