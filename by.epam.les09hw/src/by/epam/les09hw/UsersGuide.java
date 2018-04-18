package by.epam.les09hw;

public class UsersGuide extends Text {
	private String model;

	public UsersGuide(String title, String model) {
				super(title);
				this.model = model;

			}

	public String getmodel() {
		return model;
	}

}
