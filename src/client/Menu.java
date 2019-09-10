package client;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

import objekt.Cart;

public class Menu {
	private boolean running;
	private Cart cart;
	private Locale locale;
	private ResourceBundle bundle;
	public Menu() {
		System.out.println("Velkommen til butikken");
		running = true;
		cart = new Cart();
		
	}
	
	public static void main(String[] args) {
		Menu meny = new Menu();
		meny.locale();
		meny.start();
	}
	
	private void locale() {
		System.out.println("Choose language");
		System.out.println("1) Norwegian");
		System.out.println("2) English");
		System.out.println("3) French");
		Scanner scanner = new Scanner(System.in);
		String valg = scanner.nextLine();
		switch (valg) {
		case "1":{
			locale = new Locale("no");
			break;
		}
		case "2":{
			locale = new Locale("en");
			break;
		}
		case "3":{
			locale = new Locale("fr");
			break;
		}
		}
		bundle = ResourceBundle.getBundle("menu", locale);
		
	}

	public void start() {
		while(running) {
			System.out.println("Velg...");
			System.out.println("1) Se varer");
			System.out.println("2) Se handlevogn");
			System.out.println("3) Tøm handlevogn");
			System.out.println("4) Avslutt programmet");
			System.out.print("Ditt valg: ");
			Scanner scanner = new Scanner(System.in);
			String valg = scanner.nextLine();
			switch(valg) {
			case "1":{
				seVarer();
				break;
			}
			case "2":{
				seHandlevogn();
				break;
			}
			case "3":{
				tømHandlevogn();
				break;
			}
			case "4":{
				avslutt();
				break;
			}
			}
		}
		
	}

	private void tømHandlevogn() {
		// TODO Auto-generated method stub
		
	}

	private void seHandlevogn() {
		cart.printList();
		
	}

	private void seVarer() {
		// TODO Auto-generated method stub
		
	}

	private void avslutt() {
		running = false;
		
	}
}
