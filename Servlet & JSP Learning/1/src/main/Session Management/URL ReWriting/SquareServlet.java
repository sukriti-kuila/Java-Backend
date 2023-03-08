package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class SquareServlet extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
//      Request Dispatcher
//		int s = (int)req.getAttribute("square");
//		PrintWriter out = res.getWriter(); 
//		out.println("Multiplication is "+s);
		
		int ans = Integer.parseInt(req.getParameter("s"));
		PrintWriter out = res.getWriter(); 
		out.println("Multiplication "+ans);
	}

}
