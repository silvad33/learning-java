/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

/**
 *
 * @author dsilva
 */
import java.util.Scanner;

enum Shapes { CIRCLE, SQUARE, RECTANGLE, UNKNOWN };


public class JavaApplication3 
{
// Task 6C: Define constant variable PI
    static final double PI = 3.14159;
    
    public static void main(String[] args)
    {
        // Task 6D: Define instance variables
        Scanner input = new Scanner(System.in);//construct scanner object
        String userInput;//variable to store scanner input
        Shapes desiredOutput;//String for storing the desired user shape
        int length;//assign length 
        int width;//assign width 
        int radius;//assign radius
        double calculatedArea;//one variable to calculate area
        Shapes userShape;//variable of type shape for storing shape type                

        // Task 6E: Prompt the user to Enter the Shape
        System.out.print("Enter shape ( Circle, Square, Rectangle ): ");//prompt
        userInput = input.next();//variable to store user input


        // Task 6G: call method getShape to assign entered shape
        userShape = getShape( userInput );
        // Task 6H: Define switch statement with the Shapes variable as the
        // controlling parameter
        switch( userShape )
        {
            // Task 6I: Define case Statement for required circle parameters
            case CIRCLE:
                System.out.print("Enter Radius: ");
                radius = input.nextInt();
                calculatedArea = area( radius );
                System.out.println("The area of the circle is: " + calculatedArea);
                break;
            // Task 6I: Define case statement for required rectangle parameters
            case RECTANGLE:
                System.out.print("Enter Length: ");
                length = input.nextInt();
                System.out.print("Enter Width: ");
                width = input.nextInt();
                calculatedArea = area( length, width );
                System.out.println("The area of the rectangle is: " + calculatedArea);
                break;                
            // Task 6I: Define case statement for required square parameters
            case SQUARE:
                System.out.print("Enter Length: ");
                length = input.nextInt();
                calculatedArea = Math.pow(length, 2);
                System.out.println("The area of the square is: " + calculatedArea);                
                break;                
            // Task 6I: Define default condition for handling incorrect entry
            default:
                System.out.println( "Unknown Shape" );
        }
    }
    // Task 6F: Define method getShape which accepts a String as a parameter and
    //          will return the proper enumerated type.  The method needs to return
    //          all options available in enumerated type:
    //          CIRCLE, SQUARE, RECTANGLE, UNKNOWN
    static Shapes getShape( String input )
    {
        if ( input.equalsIgnoreCase( "Circle" ))
        {
            return Shapes.CIRCLE;
        }
        else if (input.equalsIgnoreCase( "Rectangle"))
        {
            return Shapes.RECTANGLE;
        }
                if ( input.equalsIgnoreCase( "Square" ))
        {
            return Shapes.SQUARE;
        }
        else 
        {
            return Shapes.UNKNOWN;
        }
                    
    }
    // Task 6J: Define method "area" which accepts radius and returns a double
    //          Radius of Circle is PI * radius squared
    static double area( int rad )
    {
        double circleArea;
        circleArea = PI * Math.pow(rad, 2);
        return circleArea;                
    }
    // Task 6K: Define method "area" which acceepts length and width
    static double area( int length, int width)
    {
        double rectangleArea;
        rectangleArea = length * width;                                                                                                                                                 
        return rectangleArea;
    }    
}
