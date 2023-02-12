package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Sum
 */
public class Sum extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// intger
		String name = request.getParameter("txtName");
		
		int no1 = Integer.parseInt(request.getParameter("txtNo1"));
		int no2 = Integer.parseInt(request.getParameter("txtNo2"));

		System.out.println("no1 =" + no1);
		System.out.println("no1 =" + no2);

		int sum = no1 + no2;
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<h1>name= " + name + "</h1>");
		out.print("<h1>no1 = " + no1 + "</h1>");
		out.print("<h1>no1 = " + no2 + "</h1>");
		out.print("<h1>sum = " + sum + "</h1>");
		out.close();

	}

}
