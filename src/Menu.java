import java.util.LinkedList;
import foodanddrinks.Food;
import foodanddrinks.Drink;

/**
 * Menu is the model -- this holds all the private things the user doesnt see,
 * here we have two lists that have the drinks and the food and getters and
 * setters of those lists.
 * 
 *
 */
public class Menu { // model
	private LinkedList<Food> foodMenu = new LinkedList<Food>();
	private LinkedList<Drink> drinkMenu = new LinkedList<Drink>();

	public Menu(LinkedList<Food> Foodmenu, LinkedList<Drink> Drinkmenu) {
		this.drinkMenu = Drinkmenu;
		this.foodMenu = Foodmenu;
	}

	public Menu() {
	}

	public void addFood(Food food) {
		foodMenu.add(food);
	}

	public void addDrink(Drink drink) {
		drinkMenu.add(drink);
	}

	public void setFoodlist(LinkedList<Food> Foodmenu) {
		this.foodMenu = Foodmenu;
	}

	public void setDrinkList(LinkedList<Drink> Drinkmenu) {
		this.drinkMenu = Drinkmenu;
	}

	public LinkedList<Food> getFoodList() {
		return foodMenu;

	}

	public LinkedList<Drink> getDrinkList() {
		return drinkMenu;
	}
}
