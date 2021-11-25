/*
Course:         CS182
Project:        Program 1
Name:           Daniel Silva
Date:           February 25, 2018
Description:    Write an applicaition that accepts input for three users and two accounts and calculate average.
 */
package mybalances;

/**
 *
 * @author dsilva
 */

import java.util.Scanner;

public class MyBalances {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner( System.in );
        
        String userOneFirstName;
        String userOneLastName;
        String userTwoFirstName;
        String userTwoLastName;
        String userThreeFirstName;
        String userThreeLastName;
        String accountOne;
        String accountTwo;
        String accountThree;
        String accountFour;
        String accountFive;
        String accountSix;
        double balanceOne;
        double balanceTwo;
        double balanceThree;
        double balanceFour;
        double balanceFive;
        double balanceSix;
        double averageOne;
        double averageTwo;
        double averageThree;
        String statusOne;
        String statusTwo;
        String statusThree;
        double totalAverage;
        
        System.out.print("Enter user one first name         :");
        userOneFirstName = input.next();
        System.out.print("Enter user one last name          :");
        userOneLastName = input.next();
        System.out.print("Enter name of first account       :");
        accountOne = input.next();
        System.out.print("Enter balance of first account    :");
        balanceOne = input.nextDouble();
        System.out.print("Enter name of second account      :");
        accountFour = input.next();
        System.out.print("Enter balance of second account   :");
        balanceFour = input.nextDouble();
        
        System.out.print("Enter user two first name         :");
        userTwoFirstName = input.next();
        System.out.print("Enter user two last name          :");
        userTwoLastName = input.next();
        System.out.print("Enter name of first account       :");
        accountTwo = input.next();
        System.out.print("Enter balance of first account    :");
        balanceTwo = input.nextDouble();
        System.out.print("Enter name of second account      :");
        accountFive = input.next();
        System.out.print("Enter balance of second account   :");
        balanceFive = input.nextDouble();
        
        System.out.print("Enter user three first name       :");
        userThreeFirstName = input.next();
        System.out.print("Enter user three last name        :");
        userThreeLastName = input.next();
        System.out.print("Enter name of first account       :");
        accountThree = input.next();
        System.out.print("Enter balance of first account    :");
        balanceThree = input.nextDouble();
        System.out.print("Enter name of second account      :");
        accountSix = input.next();
        System.out.print("Enter balance of second account   :");
        balanceSix = input.nextDouble();
        
        averageOne = (balanceOne + balanceFour) / 2;
        averageTwo = (balanceTwo + balanceFive) / 2;
        averageThree = (balanceThree + balanceSix) / 2;
        
        totalAverage = (averageOne + averageTwo + averageThree) / 3;  
       
        
        System.out.println("Users" + "\t\tAccount" + "\t\tBalance" + "\t\tAccount" + "\t\tBalance" + "\t\tAverage" + "\t\tStatus");
        System.out.println("=======" + "\t\t======="   + "\t\t=======" + "\t\t=======" + "\t\t=======" + "\t\t=======" + "\t\t=======");
        System.out.println(userOneFirstName + ", " + userOneLastName + "\t\t" + accountOne + "\t\t" + balanceOne + "\t\t" + accountFour + "\t\t" + balanceFour + "\t\t" + averageOne + "\t\t" + rating(averageOne));
        System.out.println(userTwoFirstName + ", " + userTwoLastName + "\t\t" + accountTwo + "\t\t" + balanceTwo + "\t\t" + accountFive + "\t\t" + balanceFive + "\t\t" + averageTwo + "\t\t" + rating(averageTwo));
        System.out.println(userThreeFirstName + ", " + userThreeLastName + "\t\t" + accountThree + "\t\t" + balanceThree + "\t\t" + accountSix + "\t\t" + balanceSix + "\t\t" + averageThree + "\t\t" + rating(averageThree));
        
        System.out.print("The Average Account Balance is " + totalAverage);
    
    }
    
    static String rating( double average )
    {
        String output;
        
        if(average < 1000){
            output = "Awesome";
        } else if(average < 2500){
            output = "Good Job";
        } else {
            output = "Help";
        }
        
        return output;
    }
    
}
