package model;

import java.util.ArrayList;
import java.util.Scanner;

public class InputBill {
	
	static Scanner input = new Scanner(System.in);
	static ArrayList<Bill> listBill = new ArrayList<Bill>();
	
	public static void input() {
		Bill bill = new Bill();
		System.out.println("Input id bill:");
		String id =  input.nextLine();
		bill.setIdBill(id);
		input.nextLine();
		System.out.println("Input date :");
		String date = input.nextLine();
		bill.setDate(date);
		input.hasNextLine();
		listBill.add(bill);
		System.out.println();
	}

}
