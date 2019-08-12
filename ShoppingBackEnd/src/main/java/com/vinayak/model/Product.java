package com.vinayak.model;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Product {
	@Id
	@GeneratedValue
	private int productId;
	private String productName;
	private int quantity;
	private int price;
	@ManyToOne
	private Category Cat;
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Category getCat() {
		return Cat;
	}
	public void setCat(Category cat) {
		Cat = cat;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName="
				+ productName + ", quantity=" + quantity + ", price=" + price
				+ ", Cat=" + Cat + "]";
	}
	/*public void setPro(List<Product> l) {
		// TODO Auto-generated method stub
		
	}*/
	
}
	