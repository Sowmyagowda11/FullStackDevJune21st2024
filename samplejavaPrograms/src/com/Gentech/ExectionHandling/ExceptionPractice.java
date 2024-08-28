package com.Gentech.ExectionHandling;



public class ExceptionPractice   
{ 
	public static void main(String args[])
    {  
        
        validate(13);  
        System.out.println("rest of the code...");    
  } 
    public static void validate(int age) 
    {  
        if(age<18) 
        {  
            
            throw new ArithmeticException("Person is not eligible to vote");    
        }  
        else 
        {  
            System.out.println("Person is eligible to vote!!");  
        }  
    }  
      
      
}

