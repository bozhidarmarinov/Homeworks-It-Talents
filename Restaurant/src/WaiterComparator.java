import java.util.Comparator;

public class WaiterComparator implements Comparator<Waiter> {

	@Override
	public int compare(Waiter waiter1, Waiter waiter2) {

		return waiter1.getMoneyFromTips() < waiter2.getMoneyFromTips() ? -1
				: waiter1.getMoneyFromTips() == waiter2.getMoneyFromTips() ? 0 : 1;
	}

}
