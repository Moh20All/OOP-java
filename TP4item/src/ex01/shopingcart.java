package ex01;

import java.util.ArrayList;

public class shopingcart {
	private ArrayList<item> items;
	public shopingcart() {
		items = new ArrayList<item>();
	}
	public void addItem(item it) {
		items.add(it);
	}
	public void  removeItem(item it) {
		
		if(!items.contains(it)) {
			System.out.println("The item dosent exist");
		}else {
			items.remove(it);
		}
	}
	public int getItemCount() {
        return items.size();
    }
	public double prixTotal() {
		double total=0;
		for(int i=0;i<items.size();i++) {
			System.out.println(items.get(i).getName()+" : "+items.get(i).getPrice());
			total=total+items.get(i).getPrice();
		}
		return total;
	}
	public static void main(String[] args) {
		item item1 = new item("corn flex", 50);
		item item2 = new item("Laptop", 2300);
		item item3 = new item("ssd",450);
		shopingcart cart = new shopingcart();
		cart.addItem(item1);
		cart.addItem(item2);
		cart.addItem(item3);
		cart.removeItem(null);
		System.out.println("The total size of cart : "+cart.getItemCount());
		double total=cart.prixTotal();
		System.out.println("Le prix total : "+total);
	}
}
