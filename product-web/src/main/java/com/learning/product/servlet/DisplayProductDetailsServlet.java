package com.learning.product.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.learning.product.bo.ProductBO;
import com.learning.product.dto.Product;

@WebServlet
public class DisplayProductDetailsServlet extends HttpServlet {

	private static final long serialVersionUID = 5514462642756470578L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		WebApplicationContext context = WebApplicationContextUtils
				.getRequiredWebApplicationContext(this.getServletContext());

		ProductBO productBo = (ProductBO) context.getBean("productBo");
		Product product = productBo.find(Integer.parseInt(request.getParameter("id")));
		PrintWriter writer = response.getWriter();

		writer.println("Product Details");

		String productDetails = "id : %s , name : %s, description : %s , price : %s";
		writer.println(String.format(productDetails, product.getId(), product.getName(), product.getDescription(),
				product.getPrice()));

	}

}
