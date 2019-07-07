package model;

import java.util.ArrayList;
import java.util.Scanner;

public class InputProduct {
	static Scanner input = new Scanner(System.in);
	static ArrayList<Product> listProduct = new ArrayList<Product>();
	
	public static void input() {
		Product product = new Product();
		System.out.println("Input name of product:");
		String name = input.nextLine();
		product.setName(name);
		input.nextLine();
		System.out.println("Input unit price:");
		int unit = input.nextInt();
		product.setUnitPrice(unit);
		System.out.println("Input quatum of product:");
		int quatum = input.nextInt();
		product.setQuatum(quatum);
		input.nextLine();
		listProduct.add(product);
		System.out.println();
	}
	
	public static void inputList() {
		System.out.println("Input amount of product:");
		int lenght = input.nextInt();
		for(int i=0; i<lenght; i++) {
			input();
		}
	}
}
