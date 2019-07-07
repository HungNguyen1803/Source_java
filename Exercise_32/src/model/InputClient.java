package model;

import java.util.ArrayList;

import java.util.Scanner;

public class InputClient {
	static ArrayList<Client> listClient = new ArrayList<Client>();
	static Scanner input = new Scanner(System.in);
	
	public static void input() {
		Client client = new Client();
		System.out.println("Input name of client:");
		String name = input.nextLine();
		client.setName(name);
		input.nextLine();
		System.out.println("Input address of client:");
		String address = input.nextLine();
		client.setAddress(address);
		input.hasNextLine();
		listClient.add(client);
		System.out.println();
		
	}
}
