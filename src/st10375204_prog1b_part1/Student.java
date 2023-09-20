/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package st10375204_prog1b_part1;

import java.util.ArrayList;
import java.util.Scanner;
import static javafx.scene.input.KeyCode.O;

/**
 *
 * @author deves
 */
public class Student {
    private ArrayList<Integer>studentID=new ArrayList<>();
    private ArrayList<String>studentName=new ArrayList<>();
    private ArrayList<Integer>studentAge=new ArrayList<>();
    private ArrayList<String>studentEmail=new ArrayList<>();
    private ArrayList<String>studentCourse=new ArrayList<>();
    Scanner kb=new Scanner(System.in); 
      
    public void verify(){
        String ID;
        System.out.println("Enter students ID");
        ID=kb.next();
        //this method gathers all user data, makes sure its all of the
        //correct datatype/ranges and then passes it to the save student method
        while (true){  
            try{
                if(Integer.parseInt(ID)>-1){
                   break;  
                }//id  verification
            }catch(NumberFormatException e){System.out.println("Invalid ID,"
                    + " try again>>");ID=kb.next();}
        }//while
        
        System.out.println("Enter sutdents name");
        String name=kb.next();
             
        boolean controller=false;
        System.out.println("Enter age");
        String age="";
        while(controller==false){
            age=kb.next();
            controller= illegalAge(age);
        }//age verification
        
        System.out.println("Enter students mail");
        String mail=kb.next();
        
        System.out.println("Enter students course");
        String course=kb.next();
        
        saveStudent(Integer.parseInt(ID), name, Integer.parseInt(age), mail, course);
  
    }//meth end
    
    public boolean illegalAge(String age){
        try{
            int AGE=Integer.parseInt(age);
            if(validAge(age)==true){
                return true;
            }
        }catch(NumberFormatException e){System.out.println("You have entered an inva"
                + "lid age, try again>>>");}
        
    return false;}
    
    public boolean validAge(String age){
        if(Integer.parseInt(age)>=16){
            return true;
        }
        System.out.println("You have entered an invalid age, try again>>>");
    return false;}
    
    public void saveStudent(int id,String name,int age,String mail,String course){
        boolean found=false;
        //check if ID is used else where, ID must be unique
        for (int i = 0; i < studentID.size(); i++) {
            if (id==studentID.get(i)) {
                System.out.println("The ID is already taken, please use a new ID for this student\n"
                        + "Alternatively use the search function to view the students reco"
                        + "rds asscociataed with the ID");
                found=true;
            }//if
        }//for
        if (found==false){
             System.out.println("CAPTURED A NEW STUDENT\n****************");
             studentID.add(id);
             studentName.add(name);
             studentAge.add(age);
             studentEmail.add(mail);
             studentCourse.add(course);
             System.out.println("STUDENT ID: "+id+"\nSTUDENT NAME: "+name
            +"\nSTUDENT AGE: "+age+"\nSTUDENT EMAIL: "+mail+"\nSTUDENT COURSE: "+course);     
             System.out.println("****************");
        }

    }//meth 
    
    public String deleteStudent(int id){
        boolean found=false;
        for (int i = 0; i < studentID.size(); i++) {//loop through for match
            if (id==studentID.get(i)) {//if found, ask the user to confirm              
                System.out.println("Enter yes (y) to confirm");
                String temp=kb.next();
                if ("y".equals(temp)) {
                     studentID.remove(i);
                     studentName.remove(i);
                     studentAge.remove(i);
                     studentEmail.remove(i);
                     studentCourse.remove(i);
                     found=true;
                     return "Student with ID "+id+" WAS deleted!";
                }else{return "Action was cancelled by user";}
            }//outer if
        }//for      
        return "Student with ID "+id+" was not found";
    }//meth
    
    public String studentReport(){
        String output="";
           
        for (int i = 0; i < studentID.size(); i++) {
            output=output+"STUDENT "+(i+1)+"\n-------------------\n"
                    +"STUDENT ID: "+studentID.get(i)+
                    "\nSTUDENT NAME: "+studentName.get(i)+"\nSTUDENT AGE: "+
                    studentAge.get(i)+"\nSTUDENT EMAIL: "+studentEmail.get(i)
                    +"\nSTUDENT COURSE: "+studentCourse.get(i)+"\n-------------------\n";
        }
        return output;
    }//meth
    
    public String searchStudent(int id){
            for (int i = 0; i < studentID.size(); i++) {
                if (id==studentID.get(i)) {
                    return "STUDENT ID: "+studentID.get(i)+
                    "\nSTUDENT NAME: "+studentName.get(i)+"\nSTUDENT AGE: "+
                    studentAge.get(i)+"\nSTUDENT EMAIL: "+studentEmail.get(i)
                    +"\nSTUDENT COURSE: "+studentCourse.get(i);
                }
        }
        return "Student with ID: "+id+" not found";
    }//meth
    
    public boolean exitApplication(){
        System.out.println("The application is now closing\n"
                + "---------------"); 
    return false;}
    
}//class
