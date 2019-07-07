package model;

public class OutputProduct  extends InputProduct{
	public static void outputProduct() {
		for(int i=0; i<listProduct.size(); i++) {
			System.out.println(listProduct.get(i).getName() + "\t" +
								listProduct.get(i).getQuatum()+ "\t" + 
								listProduct.get(i).getUnitPrice() + "\t" +
								Feature.countMoney(listProduct.get(i)));
		}
	}
}
