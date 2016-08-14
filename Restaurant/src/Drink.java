

public class Drink extends Order {

	public Drink(String name) throws NameException, OrderException {
		super(name);
	if(name==null || name.trim().equals("")) {
		throw new NameException("Invalid drink name");
	}
	}

}
