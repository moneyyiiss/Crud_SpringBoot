package com.advanceboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.advanceboot.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
