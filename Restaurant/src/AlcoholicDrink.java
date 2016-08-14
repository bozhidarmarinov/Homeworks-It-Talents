

public class AlcoholicDrink extends Drink{

	private static final int PRICE_FOR_ALCOHOLICDRINK = 4;

	public AlcoholicDrink(String name) throws NameException, OrderException {
		super(name);
		this.setPrice(PRICE_FOR_ALCOHOLICDRINK);
		if(name==null || name.trim().equals("")) {
			throw new NameException("Invalid alcoholic drink");
		}
	}

}
