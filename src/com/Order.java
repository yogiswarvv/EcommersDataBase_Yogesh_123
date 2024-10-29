package com;

import java.util.ArrayList;
import java.util.Iterator;

import exceptions.CostMissMatchExcpetion;
import exceptions.IdMissMatchException;
import exceptions.ProductMissMatchException;

public class Order {

	private ArrayList<Product> product = new ArrayList<Product>();
	
	private Product p;
	
	//add details
	public void addProduct(Product p)
	{
		System.out.println("Product added successfully");
		product.add(p);
	}
	
	//display product details
	public void display()
	{
		if(product.isEmpty())
		{
			System.out.println("products are not there");
		}
		else
		{
			for(Product p:product)
			{
				p.display();
			}
		}
	}
	
	
	//update category based on product name
	public void updateCategoryBasedOnProductName(String s)
	{
		boolean isFound=false;
		if(product.isEmpty())
		{
			System.out.println("products are not there");
		}
		else
		{
			for(Product p:product)
			{
				if(p.getProductName().equals(s))
				{
					System.out.println("Updated Succesfully");
					p.setCategory("Clothing");
					isFound=true;
				}
			}
		}
		if(!isFound)
		{
			throw new ProductMissMatchException();
		}
	}
	//update cost based on product
	public void updateCostBasedOnProductName(String s)
	{
		boolean isFound=false;
		if(product.isEmpty())
		{
			System.out.println("products are not there");
		}
		else
		{
			for(Product p:product)
			{
				if(p.getProductName().equals(s))
				{
					System.out.println("Updated Succesfully");
					p.setPrice(800);
					isFound=true;
				}
			}
		}
		if(!isFound)
		{
			throw new ProductMissMatchException();
		}
	}
	//display category and name based on id
	public void displayCategoryNameBasedOnId(double id)
	{
		boolean isFound=false;
		if(product.isEmpty())
		{
			System.out.println("products are not there");
		}
		else
		{
			for(Product p:product)
			{
				if(p.getProductId()==id)
				{
					System.out.println("product name : "+p.getProductName());
					System.out.println("Product category : "+p.getCategory());
					isFound=true;
				}
			}
		}
		if(!isFound)
		{
			throw new IdMissMatchException();
		}
	}
		//remove data based on price
		public void removeDataBasedOnPrice(double p2)
		{
			boolean isFound=false;
			if(product.isEmpty())
			{
				System.out.println("products are not there");
			}
			else
			{
				Iterator<Product> itr=product.iterator();
				while(itr.hasNext())
				{
					Product p=itr.next();
					if(p.getPrice()==p2)
					{
						System.out.println("Removed Succesfully");
						itr.remove();
						isFound=true;
					}
				}
			}
			if(!isFound)
			{
				throw new CostMissMatchExcpetion();
			}
		}
	
}
