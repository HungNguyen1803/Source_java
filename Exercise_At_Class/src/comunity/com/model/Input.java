package comunity.com.model;

import java.util.ArrayList;
import java.util.Scanner;

public class Input {
	static ArrayList<Worker> ListWorker = new ArrayList<Worker>();
	static Scanner input = new Scanner(System.in);

	public static void inputworker() {
		Worker worker = new Worker();
		System.out.println("Input mHo;");
		String mho = input.nextLine();
		worker.setmHo(mho);
		input.nextLine();

		System.out.println("Input mten:");
		String mten = input.nextLine();
		worker.setMten(mten);
		input.nextLine();

		System.out.println("Input msoSop:");
		int soSp = input.nextInt();
		worker.setmSoSP(soSp);

		System.out.println();
		ListWorker.add(worker);
	}

	public static void inputList() {
		System.out.println("Input lenght of List:");
		int lenght = input.nextInt();
		for (int i = 0; i < lenght; i++) {
			inputworker();
		}
	}
}
