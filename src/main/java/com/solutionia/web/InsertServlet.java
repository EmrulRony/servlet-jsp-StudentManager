package com.solutionia.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.solutionia.model.StudentInfo;
import com.solutionia.services.StudentService;
import com.solutionia.services.StudentServiceLocal;

@WebServlet("/InsertServlet")
public class InsertServlet extends HttpServlet{
	@EJB
	StudentServiceLocal studentService;
	StudentInfo student = new StudentInfo();
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

		String strId = request.getParameter("StudentID");
		String strCGPA = request.getParameter("CGPA");
		String dateStr = request.getParameter("DOB");
		Date date=null;
		
		int studentId = Integer.parseInt(strId);
		String studentName = request.getParameter("StudentName");
		String strPhone = request.getParameter("StudentNumber");
		Double cgpa = Double.parseDouble(strCGPA);
		
		try {
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
			date = dateFormat.parse(dateStr);
			System.out.println("date "+dateStr);
		}
		catch (Exception e) {
			System.out.println(e);
		}
		

		student.setStudentid(studentId);
		student.setStudentname(studentName);
		student.setStudentcontact(strPhone);
		student.setStudentgpa(cgpa);
		student.setStudentdob(date);
		
		studentService.insertStudent(student);
		
		request.setAttribute("msg", "Insertion Successfull!!");
	    RequestDispatcher rd = request.getRequestDispatcher("insert.jsp");
	    rd.forward(request, response);
		
	}

}
