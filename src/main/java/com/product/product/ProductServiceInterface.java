package com.product.product;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface ProductServiceInterface {
	public Integer addProduct(ProductDTO serviceDTO) throws ProductServiceException;
//	public ProductEntity getProduct(String prod_id);
	public List<ProductEntity> getAllProduct() throws ProductServiceException;
//	public ProductEntity updateProduct(ProductEntity p, String Id) throws ProductServiceException;
//	public void deleteProduct(String Id) throws ProductServiceException;
	
	

}
