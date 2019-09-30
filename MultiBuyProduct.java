package shop;

import java.util.ArrayList;
/**
 * the MultiBuyProduct class contains two field variables the
 * minDiscountedQuantity and the discountPercent with the type
 * of int. Based on the class shoppingCart, in this class some 
 * products has been bought over specified quantities will be 
 * multiplied by a discount percent. This is sub class which extends
 * the Product class, using its fields variables the name, price and 
 * quantity. A method of the total price will be added. 
 * 
 * @version 2018-12-05
 * @author zibo
 */
public class MultiBuyProduct extends Product{
	private int minDiscountedQuantity;
	private int discountPercent;
	/**
	 * standard format of the constructor 
	 * @param name
	 * @param price
	 * @param quantity
	 * @param minDiscountedQuantity
	 * @param discountPercent
	 */
	public MultiBuyProduct(String name,double price,int quantity,
							int minDiscountedQuantity,int discountPercent){
		super(name,price,quantity);
		this.minDiscountedQuantity = minDiscountedQuantity;
		this.discountPercent = discountPercent;
		
	}
	/**
	 * setting the initial value of the total price as 0. Then using a if 
	 * condition to compare if the getQuantity method from the super class
	 * shopping cart is more than the minDiscountQuantity. If the results
	 * is true, multiplies it with the discount percent, then return the value of 
	 * total price. If the result of condition is false, return the value
	 * multiplication of price and quantity.
	 */
	public double getTotalPrice() {
		double totalPrice = 0.0;
		if (super.getQuantity() >= this.minDiscountedQuantity) {
			totalPrice = getQuantity() * getPrice() * (1 - (this.discountPercent)*0.01);
		} 
		else {
			totalPrice = Math.round(getPrice() * getQuantity()*100)*0.01;
		}
		return totalPrice;
	}
	/**
	 * using the if condition, if the quantity of products meet the discount requirement
	 * print out one more line to show the discount price. If not meet it, just print out 
	 * normally
	 */
	public String toString() {
		String MultiBuyProduct = "";
		if (super.getQuantity() >= this.minDiscountedQuantity) {
			MultiBuyProduct += super.getQuantity() + " * GBP " +
			super.getPrice() + "\t    " + super.getName() + "\t= GBP  " + 
			super.getTotalPrice() + "\n" +
			"\t(Multibuy Discount: GBP " + super.getTotalPrice()*(this.discountPercent*0.01) + ")"
			+ "\n";	
		} else 
			MultiBuyProduct += super.getQuantity() + "* GBP\t" +
			super.getPrice() + super.getName() + "\t\t= GBP\t" + 
			super.getTotalPrice() + "\n";
		 return MultiBuyProduct;
	}
	
	public static void main (String args[]) {
		Product A = new Product("Milk(1pt)", 0.79, 9);
		MultiBuyProduct B = new MultiBuyProduct("Tomato",0.5,20,10,3);
		Product C = new Product("Tomato",0.53,5);
		Product D = new Product("Milk(1pt)",0.79,4);
		ArrayList<Product> products = new ArrayList<Product>();
		ShoppingCart S = new ShoppingCart(products);
		S.add(A);
		S.add(B);
		S.add(C);
		S.add(D);
		System.out.println(S);
	}
}
