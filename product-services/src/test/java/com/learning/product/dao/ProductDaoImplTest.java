package com.learning.product.dao;

import static org.junit.Assert.*;
import org.junit.Test;
import com.learning.product.dto.Product;

public class ProductDaoImplTest {

	@Test
	public void test() {
		ProductDao dao = new ProductDaoImpl();
		Product product = new Product();
		
		product.setId(1);
		product.setName("Iphone");
		product.setDescription("Awesome");
		product.setPrice(800);
		
		dao.create(product);
		Product result = dao.read(1);
		
		assertNotNull(result);
		assertEquals("Iphone", result.getName());
		
	}

}
