/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package looops;
import java.util.Scanner;
/**
 *
 * @author westy
 */
public class Looops {

    public static void main(String[] args) {
        Scanner Sc = new Scanner (System.in);
        
        //Giving the User choice a starting value so that the while loop requirements will be met
        int Choice = 0;
        
//titling the Program
System.out.println("----------Epic Counting Program-----------");
        
        
        //Setting the while loop, and setting the requirements for the program to run the following
        while (Choice != 5){
            
            //Provides the user with the necassary information to make thier decitions
            System.out.println("Please Consider the following options");
            System.out.println("1... Count from 0 to 10 by 1s");
            System.out.println("2... Count from 100 to 0 by 10's");
            System.out.println("3... Count from 50 to 500 by 50");
            System.out.println("4... Count from 6000 to 1000 by 1000");
            System.out.println("5... Exit");
            System.out.println("Please enter your choice");
            Choice = Sc.nextInt();
            System.out.println("---------------------------------");
            
            //If the user choose the first option the following for loop will be run
            if (Choice == 1){
                System.out.println("You chose to count from 0 to 10, by 1");
                for (int j = 0; j <= 10; j = j +1)
                    System.out.println(j);
            }
            
            //If the user choose the second option the following for loop will be run
            else if (Choice == 2){
                System.out.println("You chose to count from 100 to 0, by 10");
                for (int j = 100; j >= 0; j = j - 10)
                    System.out.println(j);
            }
            
            //If the user choose the third option the following for loop will be run
            else if (Choice == 3){
                System.out.println("You chose to count from 50 to 500, by 50");
                for (int j = 50; j <= 500; j = j + 50)
                    System.out.println(j);
            }
            
            //If the user choose the forth option the following for loop will be run
            else if (Choice == 4){
                System.out.println("You chose to count from 6000 to 1000, by 1000");
                for (int j = 6000; j >= 1000; j = j - 1000)
                    System.out.println(j);
            }
       //creates a seperation between the end of this loop, and the start of the next go around             
       System.out.println("--------------------------------------------");
        
        
        
        } 
        
        
    }
    
}
