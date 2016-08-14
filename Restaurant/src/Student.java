
public class Student extends Customer{

	private static final int MONEY_OF_EVERY_STUDENT = 100;

	public Student(String name) throws CustomerException, NameException, BillException {
		super(name);
		this.setMoney(MONEY_OF_EVERY_STUDENT);
	}

	
	
}
