package com.coderulagam.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductsController {
	
	@GetMapping("/products")
	public String products() {
		
		return "products";
	}

}
