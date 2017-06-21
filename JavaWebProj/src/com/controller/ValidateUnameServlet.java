package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ValidateUnameServlet
 */
@WebServlet("/validateServ")
public class ValidateUnameServlet extends HttpServlet {
	
	private List<String> usernameList;
    
	@Override
   public void init(ServletConfig config)throws ServletException{
	  usernameList = new ArrayList<String>();
	  usernameList.add("naren");
	  usernameList.add("arun");
	  usernameList.add("sai");
	    
   }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username = request.getParameter("username");
		PrintWriter out =response.getWriter();
		
		if(usernameList.contains(username)){
			out.println("<font color='red'>Username is already taken</font>");
		}else{
			out.println("<font color='green'>Username is available</font>");
		}
		

	}


}