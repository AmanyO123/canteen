
public class DrinkCola extends DishDecorator {

	public DrinkCola(Dish newDish) {
		super(newDish);
		
	}
	
	public String description() {
		return tempDish.description() + "Cola";
		
	}
	
	public double cost(){
		System.out.print("The cost of a Cola " + 2.30);
		return tempDish.cost() + 2.30;
		
	}

}
