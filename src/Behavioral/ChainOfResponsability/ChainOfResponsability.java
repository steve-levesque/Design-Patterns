package Behavioral.ChainOfResponsability;

class Handler {
	int unit;
	Handler nextHandler;
	
	Handler(int unit) {
		this.unit  = unit;
	}
	
	public void add(Handler nextHandler) {
		if (this.nextHandler == null)
			this.nextHandler = nextHandler;
		else
			this.nextHandler.add(nextHandler);
	}
	
	public void dispense(int withdraw) {
		int withdrawAmmount = Math.round(withdraw / unit);
		System.out.println(withdrawAmmount + " bills of " +unit+ " dollar(s).");
		if (this.nextHandler != null)
			this.nextHandler.dispense(withdraw - withdrawAmmount * unit);
	}
}

public class ChainOfResponsability {
	static int[] types = {100, 20, 10, 5, 1};
	static int withdraw = 5432;
	
	public static void main(String[] args) {
		Handler bank = new Handler(types[0]);
		bank.add(new Handler(types[1]));
		bank.add(new Handler(types[2]));
		bank.add(new Handler(types[3]));
		bank.add(new Handler(types[4]));
		
		bank.dispense(withdraw);
	}
}
