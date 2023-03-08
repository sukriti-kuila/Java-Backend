package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class SquareServlet extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
//      Request Dispatcher
//		int s = (int)req.getAttribute("square");
//		PrintWriter out = res.getWriter(); 
//		out.println("Multiplication is "+s);
		
//		URL ReWritting
//		int ans = Integer.parseInt(req.getParameter("s"));
		
//		Http Sessions
		HttpSession session = req.getSession();
		int ans =(int) session.getAttribute("square");
		
		// how to delete session
		// session.removeAttribute("square");
		
		PrintWriter out = res.getWriter(); 
		out.println("Multiplication "+ans);
	}

}
