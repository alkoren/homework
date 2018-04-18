package by.epam.les09hw;

public class Printedbook extends Text {
	private double price;
	private int yearPublished;

	public Printedbook(String title, int yearPublished, double price) {
		super(title);
		this.yearPublished = yearPublished;
		this.price = price;

	}

	public double getPrice() {
		return price;
	}
	public int getyearPublished() {
		return yearPublished;
	}
}
