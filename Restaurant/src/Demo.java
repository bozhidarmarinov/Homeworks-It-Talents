
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Demo {

	private static final int NUMBER_OF_CUSTOMERS = 15;
	private static final int NUMBER_OF_DRINKS_IN_RESTAURANT = 20;
	private static final int NUMBER_OF_MEALS_IN_RESTAURANT = 10;

	public static void main(String[] args) throws CustomerException, OrderException, NameException, BillException,
			MenuException, RestourantException, WaiterException {

		try {
			String[] names = { "Ivan", "Stoqn", "Dragan", "Stoil", "Petkan", "Moil", "Gosho", "Stoncho", "Goncho",
					"Poncho", "Troncho", "Stanislav", "Nik", "Bobi", "Gesh" };

			Salad shopska = new Salad("Shopska salata ", 400);
			Salad tarama = new Salad("Tarama", 500);

			MainMeal pyrjola = new MainMeal("Vratna purjola", 500);
			MainMeal riba = new MainMeal("Hek pane", 600);

			Desert cake = new Desert("Cake", 250);
			Desert cheeseCake = new Desert("Cheese cake", 240);

			DrinkWithouthAlchohol cappy = new DrinkWithouthAlchohol("Cappy");
			DrinkWithouthAlchohol water = new DrinkWithouthAlchohol("Water");

			AlcoholicDrink vodka = new AlcoholicDrink("Vodka");
			AlcoholicDrink rakiq = new AlcoholicDrink("Rakiq");

			ArrayList<Meal> meals = new ArrayList<Meal>();
			meals.add(shopska);
			meals.add(tarama);
			meals.add(pyrjola);
			meals.add(riba);
			meals.add(cake);
			meals.add(cheeseCake);
			ArrayList<Drink> drinks = new ArrayList<Drink>();
			drinks.add(vodka);
			drinks.add(rakiq);
			drinks.add(cappy);
			drinks.add(water);

			Menu menu = new Menu(meals, drinks);

			Waiter vankata = new Waiter("Vankata");
			Waiter pancho = new Waiter("Pancho");
			Waiter pesho = new Waiter("Pesho");
			Waiter stoqn = new Waiter("Stoqn");
			Waiter ivanka = new Waiter("Ivanka");

			ArrayList<Waiter> waiters = new ArrayList<Waiter>();
			waiters.add(vankata);
			waiters.add(pancho);
			waiters.add(pesho);
			waiters.add(stoqn);
			waiters.add(ivanka);

			ArrayList<Order> restorantsMealsAndDrinks = new ArrayList<Order>();
			for (int index = 0; index < NUMBER_OF_MEALS_IN_RESTAURANT; index++) {
				restorantsMealsAndDrinks.addAll(meals);
			}
			for (int index = 0; index < NUMBER_OF_DRINKS_IN_RESTAURANT; index++) {
				restorantsMealsAndDrinks.addAll(drinks);
			}

			Restaurant restorant = new Restaurant("Pri Pesho Talanta", "8 Dekemvri", menu, waiters,
					restorantsMealsAndDrinks);

			ArrayList<Customer> customers = new ArrayList<Customer>();
			for (int index = 0; index < NUMBER_OF_CUSTOMERS; index++) {
				double random2 = Math.random();
				if (random2 < 0.2) {
					customers.add(new Vegan(names[(int) (Math.random() * NUMBER_OF_CUSTOMERS)]));
				}
				if (random2 >= 0.2 && random2 < 0.5) {
					customers.add(new Student(names[(int) (Math.random() * NUMBER_OF_CUSTOMERS)]));
				}
				if (random2 >= 0.5) {
					customers.add(new Mutra(names[(int) (Math.random() * NUMBER_OF_CUSTOMERS)]));
				}
			}
			for (Customer customer : customers) {
				customer.setRestorant(restorant);
			}
			System.out.println(restorant.getCapital());

			restorant.setCustomers(customers);
			choose(customers, restorant, 0);
			for (Customer customer : customers) {
				customer.check();

			}
			for (Customer customer : customers) {
				customer.pay();

			}

			System.out.println("Capital of restaurant " + restorant.getName() + " e " + restorant.getCapital());

			Waiter max = new Waiter("MoneyMaker");
			max.setMoneyFromTips(-5);
			for (Waiter waiterss : restorant.getWaiters()) {
				if (waiterss.getMoneyFromTips() > max.getMoneyFromTips()) {
					max = waiterss;
				}
			}
			System.out.println("Waiter with biggest tip " + max.getName() + " s " + max.getMoneyFromTips());

			Collections.sort(restorant.getWaiters(), new WaiterComparator());

			for (int index = 0; index < restorant.getWaiters().size(); index++) {
				System.out.println(restorant.getWaiters().get(index).getName() + " ima "
						+ restorant.getWaiters().get(index).getMoneyFromTips() + " bakshish");
			}
			int countSalad = 0;
			int countMainMeal = 0;
			int countDesert = 0;
			int countAlcohol = 0;
			int countNotAlcohol = 0;
			for (Order order : restorant.getRestorantsMealsAndDrinks()) {
				if (order instanceof Salad) {
					countSalad++;
				}
				if (order instanceof MainMeal) {
					countMainMeal++;
				}
				if (order instanceof Desert) {
					countDesert++;
				}
				if (order instanceof DrinkWithouthAlchohol) {
					countNotAlcohol++;
				}
				if (order instanceof AlcoholicDrink) {
					countAlcohol++;
				}
			}
			System.out.println("Hapvane");
			System.out.println();
			System.out.println("Salads " + countSalad);
			System.out.println("Main meals " + countMainMeal);
			System.out.println("Deserts " + countDesert);
			System.out.println();
			System.out.println("Drinks ");
			System.out.println();
			System.out.println("Alcoholic " + countAlcohol);
			System.out.println("Not alchoholic " + countNotAlcohol);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static void choose(ArrayList<Customer> customers, Restaurant restorant, int index1)
			throws CustomerException, BillException, RestourantException {
		boolean isCorrect = true;

		for (int index = index1; index < customers.size(); index++) {
			Order order = customers.get(index).getRestorant().getRestorantsMealsAndDrinks().get(
					(int) (Math.random() * (customers.get(index).getRestorant().getRestorantsMealsAndDrinks().size())));
			if ((customers.get(index) instanceof Vegan
					&& ((order instanceof Desert) || (order instanceof MainMeal) || (order instanceof AlcoholicDrink)))
					|| ((customers.get(index) instanceof Mutra) && ((order instanceof Desert)
							|| (order instanceof Salad) || (order instanceof DrinkWithouthAlchohol)))) {
				isCorrect = false;
			}
			if (isCorrect) {
				customers.get(index).order(order,customers.get(index).getRestorant().getWaiters().get((int) 
						(Math.random()* (customers.get(index).getRestorant().getWaiters().size()))),((int) (Math.random() * 2) + 1));
			} else {
				choose(customers, restorant, index);
				break;
			}

		}

	}

}
