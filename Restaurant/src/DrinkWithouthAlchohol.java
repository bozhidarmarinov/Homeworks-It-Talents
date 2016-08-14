
public class DrinkWithouthAlchohol extends Drink {

	private static final int PRICE_FOR_NOTALCHOHOLICDRINK = 2;

	public DrinkWithouthAlchohol(String name) throws OrderException, NameException {
		super(name);
		this.setPrice(PRICE_FOR_NOTALCHOHOLICDRINK);
	}

}
