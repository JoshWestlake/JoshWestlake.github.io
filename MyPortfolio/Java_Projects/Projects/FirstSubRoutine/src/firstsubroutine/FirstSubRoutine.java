/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstsubroutine;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
/**
 *
 * @author westy
 */
public class FirstSubRoutine {
     
    //Creates a subroutine which runs the following whenever referenced
    public static void addAndOut (double n1, double n2)
{
    //Calculates the sum of n1, and n2
    double sum = n1 + n2;
    
    //Outputs to the user
    System.out.println("The sum of those to Integers is " + sum);
}
    
    //Creates a subroutine which runs the following when refenced
     public static void MultiAndDisplay (double n1, double n2)
{
    //Initializes and finds the product of n1 * n2;
     double product = n1 * n2;
     
     //rounds the product to 2 decimal places
     product = product*100;
     product = Math.round(product);
     product = product/100;
     
     //outputs to the user
     System.out.println("The product of the 2 numbers is " + product);
}
     //Creates a subroutine which runs the following when refenced
    public static void HypAndDisplay (double n1, double n2)
    {
     //Imitializs and finds the hypoteunuse of the triange using the given values
     double hype = Math.hypot(n1, n2);
     
     //rounds the result to 2 decimal places
     hype = hype*100;
     hype = Math.round(hype);
     hype = hype/100;
     
     //Outputs to the User
     System.out.println("The Hypotenuse of the Triangle is " + hype);
    } 
    
    //Creates a subroutine which runs the following when refenced
    public static void AreaAndOutput (double n1, double n2)
    {
    //Initializes the variable and finds the area of the triangle
    double area = (n1 * n2)/2;
    
    //rounds the result to 2 decimal places
    area = area*100;
    area = Math.round(area);
    area = area/100;
    
    //Outputs to the user
    System.out.println("The Area for the triangle is " + area);
    }
    
    //Creates a subroutine which runs the following when refenced
    public static void SpeedAndOutput (double n1, double n2)
    {
        
    //initializes the variable and calculates the speed
    double speed = n1/n2;
    
    //rounds the result to 2 decimal places
    speed = speed*100;
    speed = Math.round(speed);
    speed = speed/100;
    
    //outputs to the user
    System.out.println("The speed is " + speed + "Km/h");
    }
    
    //creates a subroutine which runs when referenced
    public static void wait(int ms)
    {
        try
        {
            //Creates a delay
           Thread.sleep(ms); 
        }
        catch(InterruptedException ex)
        {
           //ends the delay
           Thread.currentThread().interrupt();
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Input = new Scanner (System.in); 
        
        //Initalizes the variable Creates an initial value so the while loop runs
        String Choice = "0";
        
        //Initializes the users first variable in each question
        double num1;
        
        //Initializes the users second variable in each question
        double num2;
        
        //Initializes the length of the delay
        int delay = 2500;
        
        //Outputs to the user the title of the program
        System.out.println("---------Welcome to the Mathmatical Calculator----------");
        
        //creates a while loop which tells it to only run while the users choice does not equal Exit
        while (!Choice.equals ("Exit"))
        {
        //Outputs the options to the user
        System.out.println("Please select which type of problem you would like to solve:");
        System.out.println("1... Simple Adding");
        System.out.println("2... Simple Multiplcation");
        System.out.println("3... Finding the Hypotenuse ");
        System.out.println("4... Find the Area of a Triangle");
        System.out.println("5... Find the speed");
        System.out.println("Exit");
        
        //Stores the users choice 
        Choice = Input.next();
        
            //if the Users choice is 1 the following will run
            if (Choice.equals ("1")){
                System.out.println("Please enter your first number: ");
                //Takes in the Users first number
                num1 = Input.nextDouble();
            
                System.out.println("Please enter your second number: ");
                //Takes in the Users Second number
                num2 = Input.nextDouble();
                
                //Tells the associated Subroutine to run
                addAndOut (num1,num2);
            }
            
            //if the Users choice is 2 the following will run
            if (Choice.equals ("2")) {
                System.out.println("Please enter your first number:");
                //Takes in the Users first number
                num1 = Input.nextDouble();
                
                System.out.println("Please enter your second number:");
                //Takes in the Users Second number
                num2 = Input.nextDouble();
                
                //Tells the associated Subroutine to run
                MultiAndDisplay(num1,num2);
            }
            
            //if the Users choice is 3 the following will run
            if (Choice.equals ("3")) {
                System.out.println("Please enter the length of the first side in the Triangle:");
                //Takes in the Users first number
                num1 = Input.nextDouble();
                
                System.out.println("Please enter the length of the Second side in the Triangle:");
                //Takes in the Users Second number
                num2 = Input.nextDouble();
                
                //Tells the associated Subroutine to run
                HypAndDisplay (num1,num2);
            }
            
            //if the Users choice is 4 the following will run
            if (Choice.equals ("4")) {
                System.out.println("Enter the base of the Triangle:");
                //Takes in the Users first number
                num1 = Input.nextDouble();
                
                System.out.println("Enter the height of the Triangle:");
                //Takes in the Users Second number
                num2 = Input.nextDouble();
                
                //Tells the associated Subroutine to run
                AreaAndOutput(num1,num2);
            }
            //if the Users choice is 4 the following will run
            if (Choice.equals ("5")) {
                System.out.println("Enter the distance the traveled: (in KM)");
                //Takes in the Users first number
                num1 = Input.nextDouble();
                
                System.out.println("Enter the total time elapsed (in hours)");
                //Takes in the Users second number
                num2 = Input.nextDouble();
                
                //Tells the associated Subroutine to run
                SpeedAndOutput(num1,num2);
            }
           //Tells the associated Subroutine to run  
          wait(delay);
        }
        
        
    }
    
}
