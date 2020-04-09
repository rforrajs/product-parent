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
public class CreateProductServlet extends HttpServlet {

	private static final long serialVersionUID = -1104837210399995543L;

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Integer id = Integer.parseInt(request.getParameter("id"));
		Integer price = Integer.parseInt(request.getParameter("price"));
		String name = request.getParameter("name");
		String description = request.getParameter("description");

		Product product = new Product();
		product.setId(id);
		product.setPrice(price);
		product.setName(name);
		product.setDescription(description);

		WebApplicationContext context = WebApplicationContextUtils
				.getRequiredWebApplicationContext(this.getServletContext());

		ProductBO productBo = (ProductBO) context.getBean("productBo");
		productBo.create(product);

		PrintWriter writer = response.getWriter();
		writer.println("Product created");

	}

}
