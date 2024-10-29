package com;

import java.util.Scanner;



public class MainApp {

	public static void main(String[] args) {
		
		String s1;
		String s2;
		double cost;
		String s3;
		
		
		Order r=new Order();
		Scanner s=new Scanner(System.in);
		
		boolean isStart=true;
		
		while(isStart)
		{
			System.out.println("Enter the choice : \n 1.To Add the product details \n 2.Display product details \n 3.update category based on product name \n 4.update cost based on product name \n 5.display category and name based on product id \n 6.Remove product details by price\n 7.Exit");
			int ch=s.nextInt();
			switch (ch) {
            case 1: {
                System.out.println("Enter the product name:");
                s1 = s.next();
                System.out.println("Enter the description about the product:");
                s2 = s.next();
                System.out.println("Enter the price of the product:");
                cost = s.nextInt();
                System.out.println("Enter the category of the product:");
                s3 = s.next();
                r.addProduct(new Product(s1, s2, cost, s3));
            }
            break;
            case 2: {
                r.display();
            }
            break;

            case 3: {
                System.out.println("Enter the product name:");
                String s8 = s.next();
                r.updateCategoryBasedOnProductName(s8);
            }
            break;
            case 4: {
                System.out.println("Enter the product name:");
                String s8 = s.next();
                r.updateCostBasedOnProductName(s8);
            }
            break;
            case 5: {
                System.out.println("Enter the product ID:");
                int id = s.nextInt();
                r.displayCategoryNameBasedOnId(id);
            }
            break;
			
			case 6:
			{
				System.out.println("Enter the price to remove product");
				double p=s.nextDouble();
				r.removeDataBasedOnPrice(p);
			}
			break;
			case 7:
			{
				isStart=false;
				System.out.println("Thank You...!");
			}
			defualt:System.out.println("You entered in valid choice");
		
		}

	}

	}
	}

