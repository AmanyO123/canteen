import foodanddrinks.*;

public class Tests {
	public static void main(String[] args) {
		Food hamburger = new Food("hamburger", 7.50, 15);
		hamburger.addIngredient(new Ingredient("meat"));
		hamburger.addIngredient(new Ingredient("bread"));
		hamburger.addIngredient(new Ingredient("tomato"));
		
		Customer c = new Customer("Mark", "Blokpoel", 1);
		c.addAllergy(new Ingredient("bread"));
		c.addAllergy(new Ingredient("tomato"));
		
		System.out.println(hamburger.containsAllergies(c.getAllergies()));
	}
}
