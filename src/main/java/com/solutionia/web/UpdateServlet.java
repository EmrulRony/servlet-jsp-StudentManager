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
import com.solutionia.services.StudentServiceLocal;

@WebServlet("/UpdateStudent")
public class UpdateServlet extends HttpServlet{
	@EJB
	StudentServiceLocal studentService;
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		StudentInfo studentModel = new StudentInfo();
		
		int studentId = Integer.parseInt(request.getParameter("StudentID"));
		String studentName= request.getParameter("StudentName");
		String contactNumber= request.getParameter("StudentNumber");
		Double studentCgpa= Double.parseDouble(request.getParameter("CGPA"));
		String dateStr= request.getParameter("DOB");
		Date studentDob=null;
		try {
			SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd");
			studentDob=dateFormat.parse(dateStr);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		studentModel.setStudentid(studentId);
		studentModel.setStudentname(studentName);
		studentModel.setStudentcontact(contactNumber);
		studentModel.setStudentgpa(studentCgpa);
		studentModel.setStudentdob(studentDob);
		
		studentService.updateStudent(studentModel);
		
		String msg="Successfully Updated Student";
		request.setAttribute("msg", msg);
		
		RequestDispatcher rd = request.getRequestDispatcher("update_student.jsp");
		rd.forward(request, response);
		
		
	}

}
