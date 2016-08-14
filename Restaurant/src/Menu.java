
import java.util.ArrayList;

public class Menu {

	ArrayList<Meal> meals = new ArrayList<Meal>();
	ArrayList<Drink> drinks = new ArrayList<Drink>();

	public Menu(ArrayList<Meal> meals, ArrayList<Drink> drinks) throws MenuException {
		super();
		this.meals = meals;
		this.drinks = drinks;
		if (meals == null || drinks == null) {
			throw new MenuException("Invalid Menu");
		}
	}

	public ArrayList<Meal> getMeals() {
		return meals;
	}

	public void setMeals(ArrayList<Meal> meals) throws MenuException {
		if (meals == null) {
			throw new MenuException("Meal is not valid");
		}
		this.meals = meals;
	}

	public ArrayList<Drink> getDrinks() {
		return drinks;
	}

	public void setDrinks(ArrayList<Drink> drinks) throws MenuException {
		if (drinks == null) {
			throw new MenuException("Invalid drink");
		}
		this.drinks = drinks;
	}

}
