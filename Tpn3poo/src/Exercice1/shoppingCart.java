package Exercice1;

import java.util.ArrayList;

public class shoppingCart {
	private ArrayList<Item> items;

	public shoppingCart() {
		items = new ArrayList<Item>();
	}

	public void addItem(Item item) {
		this.items.add(item);
	}

	public boolean existIn(Item item) {
		for (Item temp : items) {
			if (item.getName().equals(temp.getName())) {
				System.out.println("Exist");
				return true;
			}
		}
		System.out.println("n'Exist pas");
		return false;
	}

	public boolean removeItem(Item item) {
		for (Item temp : items) {
			if (item.getName() == temp.getName()&&item.getPrice()==temp.getPrice()) {
				this.items.remove(temp);
				return true;
			}
		}
		return false;
	}

	public int itemCount() {
		int count = 0;
		for (Item prod : items) {
			count++;
		}
		return count;
	}

	public double totalPrice() {
		double price = (double) 0;
		for (Item prod : items) {
			price += prod.getPrice();
		}
		return price;
	}

	public static void main(String[] args) {
		 Item item1 = new Item("corn flakes", 50);
		 Item item2 = new Item("caviar", 5000);
		 shoppingCart cart = new shoppingCart();
		 cart.addItem(item1);
		 cart.addItem(item2);
		 System.out.println(cart.itemCount()); // affiche: 2
		 System.out.println(cart.totalPrice()); // affiche: 5050


	}

}
