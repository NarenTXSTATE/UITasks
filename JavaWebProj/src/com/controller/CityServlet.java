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
 * Servlet implementation class CityServlet
 */
@WebServlet("/CityServlet")
public class CityServlet extends HttpServlet {
	//private static final long serialVersionUID = 1L;
	
	private List<String> citiesList;
    
	@Override
   public void init(ServletConfig config)throws ServletException{
	  citiesList = new ArrayList<String>();
	  citiesList.add("Newyork");
	  citiesList.add("Chicago");
	  citiesList.add("Houston");
	  citiesList.add("San Fransisco");
	  citiesList.add("Seattle");
	  citiesList.add("Sydney");
	  citiesList.add("Boston");
	  citiesList.add("Denver");
	  citiesList.add("Austin");
	  citiesList.add("Atlanta");
	  citiesList.add("Nashville");
	  citiesList.add("San Antonio");
	  citiesList.add("Baltimore");
	  citiesList.add("Portland");
	  citiesList.add("Phoenix");
	  citiesList.add("Cleveland");
	  
	}
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    /*public CityServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String firstChar=request.getParameter("firstChar");
		firstChar=firstChar.toUpperCase();
		PrintWriter out =response.getWriter();
		List<String> foundList;
		foundList=new ArrayList<String>();
		for(String item:citiesList)
		{
			if(item.charAt(0)==firstChar.charAt(0)){
				foundList.add(item);
			}
		}
		if(foundList.isEmpty())
		{
			out.println("No Cities are found with this character");
		}
		else
		{
			out.println("<table>");
			for(String item:foundList)
			{
				out.println("<tr><td onmouseover=selectFunction(this) onmouseleave=leaveFunction(this) onclick=clickFunction('"+item+"')>"+item+"</td></tr>");
			}
			out.println("<table>");
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	/*protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}*/

}
