package com.example.FirstSpringBootWebProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
	
	@Autowired
	ProductRepository repository;
	
	public Product getProductById(Integer i){
		Product p = repository.findOne(i);
		return p;
	}

}
