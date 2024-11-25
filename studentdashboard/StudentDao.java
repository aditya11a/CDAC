package com.cdac.dao;

import java.sql.SQLException;
import com.cdac.pojos.Student;

public interface StudentDao {
	
	public Student fetchStudent(int studentId) throws SQLException;
	
	public String registerStudent(Student student) throws SQLException;
	
	public void cleanUp() throws SQLException;
}
