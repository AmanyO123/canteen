import java.util.LinkedList;


public class CustomerView {
	
	LinkedList<Customer> customer = new LinkedList<Customer>();
	
	 public void printCustomer(LinkedList<Customer> customer){
	      System.out.println("Customers: " + customer );
	     
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
//	    public void showOrder() {
//	        
//	        for (int i = 1; i < orderSize + 1; i++) {
//	            System.out.println(order[i - 1]);
//	        }
//
//	    }
}
