/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package findelement;

/**
 *
 * @author dsilva
 */

import java.util.Scanner;

public class FindElement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner keyboard = new Scanner(System.in);
        int i, j, numberOfColumns, numberOfRows;
        
        
        
        System.out.print("Enter the number of rows of the desired array\t: ");
        numberOfRows = keyboard.nextInt();
        System.out.print("Enter the number of columns of the desired array: ");
        numberOfColumns = keyboard.nextInt();
         int [][] arrayElements = new int[numberOfRows][numberOfColumns];

        
        for(i=0; i<numberOfRows; i++)
       {
           for(j=0; j<numberOfColumns; j++)
           {
               System.out.print("Enter the value for row[" + i + "], Column[" + j + "]: ");
               arrayElements[i][j] = keyboard.nextInt();
           }
       }
	   
       System.out.print("The Array is :\n");
       for(i=0; i<numberOfRows; i++)
       {
           for(j=0; j<numberOfColumns; j++)
           {
               System.out.print(arrayElements[i][j]+ "  ");
           }
           System.out.println();
       }
   }
}