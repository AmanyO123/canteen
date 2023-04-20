
abstract class DishDecorator implements Dish{
	
	protected Dish tempDish;
	
	public DishDecorator (Dish newDish) {
		tempDish = newDish;
	}
	
	public String description() {
		return tempDish.description();
		
	}
	public double cost(){
		return tempDish.cost();
		
	}
	

}
