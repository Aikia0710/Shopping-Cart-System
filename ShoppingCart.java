package shop;

import java.util.ArrayList;

/**
 * Defining a field variable called as the products in this class
 * with the type of the ArrayList which can be regarded as a list of 
 * unknown quantities products from the class product. All of these 
 * products will be added into the shopping cart. The products with the
 * same name and price will be added on their quantities rather than into 
 * the shopping cart. 
 *  
 * @version 2018-12-06
 * @author zibo
 *
 */
public class ShoppingCart {
	private ArrayList<Product> products;
	/**
	 * the standard constructor 
	 * @param products
	 */
	public ShoppingCart(ArrayList<Product> products) {
		this.products = products;	
	}
	/**
	 * the method used to add products into the shopping cart. At here 
	 * a product p will be added.
	 * @param p
	 */
	public void add(Product p) {
		//using the for loop to traversal all elements in the products array
		//using the if condition to check if the added elements with the same
		//price and name, if the result is true, the quantity will be added,and 
		//the count will be added for 1 then get into next loop
		int count = 0;
		for (int i = 0; i < products.size(); i++) {
			if (products.get(i).getName().equals(p.getName()) && products.get(i).getPrice() == p.getPrice()) {
				products.get(i).setQuantity(p.getQuantity()+products.get(i).getQuantity());
				count = count + 1;
			}
		}	if (count == 0) {
			products.add(p);
		}
	}
	/**
	 * adding another total method to recall the total price method 
	 * in the product class which under the same package.
	 * @return the total 
	 */
	public double getTotal() {
		double Total = 0.0;
		for (int i = 0; i < products.size();i++) {
			Total = Total + products.get(i).getTotalPrice();
		}
		return (Math.round(Total*100)*0.01);
	}
	/**
	 * the utilisation of the toString method to print out results into
	 * a reader friendly way
	 */
	public String toString() {
		String ShoppingCart = "";
		for (int i = 0; i < products.size(); i++) {
			ShoppingCart = ShoppingCart + products.get(i);
		}
		ShoppingCart = ShoppingCart + "\t\t\t\t-------------" + "\n"
									+ "\t\t\t\tTOTAL GBP " + getTotal();
		return ShoppingCart;
	}
	
	public static void main(String args[]) {
		Product a = new Product("Milk (1L)",1.12,2);
		Product b = new Product("Bread",0.78,2);
		Product c = new Product("Apples",0.49,4);
		Product d = new Product("Milk (1L)",1.12,5);
		ArrayList<Product> products = new ArrayList<Product>();
		ShoppingCart SC = new ShoppingCart(products);
		SC.add(a);
		SC.add(b);
		SC.add(c);
		SC.add(d);
		System.out.println(SC);
		
	}
										
}
					
