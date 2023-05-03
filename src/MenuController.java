import java.util.LinkedList;

import foodanddrinks.Food;
import foodanddrinks.Drink;

public class MenuController {
	
	  private Menu model;
	    private MenuView view;
	    Order order; 
	    
	    
	    
	    public MenuController(Menu model, MenuView view)
	    {
	        this.model = model;
	        this.view = view;
	    }
	    
	    public void setFoods(LinkedList<Food> Foodmenu){
	        model.setFoodlist(Foodmenu);		
	     }

	     public LinkedList<Food> getFoods(){
	        return model.getFoodList();		
	     }

	     public void setDrinks(LinkedList<Drink> Drinkmenu){
	        model.setDrinkList(Drinkmenu);		
	     }

	     public LinkedList<Drink>  getDrinks(){
	        return model.getDrinkList();		
	     }

	     public void updateView(){				
	        view.printMenu(model.getFoodList(), model.getDrinkList());
	     }	
	     
	     public void displayFoodlist() {
	         view.displayFood(model.getFoodList());
	     }
	     
	     public void displayDrinklist() {
	         view.displayDrink(model.getDrinkList());
	     }
	  }


