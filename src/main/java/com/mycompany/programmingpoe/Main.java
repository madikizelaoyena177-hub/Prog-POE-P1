package com.mycompany.programmingpoe;

// Imports Scanner so that we can get user input
import java.util.Scanner;

 // Creates the main class       
public class Main { 
    
 // Creates Scanner for users input
    static Scanner input = new Scanner(System.in);
    
    // Stores the registered username
    static String registeredUsername;
    
    // Stores the registered password
    static String registeredPassword;
    
    // Stores the registered cellphone number
    static String registeredcellphoneNumber;
    
    // Creates the username checking method
    public static boolean checkUsername(String username){
    
        // Temporary return value
        return false;
    }      
    
    // Creates the password checking method
    public static boolean checkPasswordComplexity(String password) {
        
        //Temporary return value
        return false;
    }
    
    // Creates the cellphone checking method
    public static boolean checkCellphoneNumber(String number) {
        // Temporary return value
        return false;
    }
    
    // Creates the registration method
    public static void registerUser() {
       
        // Registration code will be added later
        
    }
    // Creates login method
    public static boolean loginUser(String username,String password) {
     return false; 
 }
  // Creates the login status method
    public static String returnLoginStatus(boolean loginSuccessful){
            
        // Temporary return message
        return "";
    }
    // Main method where the program starts 
    public static void main(String [] args) {
        
        // Calls the username method 
        checkUsername("");
       
        // Calls the password method
        checkPasswordComplexity("");
        
        // Calls the cellphone number
        checkCellphoneNumber("");
       
        // Calls the registration method
        registerUser();
      
       // Calls the login method 
       loginUser("", "");
       
       // Calls the login status method
       returnLoginStatus(false);
       
      }
    }
    
    

     
        
    
        
        
    
 
        
    
    
    
            
            
  
