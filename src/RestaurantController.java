//import java.util.LinkedList;

import foodanddrinks.*;


public class RestaurantController {

	private MenuController menuController;
	private CustomerQueueController customerQueueController;
	
	// In future could have also:
	// KitchenController(kitchen, kitchenView)
	
	public RestaurantController(MenuController menuController, CustomerQueueController customerController) {
		this.menuController = menuController;
		this.customerQueueController = customerController;
	}
	
	public void addFood(Food food) {
		menuController.addFood(food);
	}
	
	public void addDrink(Drink drink) {
		menuController.addDrink(drink);
	}
	
	public void addCustomer(Customer customer) {
		customerQueueController.addToQueue(customer);
	}
	
	public void exitCustomer(Customer customer) {
	}
	
	public void go() {
		go(customerQueueController.nextCustomer());
	}
	
	public void go(Customer customer) {
		customerQueueController.welcomeView(customer);
		customerQueueController.requestAllergies(customer);
		customerQueueController.repeatAllergies(customer);
		
		// print menu view 
		menuController.display();
		getCustomerOrder(customer);
		
		// repeat order with cash total and wait time total
			// TODO
		// go to next customer
		if(customerQueueController.isNextCustomer()) {
			// do it again
			go(customerQueueController.nextCustomer());
		} else {
			// stop
		}
	}

	private void getCustomerOrder(Customer customer) {
		customerQueueController.showOrderSoFar(customer);
		String possibleDish = customerQueueController.requestCustomerSingleDish(customer);
		if(possibleDish.equals("nothing")) {
			// stop
		} else {
			// Check does possibleDish exist?
			if(menuController.exists(possibleDish)) {
				Dish dish = menuController.getDishByName(possibleDish);
				if(dish instanceof Food) {
					// Check for allergies
					boolean isCustomerAllergic = ((Food) dish).containsAllergies(customer.getAllergies());
					if(isCustomerAllergic) {
						customerQueueController.allergicToDish(customer, (Food) dish);
					} else {
						customer.addDishToOrder(dish);
					}
					getCustomerOrder(customer);
				} else if(dish instanceof Drink) {
					customer.addDishToOrder(dish);
					getCustomerOrder(customer);
				} else {
					customerQueueController.orderError(possibleDish);
				}
			} else {
				customerQueueController.dishDoesNotExist(possibleDish);
				getCustomerOrder(customer);
			}
		}
		
		
		
		
		
	}

}
// make a customer view
// work on these things 
