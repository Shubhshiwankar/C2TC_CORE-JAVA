package Mypack;

import java.io.*;  
  
public class Throwkeyword {   
  
    //function to check if person is eligible to vote or not   
    public static void method() throws FileNotFoundException {  
  
        throw new FileNotFoundException();  
      
    }  
    //main method  
    public static void main(String args[]){  
        try 
        {  
            method();  
        }   
        catch (FileNotFoundException e)   
        {  
            e.printStackTrace();  
        }  
        System.out.println("rest of the code...");    
  }    
}   