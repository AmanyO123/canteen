import java.util.ArrayList;
import java.util.Scanner;

public class DishBase implements Dish{
	
	Scanner scanner = new Scanner(System.in);
	ArrayList<String> ingredients = new ArrayList<String>();

	@Override
	public String description() {
		
		return " Order is : ";
		
	}

	@Override
	public double cost() {
		System.out.print(" Plus Tax is :  ");
		return 1.00;
	}
	
	
	// public ArrayList<String> getIngredients(){
	//	 System.out.println("The ingrediants in this dish are : ");
			
	//		return ingredients;
			
	//	}
	
	

}
