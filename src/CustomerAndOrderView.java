import java.util.*;
import java.util.stream.Collectors;

import foodanddrinks.Food;
import foodanddrinks.Ingredient;

public class CustomerAndOrderView {

	private Scanner scanner = new Scanner(System.in);

	public void displayCustomer(Customer customer) {
		System.out.println(customer.getFirstName() + " " + customer.getLastName() + " " + customer.getId());
	}

	public String requestSingleDish() {
		System.out.println("Would you like to add anything to your order? Type [nothing] to continue.");
		return scanner.next();
	}

	public String requestSingleAllergy() {
		System.out.println("Are you alergic to anthing (else)? Type [nothing] to continue.");
		return scanner.next();
	}

//	    public void fillOrder() {
//
//	        for (int i = 1; i < orderSize + 1; i++) {
//
//	            System.out.println(i + ": first name?");
//	            String first = scanner.next();
//
//	            System.out.println(i + ": last name?");
//	            String last = scanner.next();
//
//	            System.out.println(i + ": ID?");
//	            int ID = scanner.nextInt();
//
//	            System.out.println();
//
//	            Customer customer = new Customer(first, last, ID);
//	            order[i - 1] = customer;
//	        }
//	    }
//	    
	public void displayOrder(Order order) {
		System.out.println("Your order so far: " + order.getDishes());
	}

	public void displayWelcome(Customer customer) {
		System.out.println("Hi, " + customer.getFirstName() + "! How may I help you?");
	}

	public void displayConfirmAllergies(Customer customer) {
		System.out.println("Ok, got it. You're allergic to: " + customer.getAllergies());
	}

	public void displayDishDoesNotExist(String possibleDish) {
		System.out.println("I'm sorry, we don't have " + possibleDish + ".");
	}

	public void displayAllergicToDish(Customer customer, Food dish) {
		List<Ingredient> allergiesInDish = dish.getIngredients() // List<Ingredient>
				.stream() // Steam<Ingredient>
				.filter(ingredient -> {
					return customer.getAllergies().contains(ingredient);
				}) // Filter out all non-allergies
				.collect(Collectors.toList());

		System.out.println("I'm sorry, you told me you're allergic to " + allergiesInDish);
	}

	public void displayOrderError(String possibleDish) {
		System.out.println("Sorry, I don't know what a " + possibleDish + "is.");
	}
}
