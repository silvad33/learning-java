/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuyamacapayroll;

/**
 *
 * @author dsilva
 */
import java.util.Scanner;

enum EMPLOYEE_TYPE {SALARIED, HOURLY, TEMPORARY, QUIT, UNKNOWN};

public class CuyamacaPayroll {
    
    static final int MAXIMIUM_EMPLOYEE = 4;//maximum employee constant

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        EMPLOYEE_TYPE desiredType;
        String userInput;
        double grossWage;
        double taxesWithheld;
        double retirementWithheld;
        double netWages;
        double salary;
        int hours;
        String fullName;
        int count = 0;
        
        while (count <= MAXIMIUM_EMPLOYEE)
        {
            System.out.print("Enter Employee Type [Salaried], [Hourly], [Temporary], [Quit]: ");
            userInput = input.next();
            desiredType = getType( userInput );
        
            if(desiredType != EMPLOYEE_TYPE.QUIT)
            {
                if (desiredType == EMPLOYEE_TYPE.SALARIED || desiredType == EMPLOYEE_TYPE.HOURLY || desiredType == EMPLOYEE_TYPE.TEMPORARY)
                {
                    System.out.print("Enter Employee First Name: ");
                    String fName;
                    fName = input.next();
                    System.out.print("Enter Employee Last Name: ");
                    String lName = input.next();
                    fullName = fName + ' ' + lName;

                    switch ( desiredType )
                    {
                        case SALARIED:
                            System.out.print(fullName+ "'s Yearly Salary: " );
                            salary = input.nextInt();
                            grossWage = salariedWages( salary );
                            taxesWithheld = tax( grossWage );
                            retirementWithheld = retirmentPay( grossWage );
                            netWages = grossWage - taxesWithheld - retirementWithheld;
                            System.out.println( "Employee\t\t: " + fullName + "\n" + "Gross Wages\t\t: " + grossWage + "\nTaxes Withheld\t\t: " + taxesWithheld + "\nRetirement Withheld\t: " + retirementWithheld + "\nNet Wages\t\t: " + netWages );
                            break;

                        case HOURLY:
                            System.out.print(fullName+ "'s Hourly Salary: " );
                            salary = input.nextDouble();
                            System.out.print("Enter " + fullName + " Number of Hours: ");
                            hours = input.nextInt();
                            grossWage = hourlyWages( salary, hours );
                            taxesWithheld = tax( grossWage );
                            netWages = grossWage - taxesWithheld;
                            System.out.println( "Employee\t\t: " + fullName + "\n" + "Gross Wages\t\t: " + grossWage + "\nTaxes Withheld\t\t: " + taxesWithheld + "\nNet Wages\t\t: " + netWages );
                            break;
                            
                        case TEMPORARY:
                            System.out.print(fullName+ "'s Hourly Salary: " );
                            salary = input.nextDouble();
                            System.out.print("Enter " + fullName + " Number of Hours: ");
                            hours = input.nextInt();
                            grossWage = hourlyWages( salary, hours );
                            System.out.println( "Employee\t\t: " + fullName + "\n" + "Gross Wages\t\t: " + grossWage +"\nNo Taxes Deducted");
                            break;
                    }
                }
                else 
                {
                    System.out.println("Uknown Employee Type, Please Reenter.");
                    continue;
                }
            } 
            else 
            {
                break;
            }
            count = count + 1;
        }
    }
    static EMPLOYEE_TYPE getType( String userInput )
    {
        EMPLOYEE_TYPE typeOfPay;
        if(userInput.equalsIgnoreCase("Salaried"))
        {
          typeOfPay = EMPLOYEE_TYPE.SALARIED;
        } 
        else if (userInput.equalsIgnoreCase("Hourly"))
        {
           typeOfPay = EMPLOYEE_TYPE.HOURLY;
        } 
        else if (userInput.equalsIgnoreCase("Temporary"))
        {
            typeOfPay = EMPLOYEE_TYPE.TEMPORARY;
        }
        else if (userInput.equalsIgnoreCase("Quit"))
        {
            typeOfPay = EMPLOYEE_TYPE.QUIT;
        }        
        else 
        {
           typeOfPay =  EMPLOYEE_TYPE.UNKNOWN;
        } 
        return typeOfPay;     
    }
    static double salariedWages( double salary )
    {
        double here;
            here = salary * .02;
        return here;
    } 
    static double hourlyWages( double salary, int hours )
    {
        double here;
        double overTimePay;
        double overTime;
        double regularPay;
        if(hours > 40)
        {
            overTimePay = (salary/2) + salary; 
            overTime = (hours - 40) * overTimePay;
            regularPay = salary * 40;
            here = overTime + regularPay;

        } 
        else
        {
            here = salary * hours;
        }
        return here;
    }     
    static double tax( double grossWage )
    {
        double ttax;
        ttax = grossWage * .18;
        return ttax;
    }
    static double retirmentPay( double grossWage )
    {
        double tretirmentPay;
        double retirementRate;
        retirementRate = .04;
        tretirmentPay = grossWage * retirementRate;
        return tretirmentPay;
    }
}                    