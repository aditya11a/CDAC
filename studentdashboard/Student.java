package com.cdac.pojos;

public class Student {
	
	private int studentID;
	private String name;
	private String email;
	private String password;
	private int age;
	
	public Student() {
		
	}
	
	public Student(int studentID, String name, String email,String password, int age) {
		this.studentID = studentID;
		this.name = name;
		this.email = email;
		this.password = password;
		this.age = age;
	}

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [studentID=" + studentID + ", name=" + name + ", email=" + email + ", password=" + password
				+ ", age=" + age + "]";
	}
	
}
