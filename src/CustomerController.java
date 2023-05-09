import java.util.LinkedList;

public class CustomerController {
	private LinkedList<Customer> customerQueue = new LinkedList<Customer>();
	private Customer model; 
	
	public CustomerController() {
		
	}
	
	public void setfirstName(String first, String last) {
		model.setName(first,last);
		
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
	
	
}
