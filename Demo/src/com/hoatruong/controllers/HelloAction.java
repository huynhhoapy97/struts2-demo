package com.hoatruong.controllers;

import com.hoatruong.models.*;
import java.util.*;

public class HelloAction {
	
	private String fullName;
	private Product product;
	private List<Product> productList;
	
	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	
	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	
	
	public List<Product> getProductList() {
		return productList;
	}

	public void setProductList(List<Product> productList) {
		this.productList = productList;
	}

	public String execute() {
		
		System.out.println("Xin chào execute");
		
		this.fullName = "Trương Huỳnh Hòa";

		this.product = new Product(1, "Iphone 11 Pro Max", "41000000");
		
		return "success";
	}
	
	public String show() {
		
		System.out.println("Xin chào show");
		this.productList = new ArrayList<Product>();
		this.productList.add(new Product(1, "Iphone", "50000000"));
		this.productList.add(new Product(2, "Samsung", "60000000"));
		this.productList.add(new Product(3, "Vertu", "70000000"));
		
		System.out.println("Số lượng: " + this.productList.size());

		System.out.println("Tui đang thay đổi code trên Local");

		
		return "success";
	}
}
