package com.product.product;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductServiceInterface{
	
	@Autowired
	public ProductServiceRepository productServiceRepo;
	@Autowired
	public Environment environment;
	
	public Double calDiscount;
	public Double gst;
	public Double discountPrice;
	public Double deliveryCharge;

	@Override
  public Integer addProduct(ProductDTO serviceDTO) throws ProductServiceException {
		ProductEntity product=new ProductEntity();
		product.setProd_id(serviceDTO.getProd_id());
		product.setProd_name(serviceDTO.getProd_name());
		product.setProd_category(serviceDTO.getProd_category());
		product.setProd_type(serviceDTO.getProd_type());
		product.setProd_price(serviceDTO.getProd_price());
		product.setDiscount(calculateDiscount(product.getProd_price(),product.getProd_category()));
		product.setGST(calculateGST(product.getProd_price(),product.getProd_category()));
		product.setDeliveryCharge(serviceDTO.getDelivery());
		product.setFinalPrice(calculateFinalPrice(calculateDiscount(product.getProd_price(),product.getProd_category()), product.getProd_price(),product.getGST(),product.getDeliveryCharge()));
		
		return productServiceRepo.save(product).getProd_id();
	}
	
	public Double calculateDiscount(Double price, String productCategory) {
		if(productCategory.equalsIgnoreCase("electronics")) {
			calDiscount = price * 0.15;
			discountPrice =price-calDiscount;
			return calDiscount;
		} else if(productCategory.equalsIgnoreCase("homeappliances")) {
			calDiscount = price * 0.22;
			discountPrice =price-calDiscount;
			return calDiscount;
		}else if(productCategory.equalsIgnoreCase("clothing")) {
			calDiscount = price * 0.4;
			discountPrice =price-calDiscount;
			return calDiscount;
		} else if(productCategory.equalsIgnoreCase("furniture")) {
			calDiscount = price * 0.1;
			discountPrice =price-calDiscount;
			return calDiscount;
		}
		return calDiscount;
	}
	
	public Double calculateGST(Double price, String productCategory) {
		if(productCategory.equalsIgnoreCase("electronics")) {
			return gst=discountPrice*0.18;
		} else if(productCategory.equalsIgnoreCase("homeappliances")) {
			
			return gst=discountPrice*0.24;
		}else if(productCategory.equalsIgnoreCase("clothing")) {
			
			return gst=discountPrice*0.12;
		}else if(productCategory.equalsIgnoreCase("furniture")) {
			
			return gst=discountPrice*0.18;
		}
		return gst;
	}
	
	public Double calculateFinalPrice(Double discount, Double basePrice,Double gst, Integer deliveryCharge) {
		return ((basePrice-discount)+gst+deliveryCharge);
	}
	
	
	
	
//
//	@Override
//	public ProductEntity getProduct(String prod_id) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
	public List<ProductEntity> getAllProduct() throws ProductServiceException {
		List<ProductEntity> products=new ArrayList<>();
		productServiceRepo.findAll().forEach(products::add);
		return products;
	}
//
//	@Override
//	public ProductEntity updateProduct(ProductEntity p, String Id) throws ProductServiceException {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public void deleteProduct(String Id) throws ProductServiceException {
//		// TODO Auto-generated method stub
//		
//	}
	

}

