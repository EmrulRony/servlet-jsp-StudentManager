package com.solutionia.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.solutionia.services.StudentServiceLocal;

@WebServlet("/DeleteStudent")
public class DeleteServlet extends HttpServlet{
	@EJB
	StudentServiceLocal service;
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		int studentId = Integer.parseInt(request.getParameter("studentId"));
		String msg=service.deleteStudent(studentId);
		
		request.setAttribute("msg", msg);
		
		RequestDispatcher rd = request.getRequestDispatcher("delete_student.jsp");
		rd.forward(request, response);
		
	}

}
