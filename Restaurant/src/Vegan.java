
public class Vegan extends Customer{

	private static final int MONEY_OF_EVERY_VEGAN = 300;

	public Vegan(String name) throws CustomerException, NameException, BillException {
		super(name);
		this.setMoney(MONEY_OF_EVERY_VEGAN);
	}

}
