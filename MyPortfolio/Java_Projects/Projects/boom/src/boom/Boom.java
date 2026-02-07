/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boom;

/**
 *
 * @author westy
 */
public class Boom {

    public static String determineAns (int n1, int n2){
    if ((n1 + n2) == 15)
    {return "Maybe";}
    else if ((n1 + n2) > 15)
    {return "Yes";}
    else 
    {return "No";}
    
    
    }
    
    
    
    
    
    public static void main (String[] args){
    
        int val1 = 6;
        int val2 = 8;
        
        System.out.println(determineAns(val2, val2));
    }
    }

       

    
       
           
    
    

