/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modularprograming;
import java.util.Scanner;
/**
 *
 * @author westy
 */
public class ModularPrograming {
    public static void addAndOut (int n1, int n2)
{
    int sum = n1 + n2;
    System.out.println("The sum of those 2 numbers is: " + sum);
}
    
    public static int multiAndRet (int n1, int n2)
    {
        int product = n1 * n2;
        return (product);
    }
    public static void main(String[] args) {
       
        Scanner keyboard = new Scanner (System.in);
       
       int num1, num2;
       int answer;
       
       System.out.println("Enter Number 1:");
       num1 = keyboard.nextInt();
       
       System.out.println("Enter Number 2:");
       num2 = keyboard.nextInt();
       
       addAndOut (num1,num2);
       
       
       System.out.println("The product of those 2 numbers is: " + multiAndRet(num1, num2));
    }
    
}
