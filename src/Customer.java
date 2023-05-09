import java.util.ArrayList;
import java.util.Scanner;
public class Customer {

	
    public String firstName;
    public String lastName;
    public int ID;
    public String allergy;
    Order order;
    
    //ArrayList<Dish> allergies = new ArrayList<Dish>();
    Scanner scanner = new Scanner(System.in);
    
    
    public Customer (String firstName, String lastName, int ID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ID = ID;
    }
    
    public Customer (String firstName, String lastName, String allergy) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.allergy = allergy;
    }
    


public void setName(String new_firstName, String new_lastName) {

    this.firstName = new_firstName;
    this.lastName = new_lastName;

}

@Override
public String toString() {
    return this.firstName + " " + this.lastName + " "  + this.ID;
}



public String toString1() {
    return this.firstName + " " + this.lastName + " "  + this.allergy;
}


}





