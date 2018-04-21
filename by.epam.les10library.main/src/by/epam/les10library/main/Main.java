package by.epam.les10library.main;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		Library myLibrary = new Library();

		myLibrary.add(new Book("Java", 300));
		myLibrary.add(new Book("C++", 250));
		myLibrary.add(new Magazine(40, 50));
		myLibrary.add(new Magazine(20, 300));

		Findable matcher = new FindByPrice(300);

		List<PrintedEdition> lists = myLibrary.find(matcher);

		System.out.println("Found " + lists.size() + " of PrintedEdition with price 300, here is list :");
		print(new PrintAsList(), lists);
		System.out.println("");
		System.out.println("Table of PrintedEdition with price 300 :");
		print(new PrintAsTable(), lists);
	}

	public static void print(Printable printObj, List<PrintedEdition> lists) {
		printObj.print(lists);
	}

}
