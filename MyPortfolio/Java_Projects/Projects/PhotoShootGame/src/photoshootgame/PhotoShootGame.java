/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package photoshootgame;
import java.util.Scanner;
/**
 *
 * @author s300064451
 */
public class PhotoShootGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyedInput = new Scanner (System.in);
        
       
//This Double is the total money the user has. The value starts at 30 and changes depending on users choices
double UserTotal = 30.00;
        
//this Double is the total cost the User is spending at the Hair Salon. It begins at 0 and increases as the User makes decitions
double Total = 0.00;
        
//this Double is the total cost the User is spending at the Makeup Store. It begins at 0 and increases as the User makes decitions
double MakeupTotal = 0.00;
        
//This Value describes the total the user is spending throughout the game(Total+MakeupTotal)
double GrandTotal; 
        
//This Variable takes into concideration the gender of the User
String Gender;
        
//This Variable is used to gather the users name which is used throughout the Game
String Username;
        
//This is used to wait for the users responce before proceeding to the next part
String Pause;
        
//This is a string variable used to capture what the user is choosing to do within the program(1stChoice)
String barber1;
        
//This is a string variable used to capture what the user is choosing to do within the program(2ndChoice)
String barber2;
        
//This is a string variable used to capture what the user is choosing to do within the program(3rdChoice)
String barber3;
        
//This is a string variable used to capture what the user is choosing to do within the program(4thChoice)
String barber4;
        
//This is a string variable used to capture what the user is choosing to do within the program(1stMakeupChoice)
String Makeup1;
       
//This is a string variable used to capture what the user is choosing to do within the program(2ndMakeupChoice)
String Makeup2;
        
//This is a string variable used to capture what the user is choosing to do within the program(3rdMakeupChoice)
String Makeup3;

//This String is used to identify what the user want thier hair cut to
String Length;

//This String is used to identify what the user want thier hair cut to
String DyeColour;

//EyeLiner is used to identify what colour the user wants thier eyeliner to
String EyeLiner;

//This string is used to identify what colour the user wants thier Lipstick
String LipStick;

//Used to find out if the user want to catch a limo ride
String limo1;

