
public class Salad extends Meal{

	private static final int SALAD_GRAMAJ_MAXIMUM = 600;
	private static final int SALAD_GRAMAJ_MINIMUM = 300;
	private static final int PRICE_FOR_SALAD = 5;

	public Salad(String name, int gramaj) throws OrderException, NameException {
		super(name,gramaj);
		this.setPrice(PRICE_FOR_SALAD);
		if(name==null || name.trim().equals("") || gramaj<SALAD_GRAMAJ_MINIMUM || gramaj>SALAD_GRAMAJ_MAXIMUM) {
			throw new OrderException("Invalid Meal");
		}
	}	
}
