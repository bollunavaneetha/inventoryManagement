package com.ims.supplier.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.ims.supplier.entity.Suppliers;
import com.ims.supplier.repository.SupplierRepository;

@Service
public class SupplierService {
	
	@Autowired
	SupplierRepository supplierRepository;
	
	public Optional<Suppliers> getSupplier(Integer sId) {
		Optional<Suppliers> supplier = supplierRepository.findById(sId);
		return supplier;
	}
	
	public List<Suppliers> getAllProducts() {
		List<Suppliers> suppList = (List<Suppliers>) supplierRepository.findAll();
		return suppList;
	}
	
	public ResponseEntity<String> createSupplier(Suppliers supplier) {
		supplierRepository.save(supplier);		
		return new ResponseEntity<String>("Supplier is created" , HttpStatus.CREATED);
	}

	public ResponseEntity<String> updateSupplier(Suppliers supplier) {
		supplierRepository.save(supplier);
		return new ResponseEntity<String>("supplier is Updated" , HttpStatus.OK);
	}

	public ResponseEntity<String> deleteSupplier(Integer sId) {
		supplierRepository.deleteById(sId);
		 return new ResponseEntity<String>("supplier got deleted", HttpStatus.OK);
	}
}
