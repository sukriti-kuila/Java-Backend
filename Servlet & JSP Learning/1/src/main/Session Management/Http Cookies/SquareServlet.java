package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;



import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import jakarta.servlet.http.Cookie;

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
//		HttpSession session = req.getSession();

		// how to delete session
		// session.removeAttribute("square");
		
//		int ans =(int) session.getAttribute("square");
		
//		Http Cookies
		int ans = 0;
		Cookie cookies[] = req.getCookies();
		for (Cookie c : cookies)
		{
			if(c.getName().equals("square"))
				ans = Integer.parseInt(c.getValue());
		}
		PrintWriter out = res.getWriter(); 
		out.println("Square "+ans);
	}

}
