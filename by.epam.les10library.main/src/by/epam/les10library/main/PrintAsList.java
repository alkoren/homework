package by.epam.les10library.main;

import java.util.List;

public class PrintAsList implements Printable {

	@Override
	public void print(List<PrintedEdition> units) {
		// TODO Auto-generated method stub

		// System.out.println(units.getClass());
		for (PrintedEdition listedBook : units) {
			if (listedBook.getClass().getName().endsWith("Book")) {
				System.out.println("Book Price: " + listedBook.getPrice());
			} else {
				System.out.println("Magazine Price: " + listedBook.getPrice());

			}
		}
	}

}
