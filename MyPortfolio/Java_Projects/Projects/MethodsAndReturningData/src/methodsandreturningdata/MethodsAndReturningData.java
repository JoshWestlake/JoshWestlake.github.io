/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodsandreturningdata;
import java.util.Scanner;
/**
 *
 * @author westy
 */
public class MethodsAndReturningData {

    //Creates a subroutine which acts as the main frame of the program
    public static void UserMenu()
    {Scanner Sc = new Scanner (System.in);
    
        //Initalizes the variable Creates an initial value so the while loop runs
        String Choice = "0";
        
        //Initializes the length of the delay
        final int delay = 2700;
        
        //Initializes the users first variable in each question
        double num1;
        
        //Initializes the users second variable in each question
        double num2;
       
        //creates a while loop which tells it to only run while the users choice does not equal Exit
        while (!Choice.equals ("Exit")){
            
            //Outputs the options to the user
            System.out.println("---------Mathmaticions Mega Mania--------");
            System.out.println("1... simple adding");
            System.out.println("2... Simple Subtracting");
            System.out.println("3... Simple Multiplication");
            System.out.println("4... Simple Division");
            System.out.println("5... Finding the area of a Square");
            System.out.println("6... Finding the area of a Triangle");
            System.out.println("7... Finding the Hypotenuse of a Right angle Triangle");
            System.out.println("8... Finding the volume of a cube");
            System.out.println("9... Finding one number to the power of another");
            System.out.println("10... Calculating Speed");
            System.out.println("Exit");
            
            //Stores the users choice 
            Choice = Sc.next();
        
            //if the Users choice is 1 the following will run
                if (Choice.equals ("1")){
                    
                    //Tells the associated Subroutine to run
                    AddingOverlay(0,0);
                    
                    //Tells the associated Subroutine to run
                    wait(delay);
                }
                
                //if the Users choice is 2 the following will run
                if (Choice.equals ("2")) {
                    
                    //Tells the associated Subroutine to run
                    SubtractingOverlay(0,0);
                    
                    //Tells the associated Subroutine to run
                    wait(delay);
                }
               
                //if the Users choice is 3 the following will run
                if (Choice.equals ("3")){
                    
                    //Tells the associated Subroutine to run
                    MultiplicationOverlay(0,0);
                    
                    //Tells the associated Subroutine to run
                    wait(delay);
                }
                
                //if the Users choice is 4 the following will run
                if (Choice.equals ("4")) {
                    
                    //Tells the associated Subroutine to run
                    DivisionOverlay(0,0);
                    
                    //Tells the associated Subroutine to run
                    wait(delay);
                }
                
                //if the Users choice is 5 the following will run
                if (Choice.equals ("5")){
                    
                    //Tells the associated Subroutine to run
                    SquareAreaOverlay(0);
                    
                    //Tells the associated Subroutine to run
                    wait(delay);
                }
                
                //if the Users choice is 6 the following will run
                if (Choice.equals ("6")){
                    
                    //Tells the associated Subroutine to run
                    TriangleAreaOverlay(0,0);
                    
                    //Tells the associated Subroutine to run
                    wait(delay);
                }
                
                //if the Users choice is 7 the following will run
                if (Choice.equals ("7")){
                    
                    //Tells the associated Subroutine to run
                    HypotOverlay(0,0);
                    
                    //Tells the associated Subroutine to run
                    wait(delay);
                }
                
                //if the Users choice is 8 the following will run
                if (Choice.equals ("8")){
                    
                    //Tells the associated Subroutine to run
                    CubeOverlay(0);
                    
                    //Tells the associated Subroutine to run
                    wait(delay);
                }
               
                //if the Users choice is 9 the following will run
                if (Choice.equals ("9")){
                   
                    //Tells the associated Subroutine to run
                    PowerOverlay(0,0); 
                    
                    //Tells the associated Subroutine to run
                    wait(delay);
                }
                
                //if the Users choice is 10 the following will run
                if (Choice.equals ("10")){
                    
                    //Tells the associated Subroutine to run
                    SpeedOverlay(0,0);
                    
                    //Tells the associated Subroutine to run
                    wait(delay);
                }
        }
    }
    
    /* AddingOverlay
    
    This method displays the initial questions to the user when selected
    parameters: double, double
    Returns: void
    */
    public static void AddingOverlay (double n1, double n2){
    Scanner Sc = new Scanner (System.in);
    //outputs instructions to the user
    System.out.println("You have chosen to Add");
    System.out.println("Please enter your first Number:");
    //Uses scanner to get value from User
    n1 = Sc.nextDouble();
                    
    //outputs instructions to the user
    System.out.println("Please enter your second Number");
    //Uses scanner to get value from User
    n2 = Sc.nextDouble();
    //Tells the associated Subroutine to run and print
    System.out.println(AddAndReturn(n1,n2));
    }
    /* AddAndReturn
    
    This method uses the users inputs to complete the selected task
    parameters: double double
    Returns: sum
    */
    public static double AddAndReturn (double n1, double n2){
    //initializes the variable and uses the values to get the result
    double sum = n1 + n2;
    
    //Rounds the value to 2 decimal places
    sum = sum*100;
    sum = Math.round(sum);
    sum = sum/100;
    //Returns the Result
    return (sum);
    }
    
