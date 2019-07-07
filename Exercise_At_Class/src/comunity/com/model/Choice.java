package comunity.com.model;

import java.util.Scanner;

public class Choice {
	static Scanner input = new Scanner(System.in);

	public static void typeChoice() {
		do {
			System.out.println("============== Menu ==============");
			System.out.println("1.Input Array :");
			System.out.println("2.Output Array");
			System.out.println("3.Exit");

			System.out.println("Type your choice:");
			int choice = input.nextInt();

			switch (choice) {
			case 1:
				Input.inputList();
				SortIncrese.sortBySalary();
				break;
			case 2:
				Output.outputList();break;
			case 3:
				System.exit(0);

			}
		} while (true);
	}
}
