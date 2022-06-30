package com.advanceboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.advanceboot.entity.Product;
import com.advanceboot.repository.ProductRepository;

@RestController
@RequestMapping("/products")
public class ProductController {
	@Autowired
	private ProductRepository productRepository;
	
	@PostMapping
	public ResponseEntity<Product> createProduct(@RequestBody Product product){
		return ResponseEntity.ok(productRepository.save(product));
	}
	@GetMapping
	public ResponseEntity<List<Product>> getProductList(){
		return ResponseEntity.ok(productRepository.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Product> findProduct(@PathVariable Integer id){
		return ResponseEntity.ok(productRepository.findById(id).get());
	}
	
}
