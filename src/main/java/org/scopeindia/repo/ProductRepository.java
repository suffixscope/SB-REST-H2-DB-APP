package org.scopeindia.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import org.scopeindia.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

}