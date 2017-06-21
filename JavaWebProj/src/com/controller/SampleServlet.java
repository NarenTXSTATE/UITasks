package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SampleServlet
 */
@WebServlet("/sampleServ")
public class SampleServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out =response.getWriter();
		out.println("<h2 align=center>This is HTTPServlet</h2>");
		
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		
		System.out.println("Username: " +username);
		System.out.println("Password: " +password);
		
	}

}
