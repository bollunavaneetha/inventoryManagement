package com.ims.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.ims.entity.Product;
import com.ims.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	ProductRepository productRepository;
	
	public List<Product> getAllProducts() {
		List<Product> productList = (List<Product>) productRepository.findAll();
		return productList;
	}
	
	public ResponseEntity<String> addProduct(Product product) {
		productRepository.save(product);		
		return new ResponseEntity<String>("Product is created" , HttpStatus.CREATED);
	}
	
	public Product getProduct(Integer pId){
		Product product = productRepository.findById(pId).get();
		return product;
		
	}
	
	public ResponseEntity<String> deleteProduct(Integer pId) {
		 productRepository.deleteById(pId);
		 return new ResponseEntity<String>("Product got deleted", HttpStatus.OK);
	}

	public ResponseEntity<String> updateProduct(Product product) {
		productRepository.save(product);		
		return new ResponseEntity<String>("Product is Updated" , HttpStatus.OK);
	}

		
	
	

}
