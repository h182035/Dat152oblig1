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
		running = true;
		cart = new Cart();
		cart.lesFraFil();
		Locale engelsk = new Locale("en");
		bundle = ResourceBundle.getBundle("menu", engelsk);
		
	}
	
	public static void main(String[] args) {
		Menu meny = new Menu();
		meny.locale();
		meny.start();
	}
	
	private void locale() {
		System.out.println(bundle.getString("velkommen"));
		System.out.println(bundle.getString("velgSprak"));
		System.out.println("1)" + " " + bundle.getString("norsk"));
		System.out.println("2)" + " " + bundle.getString("engelsk"));
		System.out.println("3)" + " " + bundle.getString("fransk"));
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
			System.out.println(bundle.getString("velg"));
			System.out.println("1)" + " " + bundle.getString("seVarer"));
			System.out.println("2)" + " " + bundle.getString("seHandlevogn"));
			System.out.println("3)" + " " + bundle.getString("tomHandlevogn"));
			System.out.println("4)" + " " + bundle.getString("avslutt"));
			System.out.println(bundle.getString("dittValg"));
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
