package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.ProductBean;
import com.dao.ProductDao;

/**
 * Servlet implementation class ProductController
 */
public class ProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int pPrice = Integer.parseInt(request.getParameter("txtPrice"));
		String pName = request.getParameter("txtPName");

		ProductBean productBean = new ProductBean();
		productBean.setpName(pName);
		productBean.setpPrice(pPrice);

		// create an object of dao...
		ProductDao productDao = new ProductDao();
		boolean flag = productDao.addProduct(productBean);
		if (flag == true) {

			response.sendRedirect("success.html");
		} else {
			response.sendRedirect("error.html");
		}

	}

}
