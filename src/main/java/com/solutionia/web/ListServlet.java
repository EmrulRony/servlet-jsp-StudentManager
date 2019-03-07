package com.solutionia.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Local;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.solutionia.model.StudentInfo;
import com.solutionia.services.StudentServiceLocal;

@WebServlet("/ListStudent")
public class ListServlet extends HttpServlet{
	@EJB
	StudentServiceLocal studnetService;
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		List<StudentInfo> studentList=studnetService.listStudent();
//		PrintWriter out = response.getWriter();
//		for (StudentInfo sinfo:studentList) {
//			out.print(sinfo);
//		}
		request.setAttribute("studentList", studentList);
		RequestDispatcher rd = request.getRequestDispatcher("list_student.jsp");
		rd.forward(request, response);

	}

}
