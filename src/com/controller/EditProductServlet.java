package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.ProductBean;
import com.dao.ProductDao;

/**
 * Servlet implementation class EditProductServlet
 */
public class EditProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// int pId = Integer.parseInt(request.getParameter("id"));
		String id = request.getParameter("id");
		int pId = 0;
		if (id != null || id != "") {

			pId = Integer.parseInt(id);
		}

		ProductBean productBean = new ProductDao().getProductById(pId);
		if (productBean != null) {

			request.setAttribute("product", productBean);
			request.getRequestDispatcher("productEdit.jsp").forward(request, response);

		}

	}

}
