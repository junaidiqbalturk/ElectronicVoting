/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.innovatraasolutions.eev.bl;

import com.innovatraasolutions.eev.bo.Candidate;
import com.innovatraasolutions.eev.dal.AddCandidateDAO;

/**
 *
 * @author SuperMan
 */
public class AddCandidateHandler {
    
    /**
     *
     * @param candidate
     * @return
     */
    public Boolean verifyAddCandidate(Candidate candidate){
        
        AddCandidateDAO CandidateDAO = new AddCandidateDAO();
        
       return CandidateDAO.verifyAddCandidate(candidate);
    }
}
