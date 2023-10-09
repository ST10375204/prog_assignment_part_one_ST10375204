/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tht_q2;

import java.util.Scanner;

/**
 *
 * @author deves
 */
public class THT_Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //inputs
        Scanner kb=new Scanner(System.in);
        System.out.println("ENTER AGENT NAME: ");       
        String agentName = kb.nextLine();
        System.out.println("ENTER PROPERTY PRICE");
        double propertyPrice=kb.nextDouble();

        // create an instance of EstateAgentSales
        EstateAgentSales estateAgentSales = new EstateAgentSales(agentName, propertyPrice);

        //diplay
        estateAgentSales.printPropertyReport();
        }
    }
    

