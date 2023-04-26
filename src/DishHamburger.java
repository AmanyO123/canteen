import java.util.ArrayList;
//import java.util.Timer;

public class DishHamburger extends DishDecorator {
	
	IngredientsCompareAllergy allerIng;
	

	ArrayList<String> ingredients = new ArrayList<String>();
	

	public DishHamburger(Dish newDish) {
		super(newDish);
		
		
	}

	public String description() {
		return tempDish.description() + "Hamburger";
		
	}
	
	public double cost(){
		System.out.print("The cost of a Hamburger " + 8.00);
		return tempDish.cost() + 8.00;
		
	}
	
	
 public ArrayList<String> getIngredients(){
		ingredients.add("Beef patty, Lettuce, Tomato, Pickles, Bun");
		return ingredients;
		
		
	}
 
	public void checking() {
	allerIng.checkingAlandIn();
	}
	
	public void checkingforAlandIn() {
		// wanna use the linkedlist from the other class for this one 
		// allerIng.ingredients.add("Beef patty, Lettuce, Tomato, Pickles, Bun"); -- not comptaible because of String 
		ingredients.add("Beef patty, Lettuce, Tomato, Pickles, Bun");
		allerIng.checkingAlandIn();
		

		}
		
	
 
 public double prepTime () {
	 
	 return 15.0; 
 }
 
 

}
