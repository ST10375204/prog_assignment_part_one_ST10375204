/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package st10375204_prog1b_part1;

import com.sun.xml.internal.messaging.saaj.util.ByteInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;
import javax.swing.text.html.HTML;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author deves
 */
public class StudentIT {
    
    public StudentIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of saveStudent method, of class Student.
     */
    @Test
    public void testSaveStudent() {
        System.out.println("saveStudent");
        int id = 0;
        String name = "Ben";
        int age = 18;
        String mail = "benDoan@gmail.com";
        String course = "wert67";
        Student instance = new Student();
        instance.saveStudent(id, name, age, mail, course);
    }

    /**
     * Test of deleteStudent method, of class Student.
     */
    @Test
    public void testDeleteStudent_StudentNotFound() {
        System.out.println("deleteStudent");
        int id = 0;
        Student instance = new Student();
        String expResult = "Student with ID 0 was not found";
        String result = instance.deleteStudent(id);
        assertEquals(expResult, result);

    }


        @Test
    public void testDeleteStudent() {
        System.out.println("deleteStudent");
        int id = 0;
        
        Student instance = new Student();
        
        instance.saveStudent(0,"ben tennyson",19,"10Bn@gmail.com","omni1223");
        
        String expResult = "Student with ID 0 WAS deleted!";
        String result = instance.deleteStudent(id);
        Scanner scanner=new Scanner("y");
            System.out.println("REsult: "+result);
        assertEquals(expResult, result.toString());

    }


    /**
     * Test of studentReport method, of class Student.
     */
    @Test
    public void testStudentReport() {
        System.out.println("studentReport");
        Student instance = new Student();
        instance.saveStudent(0,"ben tennyson",19,"10Bn@gmail.com","omni1223");
        String expResult ="STUDENT 1\n" +
            "-------------------\n" +
            "STUDENT ID: 0\n" +
            "STUDENT NAME: ben tennyson\n" +
            "STUDENT AGE: 19\n" +
            "STUDENT EMAIL: 10Bn@gmail.com\n" +
            "STUDENT COURSE: omni1223\n" +
            "-------------------\n";
        String result = instance.studentReport();
        System.out.println(result);
        assertEquals(expResult, result);
    }

    /**
     * Test of searchStudent method, of class Student.
     */
    @Test
    public void testSearchStudent() {
        System.out.println("searchStudent");
        int id = 0;
        Student instance = new Student();
        instance.saveStudent(0,"ben tennyson",19,"10Bn@gmail.com","omni1223");
        String expResult = "STUDENT ID: 0\n" +
                            "STUDENT NAME: ben tennyson\n" +
                            "STUDENT AGE: 19\n" +
                            "STUDENT EMAIL: 10Bn@gmail.com\n" +
                            "STUDENT COURSE: omni1223";
        String result = instance.searchStudent(id);
        assertEquals(expResult, result);
    }
    public void testSearchStudent_notFound() {
        System.out.println("searchStudent");
        int id = 1;
        Student instance = new Student();
        instance.saveStudent(0,"ben tennyson",19,"10Bn@gmail.com","omni1223");
        String expResult = "Student with ID 1 not found";
        String result = instance.searchStudent(id);
        assertEquals(expResult, result); 
}
    /**
     * Test of exitApplication method, of class Student.
     */
    @Test
    public void testExitApplication() {
        System.out.println("exitApplication");
        Student instance = new Student();
        boolean expResult = false;
        boolean result = instance.exitApplication();
        assertEquals(expResult, result);
    }
    @Test
    public void testStudentAge_StudentAgeValid(){
       Student instance = new Student();
       String age="17";
      
       boolean expResult=true;
       boolean result= instance.validAge(age);
       assertEquals(expResult,result);
    }
    @Test
    public void testStudentAge_StudentAgeInvalid(){
       Student instance = new Student();
       String age="12";
      
       boolean expResult=false;
       boolean result= instance.validAge(age);
       assertEquals(expResult,result);
    }
        @Test
    public void testStudentAge_StudentAgeInvalidCharacter(){
       Student instance = new Student();
       String age="17w";
      
       boolean expResult=false;
       boolean result= instance.illegalAge(age);
       assertEquals(expResult,result);
    }
}
