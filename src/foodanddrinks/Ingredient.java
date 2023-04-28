package foodanddrinks;

public class Ingredient {
	public String ingredient;
	
	public Ingredient(String name) {
		this.ingredient = name;
	}
	

	//public Ingredient getIngredient() { // returns the object of ingredient 
	//	return this;
	//}
	
	public void setIngredient(String name) {
		this.ingredient = name;
	}
	
	public String getIngredient () {
		return ingredient;
	}
	
	@Override
	public String toString() {
		return ingredient;
	}
}
