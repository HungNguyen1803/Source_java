package model;

public class Bill {
	private String idBill;
	private String date;

	public Bill() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bill(String idBill, String date) {
		super();
		this.idBill = idBill;
		this.date = date;
	}

	public String getIdBill() {
		return idBill;
	}

	public void setIdBill(String idBill) {
		this.idBill = idBill;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

}
