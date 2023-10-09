/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tht_q1;

/**
 *
 * @author deves
 */
public class THT_Q1 {

    /**
     * @param args the command line arguments
     */
    public static double[][] values = {
            {10500, 8500},
            {9500, 7200},
            {12000, 8000}}; //declared 2d array
    public static String [] brands={"CANON","SONY","NIKON"};
    //used by all methods hence declared globally
    
    public static void main(String[] args) {
        System.out.println("-------------------------------"
                + "\nCAMERA TECHNOLOGY REPORT\n-------------------------------");
        displayDetails();   
        System.out.println("-------------------------------"
                + "\nCAMERA TECHNOLOGY RESULTS\n-------------------------------");
        biggestDiff();
        System.out.println("-------------------------------");
    }//main method end
    
    public static void displayDetails(){         
      //DISPLAY DETAILS
        System.out.println("\tMIRRORLESS\tDSLR");
        for (int i = 0; i < 3; i++) {
            System.out.print(brands[i]);
            for (int j = 0; j < 2; j++) {
                System.out.print("\t"+"R "+values[i][j]);}
            System.out.print("\n");}
    }//diplay end
    public static void biggestDiff(){
        double[] diffs = new double[3]; // Initialize array with size 3
        int posBigDiff = 0;
        
        for (int i = 0; i < 3; i++) {
            for (int j = -1; j < 0; j++) {               
                diffs[i]=values[i][j+1]-values[i][j+2];}}//populate array        
        double temp=diffs[0];
        for (int i = 0; i < 3; i++) {           
            if(temp<diffs[i]){
            temp=diffs[i];
            posBigDiff=i;}}//position of biggest difference in array     
        //display
        for (int i = 0; i < 3; i++) {
            if(i==posBigDiff){System.out.println(brands[i]+"\tR"+diffs[i]+"***");
            }else{System.out.println(brands[i]+"\tR"+diffs[i]);}}
        System.out.println("\nCAMERA WITH THE MOST COST DIFFERENCE: "
                +brands[posBigDiff] ); 
    }//method
}//end of proj
