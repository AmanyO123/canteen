import java.util.LinkedList;

import foodanddrinks.Food;
import foodanddrinks.Drink;

public class MenuController {
	
	  	private Menu model;
	    private MenuView view;
	    Order order; 
	    
	    public MenuController() {
	    	model = new Menu();
	    	view = new MenuView();
	    }
	    
	    public MenuController(Menu model, MenuView view)
	    {
	        this.model = model;
	        this.view = view;
	    }
	    
	    public void addFood(Food food) {
	    	model.addFood(food);
	    	
	    }
	    
	    public void setFoods(LinkedList<Food> Foodmenu){
	        model.setFoodlist(Foodmenu);		
	     }

	     public LinkedList<Food> getFoods(){
	        return model.getFoodList();		
	     }
	     
	     public void addDrink(Drink drink) {
	    	 model.addDrink(drink);
	     }

	     public void setDrinks(LinkedList<Drink> Drinkmenu){
	        model.setDrinkList(Drinkmenu);		
	     }

	     public LinkedList<Drink>  getDrinks(){
	        return model.getDrinkList();		
	     }

	     public void updateView(){				
	       
	       view.printMenu(getFoods(), getDrinks());
	       
	     }	
	     
	  }


