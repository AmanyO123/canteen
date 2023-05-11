import java.util.LinkedList;

public class CustomerQueueController {
	private LinkedList<Customer> customerQueue = new LinkedList<Customer>();
	
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
	
	
}
