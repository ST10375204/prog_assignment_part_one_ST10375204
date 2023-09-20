/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package st10375204_prog1b_part1;

import java.util.Scanner;

/**
 *
 * @author deves
 */
public class ST10375204_PROG1B_PART1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Student st=new Student();
        Scanner kb=new Scanner(System.in);
        
        boolean controller=true;
        System.out.println("STUDENT MANAGEMENT APPLICATION\n******************");
        System.out.println("Enter 1 to launch menu or any other key to exit");
        if (kb.next().matches("1") ){
            while(controller==true){
                display();
                String choice=kb.next();
                switch(choice){
                    case "1":
                        st.verify();
                        System.out.println("Enter 1 to launch menu or any other key to exit");
                        if (kb.next().matches("1") ){
                        }else{controller=st.exitApplication();}
                        break;
                    case "2":
                        System.out.println("Enter the Student ID to search");
                        System.out.println(st.searchStudent(kb.nextInt()));
                        System.out.println("Enter 1 to launch menu or any other key to exit");
                        if (kb.next().matches("1")){
                        }else{controller=st.exitApplication();}
                        break;    
                    case "3":
                        System.out.println("Enter ID to delete");
                        System.out.println(st.deleteStudent(kb.nextInt()));
                        System.out.println("Enter 1 to launch menu or any other key to exit");
                        if (kb.next().matches("1") ){
                        }else{controller=st.exitApplication();}
                        break; 
                    case "4":
                        System.out.println(st.studentReport());
                        System.out.println("Enter 1 to launch menu or any other key to exit");
                        if (kb.next().matches("1") ){
                        }else{controller=st.exitApplication();}
                       break;
                    case "5":
                        controller=st.exitApplication();
                        break;
                    default:System.out.println("Invalid choice");break;
            }//switch        
        }//while
            
           }else{controller=st.exitApplication();}
 
        
    }//main
    public static void display(){
        System.out.println("Please select one of the following: \n"
                + "(1) Capture a new student\n"
                + "(2) Search for a student\n"
                + "(3) Delete a student\n"
                + "(4) Print Student Report\n"
                + "(5) Exit the Application");
    }
    
}
