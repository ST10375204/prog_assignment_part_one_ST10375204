/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tht_q2;

/**
 *
 * @author deves
 */
public class EstateAgentSales extends EstateAgent {
     public EstateAgentSales(String agentName, double propertyPrice) {
        super(agentName, propertyPrice);
    }

    public void printPropertyReport() {
        System.out.println("ESTATE AGENT REPORT"+"\n"+
                "estate agent: " + getAgentName()+"\n"+
                "property price: R" + getPropertyPrice()+"\n"+
                "commission: R" + getAgentCommission());
        //report output
    }
}
