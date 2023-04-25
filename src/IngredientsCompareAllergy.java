
import java.util.Iterator;
import java.util.*;  

// wanted to have a comparison of ingredients and allergies using the comparable interface.
public abstract class IngredientsCompareAllergy implements Comparable<Ingredient>{
	
	public String allergy;
	//public static ArrayList<Ingredient> ingredients = new ArrayList<Ingredient>();
	public static LinkedList<Ingredient> ingredients = new LinkedList<Ingredient>();
	
	public IngredientsCompareAllergy(String ingreident) {
		this.allergy=ingreident;
		
	}
	
	
	public int compareTo(Ingredient i) { // this compares two strings lexicographically. Returns 0 if they are equal
		return this.allergy.compareTo(i.ingreident);

}
	

	public boolean equals(Ingredient i) { // this returns a boolean if they are equal or not.
		return i.ingreident.equals(this.allergy);
	}
	
	
	
	public void iteration() {
	Iterator<Ingredient> iter = ingredients.iterator();
	while(iter.hasNext()) {
		Ingredient i = iter.next();
		if(allergy.equals(i.getIngredient())) { // not sure if this is correct
			iter.remove();
		}
	}
	
}
}




/**
 * An Iterator is an object that can be used to loop through collections, 
 * like ArrayList and HashSet. It is called an "iterator" because "iterating" is the technical term for looping.
 */

