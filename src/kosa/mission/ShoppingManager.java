package kosa.mission;

import java.util.List;
import java.util.ArrayList;

public class ShoppingManager {
	private Item item;
	private List<Item> items;
	
	public ShoppingManager() {
	    this.items = new ArrayList<>();
	}
	
	public ShoppingManager(Item item, List<Item> items) {
		this.item = item;
		this.items = items;
	}
	
	public void addItem (int number, String name, int price) {
		Item newItem = new Item(number, name, price);
		items.add(newItem);
	}
	
	public void total () {
		for (Item item: items) {
			item.show();
		}
	}
}

