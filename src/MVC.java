
public class MVC {

	public static void main(String[] args) {
		
		
		
	      Menu model  = retriveStudentFromDatabase();

	     
	      MenuView view = new MenuView();

	      MenuController controller = new MenuController(model, view);

	      controller.updateView();

	      //update model data
	      controller.setFoods(LinkedList<Food>("hamburger", 7.50, 15)); // not sure how this will work want to use the whole food class not seperate strings
  
	      controller.updateView();
	   }

	// add a new one ... 
	   private static Menu retriveStudentFromDatabase(){
	      Menu menu = new Menu(null, null);
	      menu.setFoods(LinkedList<Food>("pizza", 7.50, 15));
	      menu.setDrinks(LinkedList<Drink>("cola", 1.40));
	      return menu;
	   }
	}


