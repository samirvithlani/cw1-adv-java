package com.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet Filter implementation class CountFilter
 */
public class CountFilter implements Filter {

	int count = 0;

	/**
	 * Default constructor.
	 */
	public CountFilter() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see Filter#destr oy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here

		// pass the request along the filter chain
		System.out.println("filter called.....");
		count++;
		if (count >= 50) {
			HttpServletResponse res = (HttpServletResponse) response;
			res.sendError(429);
			chain.doFilter(request, response);
		}
		
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {

		System.out.println("filetr init called....");
	}

}
