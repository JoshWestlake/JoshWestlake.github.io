/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package counters.and.scores;
import java.util.Scanner;
/**
 *
 * @author westy
 */
public class CountersAndScores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner keyedInput = new Scanner(System.in); 
       int userAnswer;
       int numCorrect;
       
       numCorrect = 0;
       
       System.out.println("does justin smell bad?");
       userAnswer = keyedInput.nextInt();
       if (userAnswer == No)
       {
           System.out.println ("Correct");
           numCorrect = numCorrect + 1;
       }
       else 
           System.out.println("shut up u faggot pussy");
       }
    }
    

