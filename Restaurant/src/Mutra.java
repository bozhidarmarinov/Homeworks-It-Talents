

public class Mutra extends Customer {

	private static final int MONEY_OF_EVERY_MUTRA = 500;

	public Mutra(String name) throws CustomerException, NameException, BillException {
		super(name);
		this.setMoney(MONEY_OF_EVERY_MUTRA);
	}

}
