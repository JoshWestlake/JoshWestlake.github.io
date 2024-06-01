/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shopping;
import java.util.Scanner;


/**
 *
 * @author s300064451
 */
public class Shopping {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyedInput = new Scanner (System.in);
        int KeyboardNum;
        final double KEYBOARD = 49.99;
        int USBNum;
        final double USB = 19.99; 
        int MouseNum;
        final double MOUSE = 25.99; 
        final double TAX = 0.13;
        double cost;
        double total;
        double taxTotal;
        
        
        System.out.println("Hello, welcome to computers and more.");
        System.out.println(" How many keyboards would you like to buy?");
        KeyboardNum = keyedInput.nextInt();
        
        System.out.println("How many USB devices would you like to buy?");
        USBNum = keyedInput.nextInt();
        
        System.out.println(" How many computer mice would you like to buy?");
        MouseNum = keyedInput.nextInt();
        cost = KeyboardNum * KEYBOARD + USBNum * USB + MouseNum * MOUSE;
        
        
        taxTotal = cost*TAX;       
        total = cost + taxTotal;
        
        System.out.println ("the final price is $" + total + ".");
        
        
       
        
    }
    
}
