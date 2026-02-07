/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package first.selection.program;
import java.util.Scanner;
/**
 *
 * @author s300064451
 */
public class FirstSelectionProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner keyedInput = new Scanner(System.in);
      
      //The total cost represents the total cost of the order 
      
      double totalcost;
      double savings = 0;
      //Finding out what the customers total cost was
      System.out.println("What was your total?");
      totalcost = keyedInput.nextDouble();
      System.out.println("Original price: " + totalcost);
      
      
      //if price of order is greater than 120
      if (totalcost>120)
      {
      
          System.out.println("today you will get 40% off your order");
          savings = totalcost - totalcost*0.6;
          totalcost = totalcost*0.6;
      }
        
      //if price of order is greater than 80
      else if (totalcost > 80) 
      {
          System.out.println("today you will get 30% off your purchase.");
          savings = totalcost - totalcost*0.7;
          totalcost = totalcost*0.7;
      }
      
      //If price of order is greater than 40
      else if (totalcost>40) 
      {
          System.out.println("Today you will get  20% off your purchase.");
          savings = totalcost - totalcost*0.8;
          totalcost = totalcost*0.8;
      } 
      
      //if the price of the order is greater than 0
      else if (totalcost>0) 
      {
          System.out.println("Today you will get  10% off your purchase.");
          savings = totalcost - totalcost*0.9;
          totalcost = totalcost*0.9;
         
      
      }
      //Rounding totals to 2 decimal places
          totalcost = totalcost*100;  
          totalcost = Math.round(totalcost);
          totalcost = totalcost/100;
          
          savings = savings*100;
          savings = Math.round (savings);
          savings = savings/100;
         
      //printing lines to user    
         
         System.out.println("Congratulations you saved $" + savings + " off your purchase.");
         System.out.println("your total today will be $" + totalcost);
         
          
    }
}

    

