package objekt;

import java.util.ArrayList;

public class Cart {
	private ArrayList<Product> products;
	
	public Cart() {
		products = new ArrayList<Product>();
	}
	
	public int size() {
		return products.size();
	}
	public void add(Product p) {
		products.add(p);
	}
	public boolean remove(Product p) {
		return products.remove(p);
	}
	public void printList() {
		System.out.println("Liste over varer");
		if(size() == 0) {
			System.out.println("Handlevognen er tom");
		}else {
			for(int i = 0; i < size(); i++) {
				System.out.print(i+1 + ") ");
				System.out.println(products.get(i).getpName());
			}
		}
		
		System.out.println("----------------");
	}
}
