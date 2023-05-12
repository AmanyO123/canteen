package foodanddrinks;

public class Ingredient {
	private String ingredient;
	
	public Ingredient(String name) {
		this.ingredient = name;
	}
	
	public void setIngredient(String name) {
		this.ingredient = name;
	}
	
	public String getIngredient () {
		return ingredient;
	}
	
	@Override
	public boolean equals(Object another) {
		if(another instanceof Ingredient) {
			if(((Ingredient) another).ingredient.equals(this.ingredient))
				return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		return ingredient;
	}
}
