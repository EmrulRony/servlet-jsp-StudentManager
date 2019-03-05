package com.solutionia.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.ejb.EJB;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.solutionia.model.Student;
import com.solutionia.services.StudentService;
import com.solutionia.services.StudentServiceLocal;

@WebServlet("/InsertServlet")
public class InsertServlet extends HttpServlet{
	@EJB
	StudentServiceLocal studentService;
	Student student = new Student();
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

		String strId = request.getParameter("StudentID");
		String strPhone = request.getParameter("StudentNumber");
		String strCGPA = request.getParameter("CGPA");
		Date date = null;
		
		int studentId = Integer.parseInt(strId);
		String studentName = request.getParameter("StudentName");
		int studentContact= Integer.parseInt(strPhone);
		float cgpa = Float.parseFloat(strCGPA);
		
		student.setStudentid(studentId);
		student.setStudentname(studentName);
		student.setContactNumber(studentContact);
		student.setCgpa(cgpa);
		
		studentService.insertStudent(student);
		
		PrintWriter out = response.getWriter();
		
		out.println("<html>");
		out.println("<head><title>Data Insertion Completed</title></head>");
		out.println("<body>");
		out.println("<h1>Data insertion Completed</h1>");
		out.println("<a href='ListServlet'>Check database after insertion</a><br>");
		out.println("<a href='index.jsp'>Return to main page</a>");
		out.println("</body>");
		out.println("</html>");
			
		
	}

}
