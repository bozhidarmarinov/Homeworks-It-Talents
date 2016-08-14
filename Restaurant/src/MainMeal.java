
public class MainMeal extends Meal {

	private static final int MAINMEAL_GRAMAJ_MAXIMUM = 800;
	private static final int MAINMEAL_GRAMAJ_MINIMUM = 400;
	private static final int PRICE_FOR_MAINMEAL = 9;

	public MainMeal(String name, int gramaj) throws OrderException, NameException {
		super(name, gramaj);
		this.setPrice(PRICE_FOR_MAINMEAL);
		if (name == null || name.trim().equals("")) {
			throw new NameException("invalid name of MainMeal");
		}
		if (gramaj < MAINMEAL_GRAMAJ_MINIMUM || gramaj > MAINMEAL_GRAMAJ_MAXIMUM) {
			throw new OrderException("invalid gramaj of MainMeal");
		}
	}

}
