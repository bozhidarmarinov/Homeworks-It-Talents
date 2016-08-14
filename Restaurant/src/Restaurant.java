
import java.util.ArrayList;

public class Restaurant extends Name {

	private static final int CAPITAL_LIMIT_FOR_SETCAPITAL = 200;
	private static final int RESTAURANT_STARTING_CAPITAL = 1000;

	private String adress;
	private int capital;
	private Menu menu;
	private ArrayList<Waiter> waiters;
	private ArrayList<Customer> customers;
	private ArrayList<Order> restorantsMealsAndDrinks;

	public Restaurant(String name, String adress, Menu menu, ArrayList<Waiter> waiters,
			ArrayList<Order> restorantsMealsAndDrinks) throws RestourantException, NameException {
		super(name);
		this.setCapital(RESTAURANT_STARTING_CAPITAL);
		this.adress = adress;
		this.menu = menu;
		this.waiters = waiters;
		this.restorantsMealsAndDrinks = restorantsMealsAndDrinks;
		if (adress == null || menu == null || waiters == null || restorantsMealsAndDrinks == null
				|| adress.trim().equals("")) {
			throw new RestourantException("invalid restorant");
		}
	}
	public int getCapital() {
		return capital;
	}

	public void setCapital(int capital) throws RestourantException {
		if (capital < CAPITAL_LIMIT_FOR_SETCAPITAL) {
			throw new RestourantException("Falit");
		}
		this.capital = capital;
	}

	public ArrayList<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(ArrayList<Customer> customers) throws RestourantException {
		if (customers == null) {
			throw new RestourantException("Invalid customer");
		}
		this.customers = customers;
	}

	public Menu getMenu() {
		return menu;
	}

	public void setMenu(Menu menu) throws RestourantException {
		if (menu == null) {
			throw new RestourantException("Invalid menu");
		}
		this.menu = menu;
	}

	public ArrayList<Order> getRestorantsMealsAndDrinks() {
		return restorantsMealsAndDrinks;
	}

	public void setRestorantsMealsAndDrinks(ArrayList<Order> restorantsMealsAndDrinks) throws RestourantException {
		if (restorantsMealsAndDrinks == null) {
			throw new RestourantException("Invalid restaurant");
		}
		this.restorantsMealsAndDrinks = restorantsMealsAndDrinks;
	}

	public ArrayList<Waiter> getWaiters() {
		return waiters;
	}

	public void setWaiters(ArrayList<Waiter> waiters) throws RestourantException {
		if (waiters == null) {
			throw new RestourantException("invalid setWaiters");
		}
		this.waiters = waiters;
	}

}
