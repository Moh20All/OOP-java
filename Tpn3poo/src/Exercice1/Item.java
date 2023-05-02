package Exercice1;

public class Item {
	private String name;
	private int price;

	public Item(String name, int price) {
		setName(name);
		setPrice(price);
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public String toString() {
		return getName() + ": " + getPrice() + " DA";
	}

	public static void main(String[] args) {
		Item item = new Item("corn flex", 500);
		System.out.println(item.getName() + "\n" + item.getPrice());
		System.out.println(item);

	}
}
