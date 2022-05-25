package interfaces;

public class InterfaceJava8 {

	public static void main(String[] args) 
	{
	
		Dog dog=new Dog();
		dog.eat();
		dog.walk();
		dog.born();
	}

}




interface animal
{
	default void eat()
	{
		System.out.println("Animal can eat ");
	}
	default void walk()
	{
		System.out.println("Animal can walk ");
	}
	
	static void born()
	{
		System.out.println("Animal is Born ");
	}
}

interface bird
{
	default void eat()
	{
		System.out.println("bird can eat ");
	}
	default void walk()
	{
		System.out.println("bird can walk ");
	}
	default void born()
	{
		System.out.println("birds are born from eggs ");
	}
}

class Dog implements animal,bird
{
	public void eat()
	{
		animal.super.eat();
	}
	
	public void walk()
	{
		bird.super.walk();
	}
	
	public void born()
	{
		animal.born();
	}
}
