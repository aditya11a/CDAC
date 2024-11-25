package com.cdac.tester;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cdac.dao.StudentDao;
import com.cdac.dao.StudentDaoImpl;
import com.cdac.pojos.Student;

import static com.cdac.utils.DBUtils.*;

@WebServlet("/register")
public class StudentRegister extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private StudentDao studentDao;
       

	public void init(ServletConfig config) throws ServletException {
		
		try {
			openConnection();
			System.out.println("Inside init");
			studentDao = new StudentDaoImpl();	
		} catch (Exception e) {
			throw new ServletException("Exception init of Registration",e);
		}
	}

	public void destroy() {
		try {
	        studentDao.cleanUp();
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("doPost method invoked");

	    try {
	        String name = request.getParameter("name");
	        String email = request.getParameter("email");
	        String password = request.getParameter("password");
	        int age = Integer.parseInt(request.getParameter("age"));

	        System.out.println("Form Data Received: " + name + ", " + email + ", " + password + ", " + age);

	        Student student = new Student();
	        student.setName(name);
	        student.setEmail(email);
	        student.setPassword(password);
	        student.setAge(age);
	        String result = studentDao.registerStudent(student);

	        System.out.println("Database Result: " + result);
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}	
}