//A constant Value used to describe the discount at the BarberShop
final Double DISCOUNT = 0.75;
        
        
        //Creates a Profile for the User
        System.out.println("What is Your name?");
        Username = keyedInput.nextLine();
        System.out.println("Hello " + Username + " What gender are you(Girl/Boy)");
        Gender = keyedInput.nextLine();
        
        //Introduction to the purpose of the Game
        System.out.println("Welcome to the Photoshoot");
        System.out.println("You have a total of $" + UserTotal + " to spend to get yourself ready for the photo shoot!");
       
        //Prompts User to Begin the Game
        System.out.println("First lets go to the Barber Shop(ok)");
        Pause = keyedInput.nextLine();
        
        //If the User Responds ok as prompted, the Following lines will commence
        if (Pause.equals ("ok")) {
            System.out.println("Welcome, " +Username+ " to the Holy Rolly Barber Shop!");
            System.out.println("You are our first Customer, your purchases will be 25% off!");
            System.out.println("Would you like to dye your hair($10), Cut your Hair($5), or Curl your hair ($5)-(Dyehair, CutHair, CurlHair) ?");
            barber1 = keyedInput.nextLine();
                
                //Tells computer if the User responds with correct trigger than the following should run
                if (barber1.equals ("DyeHair")){
                    System.out.println("Ok, what colour would you like to dye your hair to?");
                    DyeColour = keyedInput.nextLine();
                    System.out.println("Your hair will be dyed to the colour " + DyeColour);
                    Total = Total +10*DISCOUNT;
                    UserTotal = UserTotal - 10*DISCOUNT;
                    System.out.println("your total is $" + Total + ", leaving you with " + UserTotal);
                    
                    System.out.println("Now would you like to Cut your hair($5), or curl your hair as well?(CutHair, CurlHair, Done)");
                    barber2 = keyedInput.nextLine();
                    
                    //Tells computer if the User responds with correct trigger than the following should run
                    if (barber2.equals ("CutHair")){
                            System.out.println("ok would you like your hair cut long, medium, or short?");
                            Length = keyedInput.next();
                            System.out.println ("Your Hair will be cut " + Length);
                            Total = Total + 5*DISCOUNT;
                            UserTotal = UserTotal - 5*DISCOUNT;
                            System.out.println("your total is $" + Total + ", leaving you with " + UserTotal);
                            System.out.println("Would you also like to Curl your hair?(CurlHair/Done)");
                            barber3 = keyedInput.next();
                                
                                //Tells computer if the User responds with correct trigger than the following should run
                                if (barber3.equals ("CurlHair")){
                                    System.out.println("ok, your hair will be curled");
                                    Total = Total +5*DISCOUNT;
                                    UserTotal = UserTotal - 5*DISCOUNT;
                                    System.out.println("your total is $" + Total + ", leaving you with " + UserTotal);
                                    System.out.println("Thank you for shopping at the Holy Rolly Barber Shop!");
                                }
                                
                                //Tells computer if the User responds with correct trigger than the following should run
                                else if (barber3.equals ("done")){
                                    System.out.println("Thank you for shopping at the Holy Rolly Barber Shop!");
                                }
                        }
                    //Tells computer if the User responds with correct trigger than the following should run    
                    else if (barber2.equals ("CurlHair")){
                            System.out.println("ok, your hair will be curled");
                            Total = Total +5*DISCOUNT;
                            UserTotal = UserTotal - 5*DISCOUNT;
                            System.out.println("your total is $" + Total + ", leaving you with " + UserTotal);
                            System.out.println("Would you also like to Cut your hair?(CutHair/Done)");
                            barber3 = keyedInput.next();
                            
                                //Tells computer if the User responds with correct trigger than the following should run
                                if(barber3.equals ("CutHair")){
                                    System.out.println("ok would you like your hair cut long, medium, or short?");
                                    Length = keyedInput.next();
                                    System.out.println ("Your Hair will be cut " + Length);
                                    Total = Total +5*DISCOUNT;
                                    UserTotal = UserTotal - 5*DISCOUNT;
                                    System.out.println("your total is $" + Total + ", leaving you with " + UserTotal);
                                    System.out.println("Thank you for shopping at Holy Rolly Barber Shop");
                                }
                                
                                //Tells computer if the User responds with correct trigger than the following should run
                                else if (barber3.equals ("Done")){
                                    System.out.println("Thank you for shopping at the Holy Rolly Barber Shop");
                                }
                               
                        }
                        
                    //Tells computer if the User responds with correct trigger than the following should run
                    else if (barber2.equals ("Done")){
                             System.out.println("Thank you for shopping at the Holy Rolly Barber Shop");
                        }
                }
               
               //Tells computer if the User responds with correct trigger than the following should run
               if (barber1.equals ("CutHair")){
                    System.out.println("ok, Would you like your hair cut long, medium, or short?");
                    Length = keyedInput.nextLine();
                    System.out.println("Your hair will be cut " + Length);
                    Total = Total +5*DISCOUNT;
                    UserTotal = UserTotal - 5*DISCOUNT;
                    System.out.println("your total is $" + Total + ", leaving you with " + UserTotal);
                    System.out.println("Now would you like to Dye your hair($10), or curl your hair as well?(DyeHair, CurlHair, Done)");
                    barber2 = keyedInput.nextLine();
                    
                    //Tells computer if the User responds with correct trigger than the following should run        
                    if (barber2.equals ("DyeHair")){
                            System.out.println("Ok, what colour would you like to dye your hair to?");
                            DyeColour = keyedInput.nextLine();
                            System.out.println("Your hair will be dyed to the colour " + DyeColour);
                            Total = Total +10*DISCOUNT;
                            UserTotal = UserTotal - 10*DISCOUNT;
                            System.out.println("your total is $" + Total + ", leaving you with " + UserTotal);
                            System.out.println("Would you also like to Curl your hair?(CurlHair/Done)");
                            barber3 = keyedInput.next();
                           
                            //Tells computer if the User responds with correct trigger than the following should run    
                            if (barber3.equals ("CurlHair")){
                                    System.out.println("ok, your hair will be curled");
                                    Total = Total +5*DISCOUNT;
                                    UserTotal = UserTotal - 5*DISCOUNT;
                                    System.out.println("your total is $" + Total + ", leaving you with " + UserTotal);
                                    System.out.println("Thank you for shopping at the Holy Rolly Barber Shop!");
                            }
                                
                            //Tells computer if the User responds with correct trigger than the following should run
                            else if (barber3.equals ("done")){
                                    System.out.println("Thank you for shopping at the Holy Rolly Barber Shop!");
                            }
                    }
                        
                    //Tells computer if the User responds with correct trigger than the following should run
                    else if (barber2.equals ("CurlHair")){
                            System.out.println("ok, your hair will be curled");
                            Total = Total +5*DISCOUNT;
                            UserTotal = UserTotal - 5*DISCOUNT;
                            System.out.println("your total is $" + Total + ", leaving you with " + UserTotal);
                            System.out.println("Would you also like to Dye your hair?(DyeHair/Done)");
                            barber3 = keyedInput.next();
                            
                            //Tells computer if the User responds with correct trigger than the following should run    
                            if(barber3.equals ("DyeHair")){
                                    System.out.println("What colour would you like you hair dyed to?");
                                    DyeColour = keyedInput.next();
                                    System.out.println ("Your Hair will be Dyed " + DyeColour);
                                    Total = Total +10*DISCOUNT;
                                    UserTotal = UserTotal - 10*DISCOUNT;
                                    System.out.println("your total is $" + Total + ", leaving you with " + UserTotal);
                                    System.out.println("Thank you for shopping at Holy Rolly Barber Shop");
                            }
                                
                            //Tells computer if the User responds with correct trigger than the following should run
                            else if (barber3.equals ("Done")){
                                    System.out.println("Thank you for shopping at the Holy Rolly Barber Shop");
                            }
                                
                        }
                        
                    //Tells computer if the User responds with correct trigger than the following should run
                    else if (barber2.equals ("Done")){
                            System.out.println("Thank you for shopping at the Holy Rolly Barber Shop!");
                        }
                }
               
               //Tells computer if the User responds with correct trigger than the following should run
               if (barber1.equals ("CurlHair")){
                    System.out.println("ok, your Hair will be Curled");
                    Total = Total +5*DISCOUNT;
                    UserTotal = UserTotal - 5*DISCOUNT;
                    System.out.println("your total is $" + Total + ", leaving you with " + UserTotal);
                    System.out.println("Now would you like to Dye your hair($10), or cut your hair as well?(DyeHair, CutHair, Done)");
                    barber2 = keyedInput.nextLine();
                    
                    //Tells computer if the User responds with correct trigger than the following should run        
                    if (barber2.equals ("DyeHair")){
                            System.out.println("Ok, what colour would you like to dye your hair to?");
                            DyeColour = keyedInput.nextLine();
                            System.out.println("Your hair will be dyed to the colour " + DyeColour);
                            Total = Total +10*DISCOUNT;
                            UserTotal = UserTotal - 10*DISCOUNT;
                            System.out.println("your total is $" + Total + ", leaving you with " + UserTotal);
                            System.out.println("Would you also like to Cut your hair?(CutHair/Done)");
                            barber3 = keyedInput.next();
                           
                            //Tells computer if the User responds with correct trigger than the following should run    
                            if (barber3.equals ("CutHair")){
                                    System.out.println("ok, what lenght do you want to cut you hair to?");
                                    Length = keyedInput.next();
                                    System.out.println("Okay, your hair will be cut " + Length);
                                    Total = Total +5*DISCOUNT;
                                    UserTotal = UserTotal - 5*DISCOUNT;
                                    System.out.println("your total is $" + Total + ", leaving you with " + UserTotal);
                                    System.out.println("Thank you for shopping at the Holy Rolly Barber Shop!");
                            }
                               
                            //Tells computer if the User responds with correct trigger than the following should run
                            else if (barber3.equals ("done")){
                                    System.out.println("Thank you for shopping at the Holy Rolly Barber Shop!");
                            }
                    }
                    
                    //Tells computer if the User responds with correct trigger than the following should run
                    else if (barber2.equals ("CutHair")){
                            System.out.println("ok, what lenght do you want to cut you hair to");
                            Length = keyedInput.next();
                            System.out.println("Okay, your hair will be cut " + Length);
                            Total = Total +5*DISCOUNT;
                            UserTotal = UserTotal - 5*DISCOUNT;
                            System.out.println("your total is $" + Total + ", leaving you with " + UserTotal);
                            System.out.println("Thank you for shopping at the Holy Rolly Barber Shop!");
                            System.out.println("Would you like to Dye your Hair too?(DyeHair, Done)");
                            barber3 = keyedInput.next();
                            
                            //Tells computer if the User responds with correct trigger than the following should run    
                             if (barber3.equals ("DyeHair")){
                                System.out.println("Ok, what colour would you like to dye your hair to?");
                                DyeColour = keyedInput.nextLine();
                                System.out.println("Your hair will be dyed to the colour " + DyeColour);
                                Total = Total +10*DISCOUNT;
                                UserTotal = UserTotal - 10*DISCOUNT;
                                System.out.println("your total is $" + Total + ", leaving you with " + UserTotal);
                            }    
                                    
                        //Tells computer if the User responds with correct trigger than the following should run    
                        else if (barber3.equals ("Done")){
                                System.out.println("Thank you for shopping at the Holy Rolly Barber Shop");
                        }
                    }     
                       
                    //Tells computer if the User responds with correct trigger than the following should run
                    else if (barber2.equals ("Done")){
                        System.out.println("Thank you for shopping at the Holy Rolly Barber Shop!");
                    }
            }
                       
                        
               //Asks the User what the computer should do next
               System.out.println("Would you like to go to go to the Makeup Store, or got straight to the Photo shoot(MakeupStore/Ready)");
               barber4 = keyedInput.next();
                
               //Tells computer if the User responds with correct trigger than the following should run     
               if (barber4.equals ("MakeupStore")){
                        System.out.println("Welcome to the Milly Makeup Mart!");
                        System.out.println("Would you like ($5)Eyeliner, ($10)Contour, or ($5)LipStick(EyeLiner,Contour, LipStick)");
                        Makeup1 = keyedInput.next();
                        
                        //Tells computer if the User responds with correct trigger than the following should run    
                        if (Makeup1.equals ("EyeLiner")){
                                System.out.println("okay, What colour would you like the eye Liner");
                                EyeLiner = keyedInput.next();
                                System.out.println("Your " + EyeLiner + " eye Liner has been applied");
                                MakeupTotal = MakeupTotal +5;
                                UserTotal = UserTotal - 5;
                                System.out.println("your total is $" + MakeupTotal + ", leaving you with " + UserTotal);
                                System.out.println("Would you like to Contour, or apply Lipstick? (Contour, LipStick, Done");
                                Makeup2 = keyedInput.next();
                                    
                                //Tells computer if the User responds with correct trigger than the following should run    
                                if (Makeup2.equals ("Contour")){
                                        System.out.println("Your face will be contoured");
                                        MakeupTotal = MakeupTotal +10;
                                        UserTotal = UserTotal - 10;
                                        System.out.println("your total is $" + MakeupTotal + ", leaving you with " + UserTotal);
                                        System.out.println("Would you like to apply Lip Stick as well?(yes, done)");
                                        Makeup3 = keyedInput.next();
                                        
                                        //Tells computer if the User responds with correct trigger than the following should run    
                                        if (Makeup3.equals("Yes")){
                                                System.out.println("ok, what colour lipstick would you like?");
                                                LipStick = keyedInput.next();
                                                System.out.println(LipStick + " lip stick Has been applied to your lips!");
                                                MakeupTotal = MakeupTotal +5;
                                                UserTotal = UserTotal - 5;
                                                System.out.println("your total is $" + MakeupTotal + ", leaving you with " + UserTotal);
                                                System.out.println("Thank you for Shopping at Milly's Makeup Mart!");
                                        }
                                            
                                        //Tells computer if the User responds with correct trigger than the following should run
                                        else if (Makeup3.equals("done")){
                                                System.out.println("Thank you for Shopping at Milly's Makeup Mart!");
                                        }
                            
                                }
                                    
                                //Tells computer if the User responds with correct trigger than the following should run
                                else if (Makeup2.equals ("LipStick")){
                                        System.out.println("ok, what colour lipstick would you like?");
                                        LipStick = keyedInput.next();
                                        System.out.println(LipStick + " lip stick Has been applied to your lips!"); 
                                        MakeupTotal = MakeupTotal +5;
                                        UserTotal = UserTotal - 5;
                                        System.out.println("your total is $" + MakeupTotal + ", leaving you with " + UserTotal);
                                        System.out.println("Would you like to Apply Contour? (Yes, Done)");
                                        Makeup3 = keyedInput.next();
                                    
                                        //Tells computer if the User responds with correct trigger than the following should run     
                                        if (Makeup3.equals ("Yes")){
                                                System.out.println("Your face will be contoured");
                                                MakeupTotal = MakeupTotal +10;
                                                UserTotal = UserTotal - 10;
                                                System.out.println("your total is $" + MakeupTotal + ", leaving you with " + UserTotal);
                                        }
                                            
                                        //Tells computer if the User responds with correct trigger than the following should run
                                        else if (Makeup3.equals ("Done")){
                                                System.out.println("Thank you for Shopping at Milly's Makeup Mart!");
                                        }
                                        
                                }
                                    
                                //Tells computer if the User responds with correct trigger than the following should run
                                else if (Makeup2.equals("Done")){
                                        System.out.println("Thank you for Shopping at Milly's Makeup Mart!");
                                }
                            }
                        
                        //Tells computer if the User responds with correct trigger than the following should run
                        if (Makeup1.equals ("Contour")) {
                            System.out.println("Your face will be contoured");
                            MakeupTotal = MakeupTotal +10;
                            UserTotal = UserTotal - 10;
                            System.out.println("your total is $" + MakeupTotal + ", leaving you with " + UserTotal);
                            System.out.println("Would you like to apply Lip Stick, or EyeLiner as well?(LipStick, EyeLiner, done)");
                            Makeup2 = keyedInput.next();
                            
                                
                            //Tells computer if the User responds with correct trigger than the following should run
                            if (Makeup2.equals ("LipStick")){
                                    System.out.println("ok, what colour lipstick would you like?");
                                    LipStick = keyedInput.next();
                                    System.out.println(LipStick + " lip stick Has been applied to your lips!"); 
                                    MakeupTotal = MakeupTotal +5;
                                    UserTotal = UserTotal - 5;
                                    System.out.println("your total is $" + MakeupTotal + ", leaving you with " + UserTotal);
                                    System.out.println("Would you like to Apply EyeLiner? (Yes, Done)");
                                    Makeup3 = keyedInput.next();
                                        
                                    //Tells computer if the User responds with correct trigger than the following should run    
                                    if (Makeup3.equals ("Yes")){
                                            System.out.println("okay, What colour would you like the eye Liner");
                                            EyeLiner = keyedInput.next();
                                            System.out.println("Your " + EyeLiner + " eye Liner has been applied");
                                            MakeupTotal = MakeupTotal +5;
                                            UserTotal = UserTotal - 5;
                                            System.out.println("your total is $" + MakeupTotal + ", leaving you with " + UserTotal);
                                            System.out.println("Thank you for Shopping at Milly's Makeup Mart!");
                                    }    
                                        
                                    //Tells computer if the User responds with correct trigger than the following should run
                                    else if (Makeup3.equals ("Done")){
                                            System.out.println("Thank you for Shopping at Milly's Makeup Mart!");
                                    }
                            }
                                       
                            //Tells computer if the User responds with correct trigger than the following should run    
                            else if(Makeup2.equals("EyeLiner")){
                                    System.out.println("okay, What colour would you like the eye Liner");
                                    EyeLiner = keyedInput.next();
                                    System.out.println("Your " + EyeLiner + " eye Liner has been applied");
                                    MakeupTotal = MakeupTotal +5;
                                    UserTotal = UserTotal - 5;
                                    System.out.println("your total is $" + MakeupTotal + ", leaving you with " + UserTotal);
                                    System.out.println("Would you like to apply Lipstick as well(Yes, Done");
                                    Makeup3 = keyedInput.next();
                                    
                                    //Tells computer if the User responds with correct trigger than the following should run    
                                    if (Makeup3.equals ("Yes")){
                                            System.out.println("ok, what colour lipstick would you like?");
                                            LipStick = keyedInput.next();
                                            System.out.println(LipStick + " lip stick Has been applied to your lips!"); 
                                            MakeupTotal = MakeupTotal +5;
                                            UserTotal = UserTotal - 5;
                                            System.out.println("your total is $" + MakeupTotal + ", leaving you with " + UserTotal);
                                            System.out.println("Thank you for Shopping at Milly's Makeup Mart!");
                                    }
                                        
                                    //Tells computer if the User responds with correct trigger than the following should run    
                                    else if (Makeup3.equals ("Done")){
                                           System.out.println("Thank you for Shopping at Milly's Makeup Mart!"); 
                                    }
                                 
                            }
                                
                            //Tells computer if the User responds with correct trigger than the following should run
                            else if (Makeup2.equals ("done")){
                                    System.out.println("Thank you for Shopping at Milly's Makeup Mart!");   
                            } 
                    }       
                        
                        //Tells computer if the User responds with correct trigger than the following should run
                        if (Makeup1.equals("LipStick")){
                            System.out.println("ok, what colour lipstick would you like?");
                            LipStick = keyedInput.next();
                            System.out.println(LipStick + " lip stick Has been applied to your lips!"); 
                            MakeupTotal = MakeupTotal +5;
                            UserTotal = UserTotal - 5;
                            System.out.println("your total is $" + MakeupTotal + ", leaving you with " + UserTotal);
                            System.out.println("would you like to apply a contour, or EyeLiner as well?(Contour/EyeLiner/Done)");
                            Makeup2 = keyedInput.next();
                        
                            //Tells computer if the User responds with correct trigger than the following should run    
                            if (Makeup2.equals ("Contour")){
                                    System.out.println("Your face will be contoured");
                                    MakeupTotal = MakeupTotal +10;
                                    UserTotal = UserTotal - 10;
                                    System.out.println("your total is $" + MakeupTotal + ", leaving you with " + UserTotal);
                                    System.out.println("Would you also like to apply some EyeLiner?(Yes, done)");
                                    Makeup3 = keyedInput.next();
                                        
                                    //Tells computer if the User responds with correct trigger than the following should run    
                                    if (Makeup3.equals ("Yes")){
                                            System.out.println("okay, What colour would you like the eye Liner");
                                            EyeLiner = keyedInput.next();
                                            System.out.println("Your " + EyeLiner + " eye Liner has been applied");
                                            MakeupTotal = MakeupTotal +5;
                                            UserTotal = UserTotal - 5;
                                            System.out.println("your total is $" + MakeupTotal + ", leaving you with " + UserTotal);
                                    }
                                        
                                    //Tells computer if the User responds with correct trigger than the following should run
                                    else if (Makeup3.equals ("done")){
                                            System.out.println("Thank you for Shopping at Milly's Makeup Mart!");
                                    }
                            }
                                
                            //Tells computer if the User responds with correct trigger than the following should run
                            else if (Makeup2.equals ("EyeLiner")){
                                    System.out.println("okay, What colour would you like the eye Liner");
                                    EyeLiner = keyedInput.next();
                                    System.out.println("Your " + EyeLiner + " eye Liner has been applied");
                                    MakeupTotal = MakeupTotal +5;
                                    UserTotal = UserTotal - 5;
                                    System.out.println("your total is $" + MakeupTotal + ", leaving you with " + UserTotal);
                                    System.out.println("Would you also like to apply some Contour?(Yes, done)");
                                    Makeup3 = keyedInput.next();
                                        
                                    //Tells computer if the User responds with correct trigger than the following should run    
                                    if (Makeup3.equals("Yes")){
                                            System.out.println("Your face will be contoured");
                                            MakeupTotal = MakeupTotal +10;
                                            UserTotal = UserTotal - 10;
                                            System.out.println("your total is $" + MakeupTotal + ", leaving you with " + UserTotal);
                                    }
                                        
                                    //Tells computer if the User responds with correct trigger than the following should run
                                    else if (Makeup3.equals("done")){
                                            System.out.println("Thank you for Shopping at Milly's Makeup Mart!");
                                    }
                                            
                            }
                    
                            //Tells computer if the User responds with correct trigger than the following should run    
                            else if (Makeup2.equals("Done")){
                                    System.out.println("Thank you for Shopping at Milly's Makeup Mart!");
                            }
                        
                        }
                                
                    //Tells computer if the User responds with correct trigger than the following should run    
                    } else if (barber4.equals ("Ready")){
                    System.out.println("Congratulations you made it to the Photo Shoot with plenty of time to spair");
                    
                    }
                      
           } 
        
        //Calculates the Users Grand Total    
        GrandTotal = MakeupTotal+Total;
             
            //congratulates the user on completing the game
             
             System.out.println("You Spent $" + MakeupTotal + "at the Make up store, and $" + Total + "at the Hair Salon, for a grand total of $" + GrandTotal);
                
             //If the User has more than $5 remaining the following will run   
             if (UserTotal >= 5){
                    System.out.println("Since you have more than $5 to spare. Would you like to ride in a Limousine?(Yes, No)");
                    limo1 = keyedInput.next();
                    
                    //Tells computer if the User responds with correct trigger than the following should run
                    if (limo1.equals ("Yes")){
                    UserTotal = UserTotal - 5;
                    System.out.println("you took a limo to the photoshoot");
                    
                    }
                    
                    //Tells computer if the User responds with correct trigger than the following should run
                    else if (limo1.equals ("No"))
                    System.out.println("You did not take a limo to the Photoshoot");
                    
                }
                
            //if the User has less than $0 remaining the following will run 
            if (UserTotal < 0){
                    
                    UserTotal = UserTotal*-1;
                    System.out.println("Horay! You made it to the PhotoShoot");
                    System.out.println("You were over the budget by $" + UserTotal);
                    System.out.println("You lost the Game, Try again Next Time");
                }
            

            //if the User does not meet the 2 requirements the last line will run    
            else 
                System.out.println("Horay! You made it to the PhotoShoot");    
                System.out.println("You Finished with a total of $" + UserTotal);
             
        }
}      

