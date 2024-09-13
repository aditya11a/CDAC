package questionsecond;

import java.util.Scanner;

//2)	Create a base class Vehicle with attributes like make and year. Provide a 
//constructor in Vehicle to initialize these attributes. Derive a class Car 
//that has an additional attribute model and write 
//a constructor that initializes make, year, and model. 
//Write a program to create a Car object and display its details.
class Vehicle{
	String make;
	int year;
	
	Scanner sc=new Scanner(System.in);
	public Vehicle() {
		System.out.println("Enter the Manufacturing Company of Vehicle: ");
		make=sc.nextLine();
		System.out.println("Enter the Manufacturing Year of Vehicle: ");
		year=sc.nextInt();
	}
	void PrintRecord() {
		System.out.println("Manufacturing Company of Vehicle: "+make);
		System.out.println("Manufacturing Year of Vehicle:"+year);
	}
	void closeResource(){
		sc.close();
	}
}
class Car extends Vehicle{
	String model;
	Car(){
		super();
		sc.nextLine();
		System.out.println("Enter the Model of Car: ");
		model=sc.nextLine();
		
	}
	void PrintRecord(){
		super.PrintRecord();
		System.out.println("Model of Vehicle:"+model);
		
	}
}
public class Provblem2Vehicle {
	public static void main(String args[]) {
		Car c=new Car();
		c.PrintRecord();
		c.closeResource();
	}
	
}
