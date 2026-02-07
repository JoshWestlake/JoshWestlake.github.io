/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmetic.operators;

/**
 *
 * @author westy
 */
import java.util.Scanner;
public class ArithmeticOperators {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner keyedInput = new Scanner(System.in);
       
      double distance;
      double time;
      double speed;
      
      System.out.println("Please enter the total distance traveled, measured in kilometers.");
      distance = keyedInput.nextDouble();
      System.out.println("please enter the total time, measured in hours.");
      time = keyedInput.nextDouble();
      
      speed = distance/time;
      System.out.println("therefore the speed is " + speed + "km/hour.");
      
            
                   
     
               
              
           
     
      
        
        
        
       
               
    }
    
}
