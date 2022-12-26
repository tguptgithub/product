package com.product.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/ProductService")
public class ProductServiceAPI {
	@Autowired
	private ProductServiceInterface productServiceImpl;
	private Environment environment;
	@GetMapping("/products")
	public ResponseEntity<List<ProductEntity>> getAllProduct() throws ProductServiceException {
		return new ResponseEntity<>(productServiceImpl.getAllProduct(),HttpStatus.OK);
		
	}
	
	@PostMapping("/addProduct")
	public ResponseEntity<String> addProduct(@RequestBody ProductDTO serviceDTO) throws ProductServiceException{
		int prodId=productServiceImpl.addProduct(serviceDTO);
		return new ResponseEntity<String>(String.valueOf(prodId), HttpStatus.CREATED);
	}

}
