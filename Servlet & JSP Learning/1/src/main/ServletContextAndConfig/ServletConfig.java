package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		PrintWriter out = res.getWriter();
//		ServletContext ctx = getServletContext();
//		String n = ctx.getInitParameter("Name"); // "name" value is mentioned in web.xml
		ServletConfig cg = getServletConfig();
		String n = cg.getInitParameter("name");
		out.print("Hi "+ n);
	}
}
