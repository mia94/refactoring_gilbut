package refactoring_gilbut.chap06_2.after;

public class ItemAfter {
	
	private final ItemType itemtype;
	private final String title;
	private final int price;
	
	public ItemAfter(ItemType itemtype, String title, int price) {
		this.itemtype = itemtype;
		this.title = title;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public int getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "ItemAfter [" + itemtype.getTypecode() + ", " + title + ", " + price + "]";
	}
	
	
	
	
}
