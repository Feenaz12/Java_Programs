package Feenaz;

import java.util.*;
class InvalidNumException extends Exception
{  
 InvalidNumException(String s)
 {  
  super(s);  
 }  
}  
public class TestCustomException2
{  
  
   static void validate(int number)throws InvalidNumException{  
     if(number % 2 != 0)  
      throw new InvalidNumException("Not an odd number");  
     else  
      System.out.println("Its is an odd number");  
   }  
     
   public static void main(String args[])
   {
	   Scanner s=new Scanner(System.in);
	   System.out.println("Enter number ");
	   int a=s.nextInt();
      try
      {  
      validate(a);  
      }
      catch(Exception m)
      {
    	  System.out.println("Exception occured: "+m);
    	  }  
  
      System.out.println("Thank you for using this application.....");  
  }  
}
