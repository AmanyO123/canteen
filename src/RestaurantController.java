//import java.util.LinkedList;

import foodanddrinks.*;


public class RestaurantController {

	private MenuController menuController;
	private CustomerQueueController customerController;
	
	// In future could have also:
	// KitchenController(kitchen, kitchenView)
	
	public RestaurantController(MenuController menuController, CustomerQueueController customerController) {
		this.menuController = menuController;
		this.customerController = customerController;
	}
	
	public void addFood(Food food) {
		menuController.addFood(food);
	}
	
	public void addDrink(Drink drink) {
		menuController.addDrink(drink);
	}
	
	public void addCustomer(Customer customer) {
		customerController.addToQueue(customer);
	}
	
	public void exitCustomer(Customer customer) {
	}
	
	public void go() {
		go(customerController.nextCustomer());
	}
	
	public void go(Customer customer) {
		System.out.println(customer.firstName);
		// print menu view 
		menuController.display();
		// ask for order (view menu view)
//		order.fillOrder(); // this is null 
		// check for allergies (may skip)
		// repeat order with cash total and wait time total
		// go to next customer
		if(customerController.isNextCustomer()) {
			// do it again
			go(customerController.nextCustomer());
		} else {
			// stop
		}
	}

}
// make a customer view
// work on these things 
