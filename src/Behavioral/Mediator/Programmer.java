/**
 * 
 * @author Steve L�vesque
 * @GitHub steve-levesque
 * 
 */

package Behavioral.Mediator;

class Programmer extends Employee {

	Programmer(Mediator mediator) {
		super(mediator);
	}

	@Override
	void use() {
		mediator.notify(this, "Restarting");
	}
	
}
