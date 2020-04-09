package com.learning.product.dao;

import com.learning.product.dto.Product;

public interface ProductDao {
	
	void create(Product product);
	
	Product read(int id);
	
	void update(Product product);
	
	void delete(int id);

}
