/**
 * 
 * @author Steve Lévesque
 * @GitHub steve-levesque
 * 
 */

package Behavioral.ChainOfResponsibility;
// The handler saves the next handler and so on to create a chain
// that the data has to travel.
 
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
		// If the chain of handlers is not over, the next handler method is called on the data.
		if (this.nextHandler != null)
			this.nextHandler.dispense(withdraw - withdrawAmmount * unit);
	}
}
