package com.ims.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ims.entity.Product;

import com.ims.service.ProductService;

@RestController
public class ProductController {
	        
	
	   
	@Autowired
	ProductService productService;
	
	@GetMapping("/ims/allProducts")
	public List<Product> getAllProducts() {
		List<Product> prodList = productService.getAllProducts();
		return prodList;
	}
	
	@GetMapping("/ims/getProduct/{pId}")
	public Product getProduct(@PathVariable Integer pId) {		
		return productService.getProduct(pId);		
	}
	
	@PostMapping("/ims/addProduct")
	public ResponseEntity<String> addProduct(@RequestBody Product product) {			
		return productService.addProduct(product);
	}
	
	@PutMapping("/ims/updateProduct")
	public ResponseEntity<String> updateProduct(@RequestBody Product product){		
		return productService.updateProduct(product);
		//return new ResponseEntity<String>("Product is Updated", HttpStatus.OK);	
	}
	
	@DeleteMapping("/ims/deleteProduct/{pId}")
	public ResponseEntity<String> deleteProduct(@PathVariable Integer pId){
		return productService.deleteProduct(pId);
				
	}
	
	

}
