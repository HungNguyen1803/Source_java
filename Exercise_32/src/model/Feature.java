package model;

public class Feature {
	public static int countMoney(Product product) {
		return product.getQuatum()*product.getUnitPrice();
	}
}
