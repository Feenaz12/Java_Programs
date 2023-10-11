package Feenaz;

import java.util.*;

 class Book {
	int Id,quantity;
	String name;
	String AuthorName;
	String Publisher;
	
	Book(int Id,int quantity,String name,String AuthorName,String Publisher)
	{
		this.Id=Id;
		this.quantity=quantity;
		this.name=name;
		this.AuthorName=AuthorName;
		this.Publisher=Publisher;
		
	}
	
	}
	 public class BookStore{
	public static void main(String[] args) {
		
		 HashMap<Integer, Book> map = new HashMap<Integer,Book>();

	        
	        Book book1 = new Book(101, 20, "physics", "Author1", "Publisher1");
	        Book book2 = new Book(102, 21, "chemistry", "Author2", "Publisher2");
	        map.put(1,book1);    
		    map.put(2,book2);
		    for(Map.Entry<Integer, Book> m:map.entrySet()){
		    	int key=m.getKey();
		    	Book b=m.getValue();  
			       
			       System.out.println(b.Id +" " + b.AuthorName + " " + b.name + " " + b.quantity + " " + b.Publisher);
		    
	        
	}

}
	 }




