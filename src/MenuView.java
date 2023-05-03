import java.util.*;

import foodanddrinks.Drink;
import foodanddrinks.Food;



public class MenuView {

	 public void printMenu(LinkedList<Food> foods, LinkedList<Drink> drinks){
	      System.out.println("Menu: ");
	      System.out.println("Food list: " + foods);
	      System.out.println("Drink list: " + drinks);
	   }
	 
	 public void displayFood(LinkedList<Food> foods) {
	        System.out.println("Food:");
	        for (Food foodlist : foods) {
	            System.out.println(foodlist);
	        }
	    }
	 
	 public void displayDrink(LinkedList<Drink> drinks) {
	        System.out.println("Drinks:");
	        for (Drink drinklist : drinks) {
	            System.out.println(drinklist);
	        }
	    }
}
