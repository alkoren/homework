package by.epam.les09hw;

public class Electronicbook  extends Text {
	private String format;
	private int yearPublished;

	public Electronicbook(String title, int yearPublished, String format) {
		super(title);
		this.yearPublished = yearPublished;
		this.format = format;

	}

	public String getformat() {
		return format;
	}
	public int getyearPublished() {
		return yearPublished;
	}

}
