import java.util.ArrayList;
import java.util.Scanner;

public class DishBase extends IngredientsCompareAllergy implements Dish{
	
	protected IngredientsCompareAllergy inal;
	
	public DishBase(String ingreident) {
		super(ingreident);
		
	}

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
	
	
	
	}
	
	

