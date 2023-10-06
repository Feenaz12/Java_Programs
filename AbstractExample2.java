package Feenaz;

abstract class Add

{
	float sum;
	Add()
	{
		System.out.println("Welcome");
	}
	
	abstract float add1(float a,float b); //abstract method 1
	
	 
	 abstract float add2(float a,float b,float c); //abstract method 2
		
	 
	
}

class operation extends Add
{
	float add1(float a,float b) //overriding
	{
		float sum= a+b;
		return sum;
	}

	
	float add2(float a,float b,float c) {
		
		float sum= a+b+c;
		return sum;
		
	}
	
}


public class AbstractExample2 
{

	public static void main(String[] args)
	{
		operation ob=new operation();//runtime polymorphism
		float total1=ob.add1(2, 4);
		System.out.println("This is first operation "+total1);
		float total2=ob.add2(3,4,5);
		System.out.println("This is first operation "+total2);
		
		
	}

}