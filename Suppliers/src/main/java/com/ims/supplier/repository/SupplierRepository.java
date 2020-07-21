package com.ims.supplier.repository;

import org.springframework.data.repository.CrudRepository;

import com.ims.supplier.entity.Suppliers;

public interface SupplierRepository extends CrudRepository<Suppliers, Integer> {

}
