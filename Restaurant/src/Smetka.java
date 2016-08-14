
import java.util.ArrayList;

public class Smetka {

	private ArrayList<Order> order = new ArrayList<Order>();
	private int sum;
	public ArrayList<Order> getPorychki() {
		return order;
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) throws BillException {
		if(sum<0) {
			throw new BillException("Invalid sum");
		}
		this.sum = sum;
	}
	public Smetka(ArrayList<Order> orders, int sum) {
		super();
		this.order = orders;
		this.sum = sum;
	}
	
	
}
