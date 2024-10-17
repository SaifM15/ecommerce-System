package com.e_commerce.system.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.e_commerce.system.Entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
}
