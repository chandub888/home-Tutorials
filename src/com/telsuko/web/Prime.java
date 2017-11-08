package com.telsuko.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/Prime")


public class Prime extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException
	{

		PrintWriter out = res.getWriter();
		int n= 19;//Integer.parseInt(req.getParameter("t1"));
		int i, m=0,flag=0;
		m=n/2;
		 for(i=2;i<=m;i++){   
		 if(n%i==0){    
			   out.println("Number is not prime");    
			   flag=1;    
			   break;    
			   }    
			  }    
			  if(flag==0)    
			  out.println("Number is prime");    
			}  
		 
}

