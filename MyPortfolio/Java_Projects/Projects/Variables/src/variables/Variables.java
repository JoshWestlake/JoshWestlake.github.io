/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package variables;

/**
 *
 * @author westy
 */
public class Variables {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int length;
        int width;
        int area;
        
        length = 12;
        width = 15;
        
        area = length * width;
        
        System.out.println("the length of the rectangle is"  + length + ".");
        System.out.println("the width of the rectangle is "  + width + ".");
        System.out.println("");
        System.out.println("The area of the rectangle is "+ area + ".");
    }
    
}
