package Part8;

import java.util.HashMap;

public class IOU {
	private static HashMap<String, Double> debts;

	public IOU() {
		this.debts = new HashMap<>();
	}
	
	public void setSum(String toWhom, double amount) {
		if (debts.keySet().contains(toWhom)) {
			debts.replace(toWhom, amount);
 		}else {
 			debts.put(toWhom, amount);
 		}
	}
	
	public double howMuchDoIOweTo(String whom) {
		if (debts.keySet().contains(whom)) {
			return debts.get(whom);
		}else {
			return 0.0;
		}
	}

}
