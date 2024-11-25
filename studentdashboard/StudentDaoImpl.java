package com.cdac.dao;

import java.sql.*;

import com.cdac.pojos.Student;

import static com.cdac.utils.DBUtils.*;

public class StudentDaoImpl implements StudentDao {
	
	private PreparedStatement pst; 
	private PreparedStatement pst1;
	private Connection connection;
	
	public StudentDaoImpl() throws SQLException{
		//openConnection();
		connection = getConnection();
		
		pst = connection.prepareStatement("SELECT * FROM students WHERE studentid=?");
		pst1 = connection.prepareStatement("INSERT INTO students(name, email, password, age) VALUES(?,?,?,?)");
	}

	@Override
	public Student fetchStudent(int studentId) throws SQLException {
		pst.setInt(1, studentId);
		try(ResultSet rst = pst.executeQuery()){
			
			if(rst.next()) {
				return new Student(rst.getInt(1), rst.getString(2),rst.getString(3),
						rst.getString(4),rst.getInt(5));
			}
		}
		return null;
	}

	@Override
	public String registerStudent(Student student) throws SQLException {
		pst1.setString(1, student.getName());
		pst1.setString(2, student.getEmail());
		pst1.setString(3, student.getPassword());
		pst1.setInt(4, student.getAge());
		
		int rs = pst1.executeUpdate();
		if(rs==1)
			return "Registration Success";
		else
			
		return "Unsuccessfull Entry";
	}

	@Override
	public void cleanUp() throws SQLException {
		pst.close();
		pst1.close();
		closeConnection();
	}

}
