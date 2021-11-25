/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package credittest;

/**
 *
 * @author dsilva
 */

import java.util.Scanner;

public class CreditTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner keyboard = new Scanner(System.in);
       int account;
       int oldBalance;
       int charges;
       int credits;
       int creditLimit;
       int newBalance;
       String monthString = null;
       
       System.out.print("Enter account number (or -1 to quit): ");
       account = keyboard.nextInt();
       if(account > 0)
        {
           int month;
           System.out.print("Enter month(1-12): ");
           month = keyboard.nextInt();
           switch (month) 
           {
               case 1:
                   monthString = "January";
                   break;
               case 2:
                   monthString = "February";
                   break;
               case 3:
                   monthString = "March";
                   break;
               case 4:
                   monthString = "April";
                   break;
               case 5:
                   monthString = "May";
                   break;
               case 6:
                   monthString = "June";
                   break;
               case 7:
                   monthString = "July";
                   break;
               case 8:
                   monthString = "August";
                   break;
               case 9:
                   monthString = "September";
                   break;
               case 10:
                   monthString = "October";
                   break;
               case 11:
                   monthString = "November";;
                   break;
               case 12:
                   monthString = "December";
                   break;
               default:
                   break; 
            }
            System.out.println("Statement for " + monthString);
       
            System.out.print("Enter old balance: ");
            oldBalance = keyboard.nextInt();
            System.out.print("Enter new charges: ");
            charges = keyboard.nextInt();
            System.out.print("Enter credits: ");
            credits = keyboard.nextInt();
            System.out.print("Enter credit limit: ");
            creditLimit = keyboard.nextInt();
       
            newBalance = oldBalance + charges - credits;
       
            System.out.println("New balance is: " + newBalance);
            if(newBalance > oldBalance)
                {
                    System.out.println("Balance Increasing");
                } else {
                    System.out.println("Good Job");
                }
            if(newBalance > creditLimit)
                {
                    System.out.println("Credit limit exceeded");
                } 
            }
        }
    }