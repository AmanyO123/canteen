import foodanddrinks.*;

public class Main {

	public static void main(String[] args) {
		
		
	
		  Menu model = new Menu();
		
	      MenuView view = new MenuView();

	      MenuController mc = new MenuController(model, view);

	      // prepare/load menu model data
	      Food hamburger = new Food("hamburger", 7.50, 15);
	      hamburger.addIngredient(new Ingredient("meat"));
	      hamburger.addIngredient(new Ingredient("bread"));
	      hamburger.addIngredient(new Ingredient("tomato"));
	      mc.addFood(hamburger); // adding to lists food 
	      mc.addFood(new Food("pizza", 8.90, 25));
	      mc.addFood(new Food("fries", 3.50, 10));
	      mc.addFood(new Food("pasta", 10.50, 20));
		 
	      mc.addDrink(new Drink("Cola", 1.50)); // adding to lists food 
	      mc.addDrink(new Drink("Sprite", 1.50));
	      mc.addDrink(new Drink("Water", 0.90));
	      mc.addDrink(new Drink("Fanta", 1.50));
	     
	      
	      CustomerQueueController cc = new CustomerQueueController();
	      cc.addToQueue(new Customer("Amany", "Osman", 1));
	      cc.addToQueue(new Customer("Mark", "Blokpoel", 2));
	      
	      RestaurantController rc = new RestaurantController(mc, cc);
	      
	      rc.go();
	      
	      
	      
	   }


	}


