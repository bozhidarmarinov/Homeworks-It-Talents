

public class Desert extends Meal{

	private static final int PRICE_FOR_DESERT = 4;
	private static final int DESERT_GRAMAJ_MAXIMUM = 300;
	private static final int DESERT_GRAMAJ_MINIMUM = 200;

	public Desert(String name, int gramaj) throws OrderException, NameException {
		super(name, gramaj);
		this.setPrice(PRICE_FOR_DESERT);
		if(gramaj<DESERT_GRAMAJ_MINIMUM || gramaj>DESERT_GRAMAJ_MAXIMUM) {
			throw new OrderException("invalid gramaj of Desert");
		}
		if(name==null || name.trim().equals("")) {
			throw new NameException("invalid name of Desert");
		}
	}

	
	
}
