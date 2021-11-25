/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unique;

/**
 *
 * @author dsilva
 */
import java.util.Scanner;

public class Unique 
{

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);   
        final int MAX_ENTRIES = 5;
        int[] buffer = new int[MAX_ENTRIES];
        int count;
        int questionNumber = 1;
        count = 0;
        
        do
        {
            System.out.print("Enter digit " + questionNumber + " : ");
            buffer[count] = input.nextInt();
            if(buffer[count] == -1)
            {
                break;
            }
            else
            {
                count++;
                questionNumber++;
            }
        }while(count < MAX_ENTRIES);
        
        System.out.print( "Array Elements: " );
        
        for( int lp: buffer)
        {
            System.out.printf(" %d", lp );
        }
    }
}
