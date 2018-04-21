package by.epam.les10library.main;


import java.util.ArrayList;
import java.util.List;

public class Library {
	private List<PrintedEdition> units = new ArrayList<PrintedEdition>();
	
	public Library() {}
	
	public void add(PrintedEdition unit) {
		units.add(unit);
	}
	
	public void remove(PrintedEdition unit) {
		units.remove(unit);
	}
	
	public List<PrintedEdition> find(Findable findMatcher){//FindByTitle
		List<PrintedEdition> hasFined = null;
		hasFined = findMatcher.find(units);
		return hasFined;
	}
}

