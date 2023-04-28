import java.util.LinkedList;
import java.util.Scanner;
import foodanddrinks.*;

public class TestingClass {

	public static void main(String[] args) {
		
	//	ArrayList<DishBase,Dish> allDishes = new ArrayList<DishBase,Dish>();
		// my plan is to make an array list that holds all the orders with drinks and such
		
		
		Order order1 = new Order(0);
		
		Drink cola = new Drink("Cola", 1.50);
		Food ham = new Food("Hamburger", 7.50, 25);
		ham.addIngredient(new Ingredient("meat"));
		ham.addIngredient(new Ingredient("bread"));
			
		
		Scanner scanner = new Scanner(System.in);
        System.out.println("How many orders are being made?");
        int orderSize = scanner.nextInt();
        Order order = new Order(orderSize);
        //fills out the group depending on the info gathered
        order.fillOrder();
        System.out.println("This order is for :");
        //prints out the new group
        order.showOrder();
        
        /**
         *  System.out.println("Any allergies?");
        String checkAl = scanner.next();
        Order order2 = new Order(checkAl);
        order2.checkAllergies();
        order2.showOrder();
         * 
         */
        
    
        
        // maybe using a switch case display menu 
        
        int choice; 
        
        System.out.println("Menu");
        System.out.println("1. " + ham.description());
        System.out.println("2. " + cola.description());
        System.out.println("Enter your choice :");
        
       choice=scanner.nextInt();
        
		switch(choice) {
		case 1 : 
			LinkedList<Ingredient> ingredients = ham.getIngredients();
			System.out.println(ham.description());
			System.out.println("Ingredeints : " + ingredients);
			System.out.println( ham.cost()); 
			System.out.println( "Prep time is : " + ham.prepTime() + "Minutes");
			break;
			
		case 2 : 
			cola.description();
			System.out.println(cola.cost());
			break;
		default : 
			 System.out.println("Item not listed");
		}
       
		//ArrayList<String> ingreidents = ham.getIngredients();
		//System.out.println(ham.description() + drink.description());
		//System.out.println("Ingredeints : " + ingreidents);
		//System.out.println( ham.cost());
		//System.out.println( drink.cost());
		//System.out.println( "Prep time is : " + ham.prepTime() + "Minutes");
		System.out.println("Eating in : " +  !order1.eatIn);
		
		scanner.close();
	}

}
