package com.hy.object.practice1.model.vo;

public class Product {
	String productName;
	int price;
	String brand;
	
	public Product(String productName,int price, String brand){
		this.productName = productName;
		this.price = price;
		this.brand = brand;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public void infomation() {
		System.out.printf("%s / %d / %s\n",productName,price,brand);
	}
}
