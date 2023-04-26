import java.util.Scanner;

public class Order {
	public Dish[] dish;
    public Customer[] order;
    public Customer[] customer;

    public Boolean eatIn = true;
    private int orderSize;
    Scanner scanner = new Scanner(System.in);
    public String allergy;
    
    public Order (int orderSize) {
    	order = new Customer[orderSize];
        this.orderSize = orderSize;
    	
    }
    
    public Order (String allergy) {
    	order = new Customer[orderSize];
        this.allergy = allergy;
    	
    }
   
    
    public void fillOrder() {

        for (int i = 1; i < orderSize + 1; i++) {

            System.out.println(i + ": first name?");
            String first = scanner.next();

            System.out.println(i + ": last name?");
            String last = scanner.next();

            System.out.println(i + ": ID?");
            int ID = scanner.nextInt();

            System.out.println();

            Customer customer = new Customer(first, last, ID);
            order[i - 1] = customer;
        }
    }
    
 public void showOrder() {
        
        for (int i = 1; i < orderSize + 1; i++) {
            System.out.println(order[i - 1]);
        }

    }
 
 


}
