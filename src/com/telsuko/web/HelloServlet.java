package com.telsuko.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class HelloServlet extends HttpServlet

{
@Override

	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
	System.out.println("Hello World");
	PrintWriter out= res.getWriter();
	out.println("Hello World");
	}
}