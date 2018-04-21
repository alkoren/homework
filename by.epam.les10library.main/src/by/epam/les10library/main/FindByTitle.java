package by.epam.les10library.main;

import java.util.List;

public class FindByTitle implements Findable{
	private String title;
	
	public FindByTitle(String title) {
		this.title = title;
	}

	@Override
	public List<PrintedEdition> find(List<PrintedEdition> units) {

		return null;
	}

}