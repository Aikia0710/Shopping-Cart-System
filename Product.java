/**
 * the class product contains three field variables name, price and quantity 
 * which with the type of String, double and int. The name and price will be 
 * different for each added product. The product class has a method which is 
 * used to sort out the total price of the products in basket.
 * 
 * @version 2018-11-05
 * @author Zibo Wang
 */
package shop;

public class Product {
	private String name;
	private double price;
	private int quantity;
	
	/**
	 * the standard constructor of the class shop 
	 * @param name
	 * @param price
	 * @param quantity
	 */
	public Product(String name,double price,int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	/**
	 * the getter method for the name
	 * @return the new value of the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * the getter method for the price
	 * @return the new value of the price
	 */
	public double getPrice() {
		return price;
	}
	/**
	 * the setter method of the quantity
	 * @param quantity updating the value of the variable
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	/**
	 * the getter method of the quantity
	 * @return reading the value of the quantity 
	 */
	public int getQuantity() {
		return quantity;
	}
	/**
	 * the method used to calculate out the total price in the
	 * shopping cart, the application of the Math.round is used
	 * to keep the value in two digits which match with the double
	 * type 
	 * @return the value of the total price
	 */
	public double getTotalPrice() {
		return(Math.round(price * quantity*100)*0.01);
	}
	/**
	 * using the toString method to print out in a standard format
	 */
	public String toString(){
		return (getQuantity() + " * GBP  " +
				getPrice() + "       " + getName() + 
				"\t= GBP" + "  " + getTotalPrice() + "\n");
	}
	// adding the product A into the shopping cart
	public static void main(String[] args) {
		Product A = new Product("Milk (1L)", 1.12, 2);
		System.out.println(A);
	}
}
