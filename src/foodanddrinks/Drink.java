package foodanddrinks;

public class Drink implements Dish {
	
	private String description;
	private double cost;
	
	public Drink(String description, double cost) {
		this.description = description;
		this.cost = cost;
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
		return 0;
	}

	@Override
	public String toString() {
		return description;
	}

}
