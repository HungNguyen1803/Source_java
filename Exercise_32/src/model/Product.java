package model;

public class Product {
	private String name;
	private int unitPrice;
	private int quatum;

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(String name, int unitPrice, int quatum) {
		super();
		this.name = name;
		this.unitPrice = unitPrice;
		this.quatum = quatum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(int unitPrice) {
		this.unitPrice = unitPrice;
	}

	public int getQuatum() {
		return quatum;
	}

	public void setQuatum(int quatum) {
		this.quatum = quatum;
	}

}
