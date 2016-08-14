
public class Meal extends Order {

	private int gramaj;

	public Meal(String name, int gramaj) throws OrderException, NameException {
		super(name);
		this.gramaj = gramaj;
	}
}
