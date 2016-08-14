
public class Waiter extends Name {
	private int moneyFromTips;

	public Waiter(String name) throws WaiterException, NameException {
		super(name);
		this.setMoneyFromTips(0);
		if (name == null || name.trim().equals("")) {
			throw new WaiterException("Waiter name is not valid");
		}
	}

	public int getMoneyFromTips() {
		return moneyFromTips;
	}

	public void setMoneyFromTips(int moneyFromTips) {
		this.moneyFromTips = moneyFromTips;
	}

}
