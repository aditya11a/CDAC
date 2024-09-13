package questionfourth;

import java.util.Scanner;

class Student{
	String Name;
	int age;
	String standard;
	long id;
	String Division;
	Scanner sc=new Scanner(System.in);
	public Student() {
		System.out.println("Enter the name of Studet:");
		Name=sc.nextLine();
		System.out.println("Enter the Age of Studet:");
		age=sc.nextInt();
		System.out.println("Enter the unique ID number of Studet:");
		id=sc.nextLong();
		sc.nextLine();
		System.out.println("Enter the Standard of Studet:");
		Division=sc.nextLine();
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getStandard() {
		return standard;
	}
	public void setStandard(String standard) {
		this.standard = standard;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getDivision() {
		return Division;
	}
	public void setDivision(String division) {
		Division = division;
	}
	public Scanner getSc() {
		return sc;
	}
	public void setSc(Scanner sc) {
		this.sc = sc;
	}
	void PrintRecord() {
		System.out.println("Enter the name of Studet:"+Name);
		System.out.println("Enter the Age of Studet:"+age);
		System.out.println( "The unique ID number of Studet is :"+Division	);
		Division=sc.nextLine();
	}
}
	

public class Problem4 {

	public static void main(String[] args) {

		Student c=new Student();
		c.PrintRecord();
	}

}
