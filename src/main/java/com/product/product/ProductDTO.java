package com.product.product;

public class ProductDTO {
	private Integer prod_id;
	private String prod_name;
	private String prod_type;
	private String prod_category;
	private Double prod_price;
	private Double discount;
	private Double finalPrice;
	private Integer delivery;
	private Double GST;
	public ProductDTO() {
		
	}
	public Integer getProd_id() {
		return prod_id;
	}
	public void setProd_id(Integer prod_id) {
		this.prod_id = prod_id;
	}
	public String getProd_name() {
		return prod_name;
	}
	public void setProd_name(String prod_name) {
		this.prod_name = prod_name;
	}
	public String getProd_type() {
		return prod_type;
	}
	public void setProd_type(String prod_type) {
		this.prod_type = prod_type;
	}
	public String getProd_category() {
		return prod_category;
	}
	public void setProd_category(String prod_category) {
		this.prod_category = prod_category;
	}
	public Double getProd_price() {
		return prod_price;
	}
	public void setProd_price(Double prod_price) {
		this.prod_price = prod_price;
	}
	public Double getDiscount() {
		return discount;
	}
	public void setDiscount(Double discount) {
		this.discount = discount;
	}
	public Double getFinalPrice() {
		return finalPrice;
	}
	public void setFinalPrice(Double finalPrice) {
		this.finalPrice = finalPrice;
	}
	public Integer getDelivery() {
		return delivery;
	}
	public void setDelivery(Integer delivery) {
		this.delivery = delivery;
	}
	public Double getGST() {
		return GST;
	}
	public void setGST(Double gST) {
		GST = gST;
	}
	@Override
	public String toString() {
		return "ProductDTO [prod_id=" + prod_id + ", prod_name=" + prod_name + ", prod_type=" + prod_type
				+ ", prod_category=" + prod_category + ", prod_price=" + prod_price + ", discount=" + discount
				+ ", finalPrice=" + finalPrice + ", delivery=" + delivery + ", GST=" + GST + "]";
	}
	

}
