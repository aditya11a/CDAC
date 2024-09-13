package Problem5;

import java.util.Scanner;

abstract class Vehicle{
	String manufacturerName;
	int year;
	
	Scanner sc=new Scanner(System.in);
	public Vehicle() {
		System.out.println("Enter the Manufacturing Company of Vehicle: ");
		manufacturerName=sc.nextLine();
		System.out.println("Enter the Manufacturing Year of Vehicle: ");
		year=sc.nextInt();
		}
		abstract void startEngine();
			
		abstract void stopEngine();
		
		void ResoursseClose() {
			sc.close();
		}
		
}
class Car extends Vehicle{
	Car(){
		super();
	}
	void startEngine() {
		System.out.println("For starting the car press clutch and press start engine button");
	}
	void stopEngine() {
		System.out.println("By pressing start engine button again we can stop engine");
	}
	
	
}
class MotorCycle extends Vehicle{
	MotorCycle(){
		super();
	}
	void startEngine() {
		System.out.println("For starting the MotorCycle switch on the keys of MotorCycle & press powerstart  button");
	}
	void stopEngine() {
		System.out.println("By releasing clutch fully MotorCycle will come to off state");
	}
	
	
}
public class ProblemVehicle {

	public static void main(String[] args) {
		Car c=new Car();
		c.startEngine();
		c.stopEngine();
		
		MotorCycle m=new MotorCycle();
		m.startEngine();
		m.stopEngine();
		
		m.ResoursseClose();
		
	}

}
