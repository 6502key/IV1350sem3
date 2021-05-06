/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.kth.IV1350.integration;

import java.util.Date;
import se.kth.IV1350.model.Payment;

/**
 *
 * @author jakobgotberg
 */
public class Accounting {
    
    private Date timeWhenSaleRegistered;
    
    /**
     * Registers the sale in the system.
     * @param anticipatedPayment 
     */
    
    public void registerSale(Payment anticipatedPayment){
        return;
    }
    
    /**
     * Sends data about the transaction to the external accounting system.
     * @param payment 
     */
    
    public void updateFinance(Payment payment){
        this.timeWhenSaleRegistered = java.util.Calendar.getInstance().getTime();
        return;
    }
    
}
