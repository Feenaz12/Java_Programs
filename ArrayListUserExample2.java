package Feenaz;

import java.util.*;


class ProductDetails
{
	int P_Id;
	String P_name;
	double Price;
	ProductDetails(int P_Id,String P_name,double Price)
	{
		this.P_Id=P_Id;
		this.P_name=P_name;
		this.Price=Price;
		
	}

}
class Customer 
{
	int C_Id,MobileNumber;
	String Password;
	
	Customer(int C_Id,String Password,int MobileNumber)
	{
		this.C_Id=C_Id;
		this.Password=Password;
		this.MobileNumber=MobileNumber;
		
	}

}
public class ArrayListUserExample2
{

	public static void main(String[] args) 
	{
		List<ProductDetails> a1=new ArrayList<ProductDetails>();
		ProductDetails p1=new ProductDetails(101,"AAA",98.9);
		ProductDetails p2=new ProductDetails(102,"bsj",93.5);
		
		a1.add(p1);
		a1.add(p2);
		for(ProductDetails p:a1)
		{
			System.out.println("product details: " + p.P_Id +" "+p.P_name+" "+p.Price);
		}

		List<Customer> b1=new ArrayList<Customer>();
		Customer c1=new Customer(101,"feenaz",98777);
		Customer c2=new Customer(102,"tshhcs",938976);
		
		b1.add(c1);
		b1.add(c2);
		for(Customer c:b1)
		{
			System.out.println("Customer details: " + c.C_Id +" "+c.Password+" "+c.MobileNumber);
		}

	}

}