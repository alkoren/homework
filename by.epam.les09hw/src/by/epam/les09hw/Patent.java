package by.epam.les09hw;

public class Patent extends Text {
	private String patent_id;
	private int yearPublished;

	public Patent(String title, int yearPublished, String patent_id) {
			super(title);
			this.patent_id = patent_id;
			this.yearPublished = yearPublished;

		}

	public String getpatent_id() {
		return patent_id;
	}

	public int getyearPublished() {
		return yearPublished;
	}
}