    /* SubtractingOverlay
    
    This method displays the initial questions to the user when selected
    parameters: double, double
    Returns: void
    */
    public static void SubtractingOverlay (double n1, double n2){
    Scanner Sc = new Scanner (System.in);
    //outputs instructions to the user
    System.out.println("You have chosen to Subtract");
    System.out.println("Please enter your first Number:");
    //Uses scanner to get value from User
    n1 = Sc.nextDouble();
                    
    //outputs instructions to the user
    System.out.println("Please enter the amount you would like to subtract by:");
    //Uses scanner to get value from User
    n2 = Sc.nextDouble();
    //Tells the associated Subroutine to run and print
    System.out.println(SubAndReturn(n1,n2));
    }
    /* SubAndReturn
    
    This method uses the users inputs to complete the selected task
    parameters: double double
    Returns: result
    */
    public static double SubAndReturn (double n1, double n2) {
    //initializes the variable and uses the values to get the result
    double result = n1 - n2;
    
    //Rounds the value to 2 decimal places
    result = result*100;
    result = Math.round(result);
    result = result/100;
    //Returns the Result
    return (result);
    }
    
    /* MultiplicationOverlay
    
    This method displays the initial questions to the user when selected
    parameters: double, double
    Returns: void
    */
    public static void MultiplicationOverlay (double n1, double n2) {
    Scanner Sc = new Scanner (System.in);
    //outputs instructions to the user
    System.out.println("You Have chosen to multiply");
    System.out.println("Please enter your first number:");
    //Uses scanner to get value from User
    n1 = Sc.nextDouble();
    
    //outputs instructions to the user
    System.out.println("Please enter your second number:");
    n2 = Sc.nextDouble();
    //Tells the associated Subroutine to run and print
    System.out.println(MultAndReturn(n1,n2));
    }
    /* MiltiAndReturn
    
    This method uses the users inputs to complete the selected task
    parameters: double double
    Returns: result
    */
    public static double MultAndReturn (double n1, double n2) {
    //initializes the variable and uses the values to get the result
    double result = n1*n2;
        
    //Rounds the value to 2 decimal places
    result = result*100;
    result = Math.round(result);
    result = result/100;
    //Returns the Result
    return (result);
    }
    
    /* DivisionOverlay
    
    This method displays the initial questions to the user when selected
    parameters: double, double
    Returns: void
    */
    public static void DivisionOverlay (double n1, double n2) {
    Scanner Sc = new Scanner (System.in);
    //outputs instructions to the user
    System.out.println("You Have chosen to Divide");
    System.out.println("Please enter your first number:");
    //Uses scanner to get value from User
    n1 = Sc.nextDouble();
    
    //outputs instructions to the user
    System.out.println("Please number you would like to divide by:");
    //Uses scanner to get value from User
    n2 = Sc.nextDouble();   
    //Tells the associated Subroutine to run and print
    System.out.println(DivisionAndReturn(n1, n2));
    }
    /* DivisionAndReturn
    
    This method uses the users inputs to complete the selected task
    parameters: double double
    Returns: result
    */
    public static double DivisionAndReturn (double n1, double n2) {
    //initializes the variable and uses the values to get the result
    double result = n1/n2;
    
    //Rounds the value to 2 decimal places
    result = result*100;
    result = Math.round(result);
    result = result/100;
    //Returns the Result
    return (result);    
    }
    
    /* SquareAreaOverlay
    
    This method displays the initial questions to the user when selected
    parameters: double, double
    Returns: void
    */
    public static void SquareAreaOverlay (double n1) {
    Scanner Sc = new Scanner (System.in);
    //outputs instructions to the user
    System.out.println("You have chosen to find the area of a square");
    System.out.println("Please enter the side Length of the Square:");
    //Uses scanner to get value from User
    n1 = Sc.nextDouble();
    
    //Tells the associated Subroutine to run and print
    System.out.println(SquareAndReturn(n1));
    }
    /* SquareAndReturn
    
    This method uses the users inputs to complete the selected task
    parameters: double double
    Returns: result
    */
    public static double SquareAndReturn (double n1) {
    //initializes the variable and uses the values to get the result
    double result = n1*n1;
    
    //Rounds the value to 2 decimal places
    result = result*100;
    result = Math.round(result);
    result = result/100;
    //Returns the Result
    return (result);
    }
    
   /* TriangleAreaOverlay
    
    This method displays the initial questions to the user when selected
    parameters: double, double
    Returns: void
    */ 
    public static void TriangleAreaOverlay (double n1, double n2) {
    Scanner Sc = new Scanner (System.in);
    //outputs instructions to the user
    System.out.println("You have chosen to find the area of a triangle");
    System.out.println("Please enter the height of the triangle:");
    //Uses scanner to get value from User
    n1 = Sc.nextDouble();
    
    //outputs instructions to the user
    System.out.println("Please enter the base length of the triangle:");
    //Uses scanner to get value from User
    n2 = Sc.nextDouble();
    //Tells the associated Subroutine to run and print
    System.out.println(TriangleAndReturn(n1,n2));
    }
    /* TriangleAndReturn
    
    This method uses the users inputs to complete the selected task
    parameters: double double
    Returns: result
    */
    public static double TriangleAndReturn (double n1, double n2){
    //initializes the variable and uses the values to get the result
    double result = (n1*n2)/2;
    
    //Rounds the value to 2 decimal places
    result = result*100;
    result = Math.round(result);
    result = result/100;
    //Returns the Result
    return(result);
    }
    
