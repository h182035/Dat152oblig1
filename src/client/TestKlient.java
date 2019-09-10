package client;

import objekt.Cart;
import objekt.Product;

public class TestKlient {
	public static void main(String[] args) {
		Product p1 = new Product(1, "Cola", 2, "bilde1");
		Product p2 = new Product(2, "Pepsi", (float) 1.5, "bilde2");
		Product p3 = new Product(3, "Urge", 3, "bilde3");
		Cart cart = new Cart();
		cart.add(p1);
		cart.add(p2);
		cart.add(p3);
		cart.printList();
	}
	
}
