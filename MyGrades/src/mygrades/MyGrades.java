/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mygrades;

/**
 *
 * @author dsilva
 */
import java.util.Scanner;

public class MyGrades {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);  
         
       System.out.print("Enter your first name: ");  
       String fname1=sc.next();  
       System.out.print("Enter your last name: ");  
       String lname1=sc.next();  
       System.out.print("Enter first exam score: ");  
       //double exam1_1=sc.nextDouble();  
       float exam1_1=sc.nextFloat();  
       System.out.print("Enter second exam score: ");  
       //double exam2_1 =sc.nextDouble();  
       float exam2_1 =sc.nextFloat();  
       System.out.print("Enter your first name: ");  
       String fname2=sc.next();  
       System.out.print("Enter your last name: ");  
       String lname2=sc.next();  
       System.out.print("Enter first exam score: ");  
       //double exam1_2=sc.nextDouble();  
       float exam1_2=sc.nextFloat();  
       System.out.print("Enter second exam score: ");  
       //double exam2_2 =sc.nextDouble();  
       float exam2_2 =sc.nextFloat();  
       System.out.print("Enter your first name: ");  
       String fname3=sc.next();  
       System.out.print("Enter your last name: ");  
       String lname3=sc.next();  
       System.out.print("Enter first exam score: ");  
       //double exam1_3=sc.nextDouble();  
       float exam1_3=sc.nextFloat();  
       System.out.print("Enter second exam score: ");  
       //double exam2_3 =sc.nextDouble();  
       float exam2_3 =sc.nextFloat();  
       System.out.println("Student Names\t\t"+ "Score 1\t\t"  + "Score 2\t\t" + "Average");  
       System.out.println(fname1 + " " + lname1 + "\t\t" + exam1_1 + "\t\t" + exam2_1 + "\t\t" + (exam1_1 + exam2_1)/2.0 );  
       System.out.println(fname2 + " " + lname2 + "\t\t" + exam1_2 + "\t\t" + exam2_2 + "\t\t" + (exam1_2 + exam2_2)/2.0 );  
       System.out.println(fname3 + " " + lname3 + "\t\t" + exam1_3 + "\t\t" + exam2_3 + "\t\t" + (exam1_3 + exam2_3)/2.0 + "\n" );  
       //System.out.println("The class average is: " + ((exam1_1 + exam2_1)/2.0 + (exam1_2 + exam2_2)/2.0 + (exam1_3 + exam2_3)/2.0) / 3.0);
       System.out.printf("The class average is: %.2f\n",  (exam1_1 + exam2_1 + exam1_2 + exam2_2 + exam1_3 + exam2_3)/6.0 );
       System.out.println("Not bad for the first exam.");
       sc.close();  
     }  
    } 