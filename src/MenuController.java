import java.util.LinkedList;

import foodanddrinks.Food;
import foodanddrinks.Dish;
import foodanddrinks.Drink;

public class MenuController {
	private Menu model;
	private MenuView view;

	public MenuController() {
		model = new Menu();
		view = new MenuView();
	}

	public MenuController(Menu model, MenuView view) {
		this.model = model;
		this.view = view;
	}

	public void addFood(Food food) {
		model.addFood(food);
	}

	public void setFoods(LinkedList<Food> Foodmenu) {
		model.setFoodlist(Foodmenu);
	}

	public LinkedList<Food> getFoods() {
		return model.getFoodList();
	}

	public void addDrink(Drink drink) {
		model.addDrink(drink);
	}

	public void setDrinks(LinkedList<Drink> Drinkmenu) {
		model.setDrinkList(Drinkmenu);
	}

	public LinkedList<Drink> getDrinks() {
		return model.getDrinkList();
	}

	public boolean exists(String possibleDish) {
		for (Food food : model.getFoodList()) {
			if (food.description().equals(possibleDish))
				return true;
		}
		for (Drink drink : model.getDrinkList()) {
			if (drink.description().equals(possibleDish))
				return true;
		}
		return false;
	}

	public Dish getDishByName(String possibleDish) {
		for (Food food : model.getFoodList()) {
			if (food.description().equals(possibleDish))
				return food;
		}
		for (Drink drink : model.getDrinkList()) {
			if (drink.description().equals(possibleDish))
				return drink;
		}
		return null;
	}

	/*
	 * View wrapper methods.
	 */
	public void displayMenu() {
		view.displayMenu(getFoods(), getDrinks());
	}

}
