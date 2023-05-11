import java.util.LinkedList;
import foodanddrinks.*;

public class Customer {
    int ID;
    String firstName;
    String lastName;
    Order order;
    LinkedList<Ingredient> allergies = new LinkedList<Ingredient>();
    
    
    public Customer (String firstName, String lastName, int ID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ID = ID;
        this.order = new Order(ID, true);
    }
    
    public Customer (String firstName, String lastName, int ID, boolean eatIn) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ID = ID;
        this.order = new Order(ID, eatIn);
    }
    
    public int getId() {
    	return ID;
    }

    public void addAllergy(Ingredient allergy) {
    	allergies.add(allergy);
    }
	
    public void addAllergy(LinkedList<Ingredient> allergies) {
    	this.allergies.addAll(allergies);
    }
    
    public void addDishToOrder(Dish dish) {
    	order.addDish(dish);
    }
    
	@Override
	public String toString() {
	    return this.firstName + " " + this.lastName + " "  + this.ID;
	}


}





