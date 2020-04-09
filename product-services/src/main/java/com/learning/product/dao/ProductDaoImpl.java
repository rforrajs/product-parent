package com.learning.product.dao;

import java.util.HashMap;
import java.util.Map;

import com.learning.product.dto.Product;

public class ProductDaoImpl implements ProductDao{
	
	Map<Integer, Product> map = new HashMap<Integer, Product>();

	@Override
	public void create(Product product) {
		map.put(product.getId(), product);
		
	}

	@Override
	public Product read(int id) {
		return map.get(id);
	}

	@Override
	public void update(Product product) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

}
