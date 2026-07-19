package com.aulaspring.dscomerce.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aulaspring.dscomerce.entities.Product;
import com.aulaspring.dscomerce.repositories.ProductRepository;

@RestController
@RequestMapping(value = "/products")
public class ProductController {

	@Autowired //autowired injeta productrepository nessa classe
	private ProductRepository repository;
	
	@GetMapping
	public String test() {
		Optional<Product> result = repository.findById(1L); //findbyid retorna um objeto do tipo optional
		Product product = result.get(); //o .get pega o que foi retornado no optional e passa para a variavel product
		return product.getName();
	}
}
