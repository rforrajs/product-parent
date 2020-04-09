package com.learning.product.bo;

import com.learning.product.dao.ProductDao;
import com.learning.product.dto.Product;

public class ProductBOImpl implements ProductBO {
	
	private ProductDao dao;

	@Override
	public void create(Product product) {
		dao.create(product);
	}

	@Override
	public Product find(int id) {
		return dao.read(id);
	}

}
