/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeeapp;

import java.util.Scanner;
class Employee
{
    /* Task 8B: Add instance variables */
	
    private String firstName;
    private String lastName;
    private int employeeId;
    private double salary;
	
    /* Task 8C: Add three constructors */
	
    public Employee()
    {
        
    }
    
    public Employee( String lastName, String firstName )
    {
        this.lastName = lastName;
        this.firstName = firstName;
    }
    
    public Employee( String lastName, String firstName, int employeeId, double salary )
    {
        this.lastName = lastName;
        this.firstName = firstName;
        this.employeeId = employeeId;
        this.salary = salary;
    }
    
	
    /* Task 8D: Add set (mutator) and get (accessor) meethods*/
	
    public String getLastName()
    {
        return this.lastName;
    }
    
    public String getFirstName()
    {
        return this.firstName;
    }
    
    public int getEmployeeId()
    {
        return this.employeeId;
    }
    
    public double getSalary()
    {
        return this.salary;
    }
    
    public void setLastName( String lastName )
    {
        this.lastName = lastName;
    }
    
    public void setFirstName( String firstName )
    {
        this.firstName = firstName;
    }
    
    public void setEmployeeId( int employeeId )
    {
        this.employeeId = employeeId;
    }
    
    public void setSalary( double salary )
    {
        if ( salary < 0 )
        {
            this.salary = 0.0;
        }
        else
        {
            this.salary = salary;
        }
            
    }
	
    /* Task 8F: Add toString method */
    
    public String toString()
    {
        return "Last Name: " + lastName + ", First Name: " + firstName + ", Employee ID: " + employeeId + ", Salary: " + salary;
    }
            
    /* Task 8G: Add equals method */
	
    public boolean equals( String lastName )
    {
        return lastName.equals(this.lastName);
    }
}

/**
 *
 * @author dsilva
 */
 
public class EmployeeApp 
{
    public static final int MAX_EMPLOYEES = 5;
	
    /**
     * @param args the command line arguments
     */
	 
    public static void main(String[] args) 
    {
        Scanner keyboard = new Scanner( System.in );
        Employee[]  employees = new Employee[MAX_EMPLOYEES];
        Employee    currentEmployee;
        String      inputString;
        int         inputInt;
        double      inputDouble;
        char        choice;
        int         empCount=0;
        employees[empCount++] = new Employee( "Mitchum", "Robert", 120402, 34000.0 );
        employees[empCount++] = new Employee( "Ryan", "Cornelius" );
        employees[empCount++] = new Employee( "Asimov", "Isaac" );
        
        do
        {
            System.out.println( "\n   Enter Selection\n   ===============" );
            System.out.println( "A> Add new Employee" );
            System.out.println( "E> Edit Employee" );
            System.out.println( "L> List Employees" );
            System.out.println( "Q> Quit" );
            System.out.print(  "   Select: " );
            inputString = keyboard.nextLine();
            choice = inputString.toUpperCase().charAt( 0 );
            System.out.println();
            switch( choice )
            {
                case 'A':
                    if ( empCount < MAX_EMPLOYEES-1 )
                    {
                        // Create object for new Employee employees[empCount] = new Employee();
			/*String fName;
                        String lName;
                        int id;
                        double wage;*/
			Employee newEmployee = new Employee();			
						
                        // Task 8E: Prompt for user information and set the object
						
			System.out.print("Enter new employee first name: ");
                        newEmployee.setFirstName(keyboard.next());
                        System.out.print("Enter new employee last name: ");
                        newEmployee.setLastName(keyboard.next());
                        System.out.print("Enter new employee id: ");
                        newEmployee.setEmployeeId(keyboard.nextInt());
                        System.out.print("Enter new employee salary: ");
                        newEmployee.setSalary(keyboard.nextDouble());
						
                        // parameters via the mutator methods empCount++;
						
						
						
                    }
                    keyboard.nextLine();
                break;
                case 'E':
                    System.out.printf( "Enter Last Name of Employee to Edit: " );
                    inputString = keyboard.nextLine();
                    for ( int lp=0; lp<MAX_EMPLOYEES; lp++ )
                    {
                        // Verify that the employee entry has been allocated before Editing
                        if ( employees[lp] != null )
                        {
                            if ( employees[lp].equals( inputString ) == true )
                            {
                                System.out.print( "Enter Employee ID    : " );
                                inputInt = keyboard.nextInt();
                                employees[lp].setEmployeeId( inputInt );
                                System.out.print( "Enter Employee Salary: " );
                                inputDouble = keyboard.nextDouble();
                                employees[lp].setSalary( inputDouble );
                                keyboard.nextLine();
                            }
                        }
                    }
                    break;
                    case 'L':
                        for ( int lp=0; lp<MAX_EMPLOYEES; lp++ )
                        {
                            System.out.println( employees[lp] );
                        }
                    break;
            }
            keyboard.reset();
        } while( choice != 'Q' );
    }
}