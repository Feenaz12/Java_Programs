package Feenaz;
import java.util.*;
import java.util.stream.Collectors;


public class FilterMethodExample {

	public static void main(String[] args) {
		 List<Integer> list=new ArrayList<Integer>();  
	       /* list.add(1);  
	        list.add(2);  
	        list.add(3);  
	        list.add(4);
	        list.add(5);
	        list.add(6);
	        list.add(7);*/
	        
	        List<Integer> numbers = Arrays.asList(1,7,9,5,6,8);
	        List<Integer> evenNumbers = numbers.stream().filter(number -> number % 2 == 0).collect(Collectors.toList());
	        List<Integer> oddNumbers = numbers.stream().filter(number -> number % 2 != 0).collect(Collectors.toList());
	        System.out.println("Even Numbers are:"+evenNumbers);
	        System.out.println("Odd Numbers are:"+oddNumbers);

	}

}
