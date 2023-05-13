package foodanddrinks;

import java.util.LinkedList;

public class Food extends WithIngredients implements Dish {
	private String description;
	private double cost;
	private int prepTime;

	public Food(String description, double cost, int prepTime) {
		this.description = description;
		this.cost = cost;
		this.prepTime = prepTime;
	}

	public Food(String description, double cost, int prepTime, LinkedList<Ingredient> ingredients) {
		this.description = description;
		this.cost = cost;
		this.prepTime = prepTime;
		super.addIngredients(ingredients);
	}

	@Override
	public String description() {
		return description;
	}

	@Override
	public double cost() {
		return cost;
	}

	@Override
	public int prepTime() {
		return prepTime;
	}

	@Override
	public String toString() {
		return description;
	}

}
