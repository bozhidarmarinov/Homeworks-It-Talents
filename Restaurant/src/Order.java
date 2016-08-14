
public class Order extends Name {

	private int price;

	public Order(String name) throws OrderException, NameException {
		super(name);
		if (name == null || name.trim().equals("")) {
			throw new OrderException("Invalid order name");
		}
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) throws OrderException {
		if (price < 1) {
			throw new OrderException("Invalid price");
		}
		this.price = price;
	}

}
