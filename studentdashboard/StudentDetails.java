package com.cdac.tester;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cdac.dao.StudentDaoImpl;
import com.cdac.pojos.Student;

import static com.cdac.utils.DBUtils.*;

@WebServlet("/details")
public class StudentDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private StudentDaoImpl studentDao;
       
    
    public StudentDetails() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	public void init(ServletConfig config) throws ServletException {
		
		try {
			System.out.println("Init");
			openConnection();
			studentDao = new StudentDaoImpl();
		}catch(Exception e){
			throw new ServletException("Exception init", e);
		}
	}

	
	public void destroy() {
		try {
	        studentDao.cleanUp();
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		try{
			
			String studentIdParam = request.getParameter("studentId");
	        if (studentIdParam == null || studentIdParam.isEmpty()) {
	            response.getWriter().println("<h3>Error: Student ID is required!</h3>");
	            return;
	        }
			
			// Get the studentID
			int studentId = Integer.parseInt(request.getParameter("studentId"));
			
			//Fetch student details
			Student student =  studentDao.fetchStudent(studentId);
			
			//show the details 
			
			response.getWriter().println("<h1>Student Details</h1>");
			response.getWriter().println("<p>ID: "+student.getStudentID() +"</p>");
			response.getWriter().println("<p>Name: "+student.getName() +"</p>");
			response.getWriter().println("<p>Email: "+student.getEmail() +"</p>");
			response.getWriter().println("<p>Age: "+student.getAge() +"</p>");
			
		}catch(Exception e) {
			throw new ServletException("Exception in doGet",e);
		}
	}

}
