package com;

import java.util.Random;

import exceptions.InvalidCategoryException;
import exceptions.InvalidCostException;
import exceptions.InvalidNameException;

public class Product {
	
	private int productId;
	private String productName;
	private String Description;
	private double price;
	private String Category;
	
	
	
	public Product(String productName, String description, double price, String category) {
		Random r=new Random();
		
		this.productId = r.nextInt(123456);
		if(validateName(productName))
		{
			this.productName = productName;
		}
		else
		{
			throw new InvalidNameException();
		}
		
		this.Description = description;
		if(validateCost(price))
		{
			this.price = price;
		}
		else
		{
			throw new InvalidCostException();
		}
		if(validateCategory(category))
		{
			this.Category = category;
		}
		else
		{
			throw new InvalidCategoryException();
		}
		
	}



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



	public String getDescription() {
		return Description;
	}



	public void setDescription(String description) {
		Description = description;
	}



	public double getPrice() {
		return price;
	}



	public void setPrice(double price) {
		this.price = price;
	}



	public String getCategory() {
		return Category;
	}



	public void setCategory(String category) {
		Category = category;
	}



	@Override
	public String toString() {
		return "productId=" + productId + "\n productName=" + productName + "\n Description=" + Description
				+ "\n price=" + price + "\n Category=" + Category + "\n ----------------------------";
	}
	
	public boolean validateName(String s)
	{
		char ch=s.charAt(0);
		if(ch>='A' && ch<='Z')
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public boolean validateCost(double i)
	{
		if(i >= 200 && i<= 500)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public boolean validateCategory(String s)
	{
		if(s.equals("Electronics") || s.equals("Clothing") || s.equals("Food"))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public void display()
	{
		System.out.println("Product ID : "+getProductId());
		System.out.println("Product Name : "+getProductName());
		System.out.println("Product Description : "+getDescription());
		System.out.println("Price of the Product : "+getPrice());
		System.out.println("Category of the product : "+getCategory());
	}
	
	
	
}
