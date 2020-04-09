package com.learning.product.bo;

import com.learning.product.dto.Product;

public interface ProductBO {
	
	 void create(Product product);
	 
	 Product find(int id);

}
