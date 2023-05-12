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

	/*
	 * View control logic methods.
	 */
	public void requestAllergies(Customer customer) {
		String allergyInput = customerAndOrderView.requestSingleAllergy();
		if (allergyInput.equals("nothing")) {
			// done
		} else {
			customer.addAllergy(new Ingredient(allergyInput));
			requestAllergies(customer);
		}
	}

	/*
	 * View wrapping methods.
	 */
	public String requestSingleDish(Customer customer) {
		return customerAndOrderView.requestSingleDish();
	}

	public void displayWelcome(Customer customer) {
		customerAndOrderView.displayWelcome(customer);
	}

	public void displayConfirmAllergies(Customer customer) {
		customerAndOrderView.displayConfirmAllergies(customer);
	}

	public void displayDishDoesNotExist(String possibleDish) {
		customerAndOrderView.displayDishDoesNotExist(possibleDish);
	}

	public void displayAllergicToDish(Customer customer, Food dish) {
		customerAndOrderView.displayAllergicToDish(customer, dish);
	}

	public void displayOrderError(String possibleDish) {
		customerAndOrderView.displayOrderError(possibleDish);
	}

	public void displayOrder(Customer customer) {
		customerAndOrderView.displayOrder(customer.getOrder());

	}

}