    /* HypotOverlay
    
    This method displays the initial questions to the user when selected
    parameters: double, double
    Returns: void
    */
    public static void HypotOverlay (double n1, double n2) {
    Scanner Sc = new Scanner (System.in);
    //outputs instructions to the user
    System.out.println("You have chosen to find the Hypotenuse triangle");
    System.out.println("Please enter the first side length of the triangle:");
    //Uses scanner to get value from User
    n1 = Sc.nextDouble();
    
    //outputs instructions to the user
    System.out.println("Please enter the second side length of the triangle:");
    //Uses scanner to get value from User
    n2 = Sc.nextDouble();  
    //Tells the associated Subroutine to run and print
    System.out.println(HypotAndReturn(n1,n2));
    }
    /* HypotAndReturn
    
    This method uses the users inputs to complete the selected task
    parameters: double double
    Returns: result
    */
    public static double HypotAndReturn(double n1, double n2){
    //initializes the variable and uses the values to get the result
    double result = Math.hypot(n2, n1);
    
    //Rounds the value to 2 decimal places
    result = result*100;
    result = Math.round(result);
    result = result/100;
    //Returns the Result
    return (result);
    }
    
    /* CubeOverlay
    
    This method displays the initial questions to the user when selected
    parameters: double, double
    Returns: void
    */
    public static void CubeOverlay(double n1){
    Scanner Sc = new Scanner (System.in);
    //outputs instructions to the user
    System.out.println("You have chosen to find the volume of your cube:");
    System.out.println("Please enter the side length of 1 side of your cube:");
    //Uses scanner to get value from User
    n1 = Sc.nextDouble();
    
    //Tells the associated Subroutine to run and print
    System.out.println(CubeAndReturn(n1));
    }
    /* CubeAndReturn
    
    This method uses the users inputs to complete the selected task
    parameters: double double
    Returns: result
    */
    public static double CubeAndReturn(double n1){
    //initializes the variable and uses the values to get the result
    double result = n1*n1*n1;
    
    //Rounds the value to 2 decimal places
    result = result*100;
    result = Math.round(result);
    result = result/100;
    //Returns the Result
    return (result);
    }
    
    /* PowerOverlay
    
    This method displays the initial questions to the user when selected
    parameters: double, double
    Returns: void
    */
    public static void PowerOverlay(double n1, double n2){
    Scanner Sc = new Scanner (System.in);
    //outputs instructions to the user
    System.out.println("You have chosen to find the product of one number to the power of another");
    System.out.println("Please enter the base number:");
    //Uses scanner to get value from User
    n1 = Sc.nextDouble();
    
    //outputs instructions to the user
    System.out.println("Please enter the exponent:");
    //Uses scanner to get value from User
    n2 = Sc.nextDouble();  
    //Tells the associated Subroutine to run and print
    System.out.println(PowerAndReturn(n1, n2));
    }
    /* PowerAndReturn
    
    This method uses the users inputs to complete the selected task
    parameters: double double
    Returns: result
    */
    public static double PowerAndReturn(double n1, double n2){
    //initializes the variable and uses the values to get the result
    double result = Math.pow(n1, n2);
    
    //Rounds the value to 2 decimal places
    result = result*100;
    result = Math.round(result);
    result = result/100;
    //Returns the Result
    return (result);
    }
    
    /* SpeedOverlay
    
    This method displays the initial questions to the user when selected
    parameters: double, double
    Returns: void
    */
    public static void SpeedOverlay(double n1, double n2){
    Scanner Sc = new Scanner (System.in);
    //outputs instructions to the user
    System.out.println("You have chosen to find speed of an object");
    System.out.println("Please enter distance traveled(km)");
    //Uses scanner to get value from User
    n1 = Sc.nextDouble();
    
    //outputs instructions to the user
    System.out.println("Please enter the amount of time traveled(hr)");
    //Uses scanner to get value from User
    n2 = Sc.nextDouble();  
    //Tells the associated Subroutine to run and print
    System.out.println(SpeedAndReturn(n1, n2)+ "Km/H");
    }
    /* SpeedAndReturn
    
    This method uses the users inputs to complete the selected task
    parameters: double double
    Returns: result
    */
    public static double SpeedAndReturn(double n1, double n2){
    //initializes the variable and uses the values to get the result
    double result = n1/n2;
    
    //Rounds the value to 2 decimal places
    result = result*100;
    result = Math.round(result);
    result = result/100;
    //Returns the Result
    return (result);
    
    }
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
    public static void main(String[] args) {
        Scanner Sc = new Scanner (System.in);
        //tells the program to run the selected method
        UserMenu();
    
    }
}
