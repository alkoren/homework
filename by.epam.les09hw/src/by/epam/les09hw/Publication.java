package by.epam.les09hw;

public class Publication  extends Text {
	private String Publisher;
	private int yearPublished;

	public Publication(String title, int yearPublished, String Publisher) {
		super(title);
		this.yearPublished = yearPublished;
		this.Publisher = Publisher;

	}

	public String getPublisher() {
		return Publisher;
	}
	public int getyearPublished() {
		return yearPublished;
	}

}
