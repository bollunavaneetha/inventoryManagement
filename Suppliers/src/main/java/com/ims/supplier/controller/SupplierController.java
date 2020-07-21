package com.ims.supplier.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ims.supplier.entity.Suppliers;
import com.ims.supplier.service.SupplierService;

@RestController
public class SupplierController {
	
	@Autowired
	SupplierService supplierService;

	@GetMapping("/supplier/{sId}")
	public Optional<Suppliers> getSupplier(@PathVariable Integer sId) {
	    return supplierService.getSupplier(sId);
	}
	

	@GetMapping("/supplier/getAllsuppliers")
	public List<Suppliers> getAllsuppliers() {
		List<Suppliers> suppList = supplierService.getAllProducts();
		return suppList;
	}
	
	
	@PostMapping("/supplier/createSupp")
	public ResponseEntity<String> createSupplier(@RequestBody Suppliers supplier) {			
		return supplierService.createSupplier(supplier);
	}
	
	@PutMapping("/supplier/updateSupplier")
	public ResponseEntity<String> updateSupplier(@RequestBody Suppliers supplier){		
		return supplierService.updateSupplier(supplier);
	}
	
	
	@DeleteMapping("/supplier/deleteSupplier/sId}")
	public ResponseEntity<String> deleteSupplier(@PathVariable Integer sId){
		return supplierService.deleteSupplier(sId);
				
	}
	




	

	
}
