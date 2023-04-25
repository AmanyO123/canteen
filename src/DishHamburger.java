import java.util.ArrayList;
//import java.util.Timer;

public class DishHamburger extends DishDecorator {
	

	ArrayList<String> ingredients = new ArrayList<String>();
	//Timer timer = new Timer();

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
 
 
 
 public double prepTime () {
	 
	 return 15.0; 
 }
 
 

}
