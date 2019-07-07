package model;

public class Output extends InputBill {

	 public static void outputBill() {
		 System.out.println(listBill.get(0).getIdBill() + "\t" + listBill.get(0).getDate());
	 }
	 
	 
}
