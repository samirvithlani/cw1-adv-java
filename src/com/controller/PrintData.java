package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PrintData
 */
public class PrintData extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//System --> class
		//out  ==> printStream
		//println method///
		//HTML FILE...
		//file only....
		//mime set--->
		Scanner sc = new Scanner(System.in);
		
		int x = 100;
		System.out.println("enter value of a");
		int a = sc.nextInt();
		System.out.println("enter value of b");
		int b = sc.nextInt();
		
		int c = a + b;
		
		//age -->
		//18>= red
		//18< blue
				
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("hello world...");
		out.print("x = "+x);
		out.print("<font color ='red';size ='20px'>HELLo</font>");
		out.close();
		
	}

}
