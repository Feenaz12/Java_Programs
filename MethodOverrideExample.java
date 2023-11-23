package Assignments;



class Animal
{
void sound()
{
System.out.println("The animal makes a sound");
}
}

class Dog extends Animal
{
void sound()
{
System.out.println("It Barks");
}
}

class Cat extends Animal
{
void sound()
{
	System.out.println("It Meows");
}
}



public class MethodOverrideExample {

	public static void main(String[] args) {
		Animal obj1=new Dog(); //runtime polymorphism
		Animal obj2=new Cat();
		obj1.sound();
		obj2.sound();

	}

}