package com.ims.repository;

import org.springframework.data.repository.CrudRepository;

import com.ims.entity.Product;

public interface ProductRepository extends CrudRepository<Product, Integer> {

}
