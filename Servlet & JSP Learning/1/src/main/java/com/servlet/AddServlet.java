package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet
{
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException //can't use any other method name
	{
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		int k = i+j;
//		System.out.println(k);
		PrintWriter out = res.getWriter();
		out.println(k);
		
	}
}

// another process
// import java.io.*;
// import javax.servlet.*;
// import javax.servlet.http.*;

// public class HelloWorldServlet extends HttpServlet {
//   public void doGet(HttpServletRequest request, HttpServletResponse response) 
//     throws ServletException, IOException {
//     response.setContentType("text/html");
//     PrintWriter out = response.getWriter();
//     out.println("<html><body>");
//     out.println("<h1>Hello World!</h1>");
//     out.println("</body></html>");
//   }
// }

