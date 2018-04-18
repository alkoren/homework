package by.epam.les09hw;

public class TestLibrary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printedbook mybook1 = new Printedbook("Java Homework", 2018, 1.2);
		System.out.println("Added to library: " + mybook1.getTitle() + " year: " + mybook1.getyearPublished()
				+ " price: " + mybook1.getPrice());
		Publication mybook2 = new Publication ("How I have done my Java Homework", 2018, "FYI");
		System.out.println("Added to library: " + mybook2.getTitle() + " year: " + mybook2.getyearPublished()
		+ " publisher: " + mybook2.getPublisher());		
	}
}