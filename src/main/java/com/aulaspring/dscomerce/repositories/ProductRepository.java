package com.aulaspring.dscomerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aulaspring.dscomerce.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

	
}
