import java.util.*;

import foodanddrinks.Drink;
import foodanddrinks.Food;

public class MenuView {

	public MenuView() {
	}

	public void displayMenu(LinkedList<Food> foods, LinkedList<Drink> drinks) {
		System.out.println("Food items : ");

		for (Food foodlist : foods) {
			System.out.println(foodlist);
		}

		System.out.println("Drink items : ");

		for (Drink drinklist : drinks) {
			System.out.println(drinklist);
		}

		System.out.println("Nothing else");
	}
}
