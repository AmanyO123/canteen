//import foodanddrinks.Food;

public class MVC {

	public static void main(String[] args) {
		
		
	
		  Menu model = new Menu();
		
	      MenuView view = new MenuView();

	      MenuController mc = new MenuController(model, view);

	      // prepare/load menu model data
	     
	      
	      CustomerController cc = new CustomerController();
	      cc.addToQueue(new Customer("Amany", "Osman", 1));
	      cc.addToQueue(new Customer("Mark", "Blokpoel", 2));
	      
	      RestaurantController rc = new RestaurantController(mc, cc);
	      
	      rc.go();
	      
	      
	      
	   }


	}


