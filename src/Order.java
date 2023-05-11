import java.util.LinkedList;
import foodanddrinks.Dish;

public class Order {
	int customerId;
	LinkedList<Dish> dishes = new LinkedList<Dish>();
    boolean eatIn = true;
    
    public Order(int customerId, boolean eatIn) {
    	this.customerId = customerId;
    	this.eatIn = eatIn;
    }
    
    public void addDish(Dish dish) {
    	dishes.add(dish);
    }
    
    public int getTotalWaitTime() {
    	int totalWaitTime = 0;
    	for(int i = 0; i < dishes.size(); i++) {
    		 totalWaitTime+=dishes.get(i).prepTime();
    	}
    	
    	return totalWaitTime;
    	
//    	for (Dish dish : dishes) {
//    		totalWaitTime += dish.prepTime();
//    	}
    }
    
    

}
