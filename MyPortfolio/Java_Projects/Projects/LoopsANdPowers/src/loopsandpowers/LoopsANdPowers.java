/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loopsandpowers;
import java.util.Scanner;
/**
 *
 * @author westy
 */
public class LoopsANdPowers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Sc = new Scanner (System.in);
        
        //This is the Users Choice. It begins as 0, and changes throughout
        int Choice = 0;
        
        //This is the users number which he wants to either square or cube, or serves as the base number for option 3
        int UserNum;
        
        //this is the Final answer and it changes between each varying based on the userNum
        int Answer;
        
        //In question 3 this is the power the UserNum is Exponized 
        int Exponent;
        
            //Tells the program to run specifically if the Choice value doesnt equal 4
            while (Choice != 4){
                System.out.println("------Epic Exponent Calculator------");
                System.out.println("1... Find the value of a Number Squared");
                System.out.println("2... Find the value of a number Cubed");
                System.out.println("3... Find a value to any number, to any Power");
                System.out.println("4... Exit");
                Choice = Sc.nextInt();
                
                //If the users Choice is equal to 1 the program will run, causing the users number to be squared
                if (Choice == 1){
                    System.out.println("What number would you like to Square?");
                    UserNum = Sc.nextInt();
                    
                    for (int i = 1; i<=1;i = i+1){
                        Answer = UserNum*UserNum;
                        System.out.println("The Answer is " + Answer);
                    }
                }
                
                //If the users Choice is equal to 2 the program will run, causing the users number to be cubed
                else if (Choice == 2){
                    System.out.println("What number would you like to Cube?");
                    UserNum = Sc.nextInt();
                    
                    for (int i = 1; i<= 1; i = i + 1){
                        Answer = (UserNum*UserNum*UserNum);
                        System.out.println("The answer is " + Answer);
                    }
                }
                
                //If the users Choice is equal to 3 the program will run, the users number to the power of the second number
                else if (Choice ==  3){
                    System.out.println("What is the base number you would like to use?");
                    UserNum = Sc.nextInt();
                    System.out.print("What is the power you would like to use? \n");
                    Exponent = Sc.nextInt();
                        for(int i = 1; i <= Exponent; i= i+1)
                        {
                            Answer = UserNum * UserNum;
                            
                    System.out.println("The answer is " + Answer);
                        }
                }
               
                //if the user ends the program he will recieve a final message
                else if (Choice == 4){
                    System.out.println(" ----------Ending Program-------- ");    
                }
                    
            
                else {
                    
                    //if the user responds with an incorrect number
                    System.out.println("That's not a valid answer!");
                }
                    
            }
    }
    
}
