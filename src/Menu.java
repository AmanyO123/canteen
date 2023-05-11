
import java.util.*;

import foodanddrinks.Food;  
import foodanddrinks.Drink; 
/**
 * Menu is the model -- this holds all the private things the user doesnt see, here we have two lists 
 * that have the drinks and the food and getters and setters of those lists.
 * 
 *
 */
public class Menu { // model
	
	
	private LinkedList<Food> Foodmenu = new LinkedList<Food>(); 
	private LinkedList<Drink> Drinkmenu = new LinkedList<Drink>();
	
	public Menu(LinkedList<Food> Foodmenu , LinkedList<Drink> Drinkmenu ) {
		this.Drinkmenu=Drinkmenu;
		this.Foodmenu=Foodmenu;
	
		
	}
	
	public Menu() {
		
	
		
	}
	
	
	public void addFood(Food food) {
		Foodmenu.add(food);
	}
	
	public void addDrink(Drink drink) {
		Drinkmenu.add(drink);
	}
	
	public void setFoodlist(LinkedList<Food> Foodmenu) {
		this.Foodmenu = Foodmenu;
	}
	
	public void setDrinkList(LinkedList<Drink> Drinkmenu) {
		this.Drinkmenu = Drinkmenu;
	}
	
	public LinkedList<Food> getFoodList() {
		return Foodmenu;
		
	}
	
	
	public LinkedList<Drink> getDrinkList() {
		return Drinkmenu;
		
	}
	
	
}

