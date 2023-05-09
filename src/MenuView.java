import java.util.*;

import foodanddrinks.Drink;
import foodanddrinks.Food;



public class MenuView {
	public LinkedList<Food> foods = new LinkedList<Food>();
	public LinkedList<Drink> drinks = new LinkedList<Drink>();
	MenuController control;
	
	
	public MenuView() {
		
	}
	
	//public MenuView(LinkedList<Food> foods, LinkedList<Drink> drinks) {
	//	this.drinks=drinks;
	//	this.foods=foods;
		
	//}
	
/**
	 public void printMenu(LinkedList<Food> foods, LinkedList<Drink> drinks){
	      System.out.println("Menu: ");
	      System.out.println("Food list: " + foods);
	      System.out.println("Drink list: " + drinks);
	   }
	   
	  */ 
	 
	
	public void printMenu(LinkedList<Food> foods, LinkedList<Drink> drinks) {
		 System.out.println("Food items : ");
		 foods.add(new Food("hamburger", 7.50, 15)); // adding to lists food 
		 foods.add(new Food("pizza", 8.90, 25));
		 foods.add(new Food("fries", 3.50, 10));
		 foods.add(new Food("pasta", 10.50, 20));
		 
		 for (Food foodlist : foods) {
	            System.out.println(foodlist);
	        }
	        
		 System.out.println("Drink items : ");
		 drinks.add(new Drink("Cola", 1.50)); // adding to lists food 
		 drinks.add(new Drink("Sprite", 1.50));
		 drinks.add(new Drink("Water", 0.90));
		 drinks.add(new Drink("Fanta", 1.50));
		 
		 for (Drink drinklist : drinks) {
	            System.out.println(drinklist);
	        }
		 
	        
	 }
	 

	 
	
}
