
import java.util.ArrayList;
import java.util.Arrays;

public abstract class Customer extends Name {
	private int money;
	private Restaurant restorant;
	private Smetka smetka;
	private Waiter waiter;

	private static final int MONEY_NEEDED_FOR_SETMONEY = 1;

	public Customer(String name) throws CustomerException, NameException, BillException {
		super(name);
		if (name.trim().equals("")) {
			throw new NameException("Invalid customer name");
		}
		this.smetka = new Smetka(new ArrayList<Order>(), 0);
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) throws CustomerException {
		this.money = money;
	}

	public Waiter getWaiter() {
		return waiter;
	}

	public void setWaiter(Waiter waiter) throws CustomerException {
		if (waiter == null) {
			throw new CustomerException("invalid setWaiter");
		}
		this.waiter = waiter;
	}

	public Restaurant getRestorant() {
		return restorant;
	}

	public void setRestorant(Restaurant restorant) throws CustomerException {
		if (restorant == null) {
			throw new CustomerException("invalid setRestorant");
		}
		this.restorant = restorant;
	}

	public Smetka getSmetka() {
		return smetka;
	}

	void order(Order order, Waiter waiter, int broi) throws CustomerException, BillException {
		if (order == null || waiter == null) {
			throw new CustomerException("order() invalid");
		} else {
			if (!(this.getRestorant().getMenu().getDrinks().contains(order))
					&& !(this.getRestorant().getMenu().getMeals().contains(order))) {
				throw new CustomerException("order() invalid");
			}

		}
		if (this.getSmetka().getSum() + order.getPrice() * broi > (this.getMoney() * 9) / 10) {
			throw new CustomerException("nqma pari");
		}
		this.getSmetka().setSum(this.getSmetka().getSum() + order.getPrice() * broi);
		int broqch = 0;
		for (int index = 0; index < broi; index++) {
			if (!(this.getRestorant().getRestorantsMealsAndDrinks().contains(order))) {
				for (int index2 = 0; index2 < broqch; index2++) {
					this.getRestorant().getRestorantsMealsAndDrinks().add(order);
				}
				throw new CustomerException("nqma veche ot tova qstie/pitie v restoranta");
			}
			this.getRestorant().getRestorantsMealsAndDrinks().remove(order);
			broqch++;
		}
		this.getSmetka().setSum(this.getSmetka().getSum() + order.getPrice() * broi);
		for (int index = 0; index < broi; index++) {
			this.getSmetka().getPorychki().add(order);
			this.setWaiter(waiter);
		}
	}

	void check() {
		for (int index = 0; index < this.getSmetka().getPorychki().size(); index++) {

			System.out.println(this.getName() + " si e porychal " + this.getSmetka().getPorychki().get(index).getName());

		}
		System.out.println(this.getName() + " ima da plashta " + this.getSmetka().getSum());

	}

	void pay() throws RestourantException, CustomerException, BillException {
		int tip = 0;
		if (Math.random() < 0.8) {
			tip = (int) ((((Math.random() * 5) + 5) / 100) * this.smetka.getSum());
		}
		this.getRestorant().setCapital(this.getRestorant().getCapital() + this.getSmetka().getSum());
		this.setMoney(this.getMoney() - (this.getSmetka().getSum() + tip));
		this.getSmetka().setSum(0);
		this.getWaiter().setMoneyFromTips(this.getWaiter().getMoneyFromTips() + tip);

	}

}
