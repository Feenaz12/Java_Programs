package Feenaz;


class Box<T>
{
	T length;
	T breadth;
	
	void set(T length,T breadth)
	{
		this.length=length;
		this.breadth=breadth;
	}
	T getL()
	{
		return length;
	}
	T setL(T length)
	{
		return length;
	}
	T getB() 
	{
		return breadth;
		
	}
	T setB(T breadth)
	{
		return breadth;
	}
	
}
public class GenericClassBox 
{

	public static void main(String[] args)
	{
		Box <Integer> obj1=new Box<Integer>();
		obj1.set(5, 6);
		
		System.out.println("These are integer Box values..."+"length : " + obj1.getL() + " breadth: " + obj1.getB());
		
		Box <Double> obj2=new Box<Double>();
		obj2.set(5.3, 6.7);
		
		System.out.println("These are Double Box values..."+"length: " + obj2.getL() + " breadth: " + obj2.getB());
	}

}

