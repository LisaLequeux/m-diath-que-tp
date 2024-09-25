package mediatheque;

import java.util.LinkedList;
import java.util.List;

public class Mediatheque {
	private final List<Item> items = new LinkedList<>();

	public void addItem(Item i) {
		items.add(i);
	}

	public void printCatalog() {
		for (Item i : items)
			i.print();
	}

	public void BookPrinter() {
		System.out.println("Impression de livres");
		BookPrinter bookPrinter = new BookPrinter();
		for (Item i : items)
			i.accept(bookPrinter);
	}

	public void CDPrinter() {
		System.out.println("Impression des" +
				" CDs");
		CDPrinter cdPrinter = new CDPrinter();
		for (Item i : items)
			i.accept(cdPrinter);
	}
}