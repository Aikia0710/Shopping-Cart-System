package shop;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ShoppingCartTest {
	
	@Test
	public void numTest() {
		ArrayList<Product> emptyCart = new ArrayList<>();
		ShoppingCart cart = new ShoppingCart(emptyCart);
		Product p = new Product("Milk", 1.2, 2);
		Product a = new Product("Milk", 1.2, 2);
		cart.add(p);
		cart.add(a);

		assertEquals(4, p.getQuantity());
	}

	@Test
	public void itemTest() {
		ArrayList<Product> emptyCart = new ArrayList<>();
		ShoppingCart cart = new ShoppingCart(emptyCart);
		Product p = new Product("Milk", 1.2, 2);
		Product a = new Product("Milk2", 1.2, 2);

		cart.add(p);
		cart.add(a);
		System.out.println();

		assertEquals("MilkMilk2", p.getName());
	}

	@Test
	public void priceTest() {
		ArrayList<Product> emptyCart = new ArrayList<>();
		ShoppingCart cart = new ShoppingCart(emptyCart);
		Product p = new Product("Milk", 1.2, 2);
		Product a = new Product("Milk2", 1.2, 2);

		cart.add(p);
		cart.add(a);

		assertEquals(4, a.getPirce(), 0.1);
	}
	 

	}

