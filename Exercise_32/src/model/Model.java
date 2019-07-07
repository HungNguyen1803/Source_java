package model;

public class Model {
	public static void view() {
		InputBill.input();
		InputClient.input();
		InputProduct.inputList();
		Output.outputBill();
		OutputClient.outputClient();
		OutputProduct.outputProduct();
	}

}
