import java.util.LinkedList;

import foodanddrinks.Food;
import foodanddrinks.Ingredient;

public class CustomerQueueController {
	private LinkedList<Customer> customerQueue = new LinkedList<Customer>();
	private CustomerAndOrderView customerAndOrderView = new CustomerAndOrderView();
	
	public CustomerQueueController() {
		
	}

	public void addToQueue(Customer customer) {
		customerQueue.add(customer);
		
	}

	public boolean isNextCustomer() {
		return !customerQueue.isEmpty();
	}

	public Customer nextCustomer() {
	
		return customerQueue.pop();
	}

	public String requestCustomerSingleDish(Customer customer) {
		return customerAndOrderView.requestSingleDish();	
	}

	public void welcomeView(Customer customer) {
		customerAndOrderView.welcomeView(customer);
	}

	public void requestAllergies(Customer customer) {
		String allergyInput = customerAndOrderView.requestSingleAllergy();
		if(allergyInput.equals("nothing")) {
			// done
		} else {
			customer.addAllergy(new Ingredient(allergyInput));
			requestAllergies(customer);
		}
	}

	public void repeatAllergies(Customer customer) {
		customerAndOrderView.repeatAllergies(customer);
	}

	public void dishDoesNotExist(String possibleDish) {
		customerAndOrderView.dishDoesNotExist(possibleDish);
	}

	public void allergicToDish(Customer customer, Food dish) {
		customerAndOrderView.allergicToDish(customer, dish);
	}

	public void orderError(String possibleDish) {
		customerAndOrderView.orderError(possibleDish);
	}

	public void showOrderSoFar(Customer customer) {
		customerAndOrderView.showOrder(customer.getOrder());
		
	}
	
	
}
