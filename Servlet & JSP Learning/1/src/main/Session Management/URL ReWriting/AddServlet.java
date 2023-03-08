package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet
{
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException //can't use any other method name
, ServletException
	{
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		int k = i+j; 
		
		int s = i*j;
//		PrintWriter out = res.getWriter(); 
//		out.println("Ans = "+ k);
		
		// Request Dispatcher
//		req.setAttribute("square", s);
		// To call the 2nd servlet we have 2 options
		// req dispatcher and req redirect
//		RequestDispatcher rd = req.getRequestDispatcher("sq"); // RequestDispatcher is Interface
//		rd.forward(req,res);
		
		// sendRedirect --> Session Management --> URL Writing
		res.sendRedirect("sq?s="+s);
	}
}
