package by.epam.les10library.main;

import java.util.List;

public class PrintAsTable implements Printable {

	@Override
	public void print(List<PrintedEdition> units) {
		// TODO Auto-generated method stub
		System.out.println("  Type   |   Price  ");
		for (PrintedEdition listedBook : units) {
			if (listedBook.getClass().getName().endsWith("Book")) {
				System.out.println("  Book   | " + listedBook.getPrice());
			} else {
				System.out.println("Magazine | " + listedBook.getPrice());

			}
		}
	}

}