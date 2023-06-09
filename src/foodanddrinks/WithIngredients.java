package foodanddrinks;

import java.util.LinkedList;

public abstract class WithIngredients {

	private LinkedList<Ingredient> ingredients = new LinkedList<Ingredient>();

	public void addIngredient(Ingredient ingredient) {
		ingredients.add(ingredient);
	}

	public void addIngredients(LinkedList<Ingredient> ingredients) {
		ingredients.addAll(ingredients);
	}

	public LinkedList<Ingredient> getIngredients() {
		return ingredients;
	}

	public boolean containsAllergies(LinkedList<Ingredient> allergies) {
		for (Ingredient a : allergies) {
			for (Ingredient i : ingredients) {
				if (a.equals(i))
					return true;
			}
		}
		return false;
	}

}
