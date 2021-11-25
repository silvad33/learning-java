/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package driverlicenseexam;
import java.util.Scanner;
/**
 *
 * @author dsilva
 */
public class DriverLicenseExam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        char[] correct = {'B','D','A','A','C','A','A','D','B','B','B','D','C','A','C','C','A','D','A','A'};
        char[] answers = new char[20];
        int count = 0;
        int questionNumber = 1;
        String studentAnswer;
        char teacherInput;
        int totalAnsweredCorrect;
        double percent;
        
        //Loop through the teachers input of the students repsonses. 
        while( count < answers.length )
        {
            System.out.print( "Enter the students answer to question " + questionNumber + ": " );
            studentAnswer = input.nextLine();
            teacherInput = studentAnswer.charAt(0);
            if ((teacherInput != 'A') && (teacherInput != 'B') && (teacherInput != 'C') && (teacherInput != 'D' ))
            {
                System.out.println("Please Enter a Valid Answer!");
                continue;
            }
            answers[count] = teacherInput;
            count++;
            questionNumber++;
        }
        
        totalAnsweredCorrect = correctAnswers(correct, answers);
       
        System.out.println( "Number of questions student answered correctly: " + totalAnsweredCorrect );//Display the total number of questions answered correctly
        
        if(totalAnsweredCorrect >= 15)
        {
            percent = percentCorrect(totalAnsweredCorrect);
            System.out.println("The Student Passed with a " + percent + "% !");//Tell that student passed
        }
        else
        {
            percent = percentCorrect(totalAnsweredCorrect);
            System.out.println("The Student Failed with a " + percent + "% .");//Tell that the student failed.
        }
        
    }
    public static double percentCorrect(int correct)
    {

        double answer;
        double multiply;
        multiply =  correct / 20.0;
        answer = multiply * 100;
        
        return answer;
    }
    
    public static int correctAnswers(char staticAnswers[], char studentAnswers[])
    {
       int matchingAnswers = 0;
        for(int i = 0; i < staticAnswers.length; i++) 
        {
            if(staticAnswers[i] == studentAnswers[i])
            {
                matchingAnswers++; 
            }
        }
        return matchingAnswers;
    }
    
}

