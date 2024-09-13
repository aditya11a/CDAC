package questionThird;

import java.util.Scanner;

//3)Create a base class Animal with attributes like name, and methods like eat() and sleep(). 
//Create a subclass Dog that inherits from Animal and has an additional method bark(). 
//Write a program to demonstrate the use of inheritance by creating objects of Animal and Dog and calling their methods.
class Animal{
	String name;
	Scanner c=new Scanner(System.in);
	Animal() {
		System.out.println("Enter the name of animal:");
		name=c.nextLine();
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	void eat() {
		System.out.println(name+" eats food");
	}
	void sleep() {
		System.out.println(name+" sleeps at night");
	}
	
}
class dog extends Animal{
	void bark() {
		System.out.println(name+" barks");
	}
}
public class ProblemAnimal {

public static void main(String[] args) {
		
		dog a=new dog();
		a.sleep();
		a.eat();
		a.bark();
	}
	public static void main1(String[] args) {
		
		Animal a=new Animal();
		a.sleep();
		a.eat();
	}

}
